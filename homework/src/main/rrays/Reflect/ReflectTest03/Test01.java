package main.rrays.Reflect.ReflectTest03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取字节码信息
 * 通过字节码信息获取构造器
 * 通过构造器创建对象
 *
 */
public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取字节码信息；
        Class cls = Student.class;

        //通过字节码获得构造器；
        //getConstructors() 只能获取当前运行时类的被public修饰的构造器
        Constructor[] constructors = cls.getConstructors();
        for (Constructor c:constructors){
            System.out.println(c);
        }
        System.out.println("------------------------");
        //getDeclaredConstructors():获取运行时类的全部修饰符的构造器：
        Constructor[] constructors2 = cls.getDeclaredConstructors();
        for (Constructor c:constructors2){
            System.out.println(c);
        }
        System.out.println("----------------------");
        //获取指定的构造器；
        //得到的是空构造器
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);
        //得到两个参数的构造器
        Constructor con2 = cls.getConstructor(double.class, double.class);
        System.out.println(con2);
        //得到一个参数的有参构造器，并且是private修饰的  !!!!需要Declared .getDeclaredConstructor(int.class);
        Constructor con3 = cls.getDeclaredConstructor(int.class);
        System.out.println(con3);

        //有了构造器后就可以创建对象了
        Object o1 = con1.newInstance();
        System.out.println(o1);

        Object o2 = con2.newInstance(180.5, 170.6);
        System.out.println(o2);


    }
}
