package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chengxiao on 2016/11/15.
 */
public class MyHashCodeTest {
    {
        Person person = new Person(123,"科比");
        System.out.println("顶你个肺" + person.name);
    }
    private static class Person{
        int idCard;
        String name;

        public Person(int idCard, String name) {
            this.idCard = idCard;
            this.name = name;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()){
                return false;
            }
            Person person = (Person) o;
            //两个对象是否等值，通过idCard来确定
            return this.idCard == person.idCard;
        }

        @Override
        public int hashCode() {
            Person person = (Person)this;
            System.out.println("hash=>" + person.idCard);
            return Integer.valueOf(idCard).hashCode();
        }
    }
    public static void main(String []args){
//        HashMap<Person,String> map = new HashMap<Person, String>();
//        Person person = new Person(1234,"乔峰");
//        //put到hashmap中去
//        map.put(person,"天龙八部");
//        //get取出，从逻辑上讲应该能输出“天龙八部”
//        System.out.println("结果:"+map.get(new Person(1234,"萧峰")));
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(null, 2);
        map.put(null, 3);
        System.out.println(map.get(null));
    }
}