package main.rrays.Reflect.ReflectTest03;

import java.io.Serializable;

//父类
public class Person implements Serializable {

    private int age;
    public String name;

    private void eat(){
        System.out.println("Person--eat");
    }
    public void sleep(){
        System.out.println("Person--sleep");
    }

}
