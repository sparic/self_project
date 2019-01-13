package thinking_in_java.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2018/10/28.
 */
class Pet {

}

class Dog extends Pet {}

class Cat extends Pet {}

public class CheckedLIst {

    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        oldStyleMethod(dogs1);
        try {
            for (Dog dog : dogs1) {
                System.out.println("one dog: " + dog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------");
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<>(), Dog.class);
        try {
            oldStyleMethod(dogs2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
        pets.add(new Dog());
        System.out.println("---------------------");
        pets.add(new Cat());
    }
}
