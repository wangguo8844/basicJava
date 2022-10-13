package main.rrays.Reflect.ReflectTest03;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 获取方法、异常
 *
 *
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取运行时类的字节码信息
        Class cls= Student.class;
        //获取方法
        //getMethods:获取运行时类的方法还有所有父类中的方法（被public.修饰）
        Method[] methods = cls.getMethods();
        for (Method m:methods){
            System.out.println(m);
        }
        System.out.println("------------------------");
        //getDeclaredMethods():获取运行时类的方法还有所有父类中的方法
        Method[] methods1 = cls.getDeclaredMethods();
        for (Method m: methods1){
            System.out.println(m);
        }
        System.out.println("------------------------");
        //获取指定的方法
        Method showInfo1 = cls.getMethod("showInfo");
        System.out.println(showInfo1);
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(showInfo2);
        Method work = cls.getDeclaredMethod("work",int.class);
        System.out.println(work);
        //获取方法的具体结构
        /*
        @注解
         修饰符 返回值 类型 方法名（参数列表）throws XXXXX(}
         */
        //名字
        System.out.println(work.getName());
        //修饰符
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //返回值
        System.out.println(work.getReturnType());
        //参数列表
        Class[] parameterTypes = work.getParameterTypes();
        for (Class c :parameterTypes){
            System.out.println(c);
        }
        //获取注解
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for (Annotation a: annotations){
            System.out.println(a);
        }

        System.out.println("------------------------");
        //获取异常
        Class<?>[] exceptionTypes = myMethod.getExceptionTypes();
        for (Class c: exceptionTypes){
            System.out.println(c);
        }

        //调用方法；
        Object o = cls.newInstance();
        myMethod.invoke(o); //调用o对象的myMethod方法
        System.out.println(showInfo2.invoke(o, 12, 45));


    }
}
