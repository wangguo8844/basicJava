package main.rrays.Reflect.ReflectTest02;

public class Test {
    public static void main(String[] args) throws Exception {
        //案例：以person的字节码信息为案例
        //方法1、通过getClass（）方法获取
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
        //方法2、
        Class c2 = Person.class;
        System.out.println(c2);
        //注意：方式1方法2 不常用

        //方法3、用的最多。动态的获得字节码信息、调用CLass类提供的静态方法forName
        Class c3 = Class.forName("main.rrays.Reflect.ReflectTest02.Person");
        //方法4、利用类的加载器（了解技能点）
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("main.rrays.Reflect.ReflectTest02.Person");

    }
}
