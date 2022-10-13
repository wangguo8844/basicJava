package main.rrays.Reflect.ReflectTest03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取属性
 *
 *
 */
public class Test02 {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        //获取运行时类的字节码信息
        Class cls = Student.class;
        //获取属性  只能获取public
        Field[] fields=cls.getFields();
        for(Field f:fields){
            System.out.println(f);
        }
        System.out.println("_________________");
        //获取所有属性  可以获取protected private
        Field[] declaredField = cls.getDeclaredFields();
        for (Field f:declaredField){
            System.out.println(f);
        }
        System.out.println("___________________");
        //获取指定的属性
        Field score = cls.getField("score");
        System.out.println(score);
        //获取指定的属性(private) 用Declared
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("________________________");
        //属性的具体结构：
        //获取修饰符
        int modifiers = sno.getModifiers(); //修饰符有很多
        System.out.println(modifiers); // 每个数的含义不同，可以去Modifier源码里看！！！多个修饰符时可以相加的！！
        System.out.println(Modifier.toString(modifiers));//数变成实际意义 用Modifier.toString()
        //获取属性的数据类型：
        Class type = sno.getType();
        System.out.println(type);
        //获取属性的名字：
        String name = sno.getName();
        System.out.println(name);
        System.out.println("_________________");
        //给属性赋值；(给属性设置值，必须要有对象)
        Field sco = cls.getField("score");
        Object obj = cls.newInstance();
        sco.set(obj,98);//给obj这个对象的score属性设置具体的值，这个值为98
        System.out.println(obj);


    }
}
