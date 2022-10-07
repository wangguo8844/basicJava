package main.rrays.Reflect.ReflectTest02;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class Demo {
    /**
     *
     * CLass类的具体的实例：  //都有字节码信息
     * (1)类：外部类，内部类
     * (2)接日
     * (3）注解
     * (4)数组
     * (5)基本数据类型
     * (6)void
     *
     * @param args
     */
    public static void main(String[] args) {
        Class c1 = Person.class;
        Class c2 = Comparable.class;
        Class c3 = Override.class;

        int[] arr1={1,2,3};
        Class c4 = arr1.getClass();
        int[] arr2={5,6,7};
        Class c5 =arr2.getClass();
        System.out.println(c4==c5);

        //(5)基本数据类型
        Class c6 = int.class;
        Class c7 = void.class;


    }



}
