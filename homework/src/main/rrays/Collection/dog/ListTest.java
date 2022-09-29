package main.rrays.Collection.dog;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List list = new ArrayList();
        Dog d1 = new Dog("大黄","red");
        Dog d2 = new Dog("大黄1","black");
        Dog d3 = new Dog("大黄2","yellow");

        list.add(d1);
        list.add(d2);
        list.add(d3);
        Dog d4 = new Dog("大黄1","black");

        System.out.println(list);
        System.out.println(list.contains(d4));
        System.out.println(list);



    }
}
