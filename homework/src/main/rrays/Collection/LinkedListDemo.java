package main.rrays.Collection;

import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");
        System.out.println(linkedList);
        linkedList.add(2,"rrays");
        System.out.println(linkedList);
        linkedList.peek();
    }
}
