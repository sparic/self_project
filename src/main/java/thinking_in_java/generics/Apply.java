package thinking_in_java.generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ray.fu
 * Created by Administrator on 2018/11/11.
 */
public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq) {
                f.invoke(t, args);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public void rotate() {
        System.out.println(this + "rotate");
    }

    public void resize(int newSize, String name) {
        System.out.println(this + name + " resize " + newSize);
    }
}

class Square extends Shape {}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++) {
                add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest {

    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Shape());
        }
        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class, String.class), 5, "牛魔王");
        List<Square> squares = new ArrayList<Square>();
        for (int i = 0; i < 10; i++) {
            squares.add(new Square());
        }
        Apply.apply(squares, Shape.class.getMethod("rotate"));
        Apply.apply(squares, Shape.class.getMethod("resize", int.class, String.class), 5, ", 孙悟空");

        Apply.apply(new FilledList<Shape>(Shape.class, 10),
                Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<Shape>(Square.class, 10),
                Shape.class.getMethod("rotate"));

        SimpleQueue<Shape> shapeQ = new SimpleQueue<Shape>();
        for (int i = 0; i < 5; i++) {
            shapeQ.add(new Shape());
            shapeQ.add(new Square());
        }
        Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
    }
}