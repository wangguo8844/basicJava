package main.rrays.Collection.util;


import java.util.Arrays;
import java.util.List;

/**
 * Arrays 提供了数组操作的工具类，包含很多方法
 * 集合和数组之间的转换
 * 数组转化成list
 *
 *
 */
public class ArraysDemo {

    public static void main(String[] args) {

        //1
        int[] arry = new int[]{1,2,3,4,5};
        List<int[]> ints = Arrays.asList(arry);

        //2
        List<Integer> integers = Arrays.asList(1,2,3,4,5);

        //list转换成数组
        Object[] objects = ints.toArray();


    }
}
