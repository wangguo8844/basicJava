package main.rrays.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lambdaDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runrunrun");
            }
        });
        thread.start();

        System.out.println("-----------------");

        new Thread(()->{
            System.out.println("run2run2run2");
        }).start();

        System.out.println("---------------");

        List<String> list = Arrays.asList("java","python","go");
        Collections.sort(list);//从小到大
        System.out.println(list);
        System.out.println("---------------");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o2.length()-o1.length();
            }
        });
        System.out.println(list);
        System.out.println("---------------");
        Collections.sort(list,(e1,e2)->e1.length()-e2.length());
//        System.out.println(list);
        list.forEach(System.out::println);

    }
}
