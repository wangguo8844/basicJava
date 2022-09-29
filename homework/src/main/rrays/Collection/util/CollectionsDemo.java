package main.rrays.Collection.util;

import java.util.*;

/**
 *工具类 Collections 很好用
 */

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Collections.addAll(list,"faffe","f","g");
        System.out.println(list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }else if (o1.length()<o2.length()) {
                    return -1;
                }else return 1;
            }
        });
        System.out.println(list);

        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }else if (o1.length()<o2.length()) {
                    return -1;
                }else return 1;
            }
        });
        System.out.println(list);
        //二分查找，需要先进行排序
        System.out.println(Collections.binarySearch(list, "b"));


    }



}
