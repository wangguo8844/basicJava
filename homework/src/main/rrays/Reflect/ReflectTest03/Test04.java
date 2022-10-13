package main.rrays.Reflect.ReflectTest03;

import java.lang.annotation.Annotation;

public class Test04 {
    public static void main(String[] args) {
        Class cls= Student.class;
        //获取运行时类的接口：
        Class[] interfaces = cls.getInterfaces();
        for(Class c:interfaces){
            System.out.println(c);
        }
        //得到父类的接口：
        //先得到父类的字节码信息：
        Class superClass=cls.getSuperclass();
        Class[] superClassInterfaces = superClass.getInterfaces();
        for (Class c: superClassInterfaces){
            System.out.println(c);
        }

        //获取运行时类所在的包；
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());

        //获取运行类的注解：
        Annotation[] annotations = cls.getAnnotations();
        for(Annotation a: annotations){
            System.out.println(a);
        }


    }
}
