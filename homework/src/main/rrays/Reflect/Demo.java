package main.rrays.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception{
        //类
        String str = "main.rrays.Reflect.Alipay";

        //反射
        Class cls = Class.forName(str);//c1s-->C1ass类具体的对象--》A1iPay字节码信息
        Object o  =cls.newInstance();
        Method method = cls.getMethod("pay");
        method.invoke(o);
    }
}
