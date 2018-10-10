package effective_java;

import java.util.*;
import java.util.function.Function;

/**
 * Created by Ray on 2018/9/23.
 */
public class Test {

    public static void main(String[] args) {

//        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
//        s.addAll(Arrays.asList("ray","chay","mckay"));
//        s.forEach(s1 -> {
//            System.out.println(s1);
//        });
//        System.out.println("result: "+ s.getAddCount());

        /**
         *  接口优先于反射机制实例
         */
        /*Class<?> cl = null;
        try {
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }

        Set<String> s = null;
        try {
            s = (Set<String>) cl.newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("Class not accessible");
            System.exit(1);
        } catch (InstantiationException e) {
            System.err.println("Class not instantiable");
            System.exit(1);
        }
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);*/

        /*List<String> strings = new ArrayList<>();
        unsafeAdd(strings, new Integer(42));
        String s = strings.get(0);
        System.out.println(s);*/

//        Class cl = int.class;

        /*List<String>[] arr = new List<String>[2];
        List<Integer> intList = Arrays.asList(42);
        Object[] objects = arr;
        objects[0] = intList;
        String s = arr[0].get(0);*/

        /** 生产者消费者PECS 实例3 **/
//        Set<Integer> integers = new HashSet<Integer>(){{
//            add(1);
//            add(2);
//        }};
//
//        Set<Double> doubles = new HashSet<Double>(){{
//            add(1.2);
//            add(2.2);
//        }};
//
//        Set<Number> numbers = union(integers, doubles);

    }

    /*static Object reduce(List list, Function f, Object initVal) {
        synchronized (list) {
            Object result = initVal;
            for (Object o : list)
                result = f.apply(result, o);
            return result;
        }
    }*/

    /*static Object reduce(List list, Function f, Object initVal) {
        Object[] snapshot = list.toArray();
        Object result = initVal;
        for (E e : snapshot)
            result = f.apply(result, e);
        return result;
    }*/

//    interface Function {
//        Object apply(Object arg1, Object arg2);
//    }

    interface Function<T> {
        T apply(T arg1, T arg2);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

//    public <T> T[] toArray(T[] a) {
//        if (a.length < size) {
//            Arrays.copyOf(el)
//        }
//    }

    static <E> E reduce(List<E> list, Function<E> f, E initVal) {
        E[] snapshot = (E[]) list.toArray();
        E result = initVal;
        for (E o : snapshot)
            result = f.apply(result, o);
        return result;
    }

//    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){
//        s1.add(s2);
//    }

}
