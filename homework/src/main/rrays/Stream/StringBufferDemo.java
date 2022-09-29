package main.rrays.Stream;

/**
 * 可变字符串
 * StringBuffer:线程安全，效率低
 * StringBuilder:线程不安全，效率高
 *
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        //拼接的时候使用 线程安全
        StringBuffer stringBuffer =new StringBuffer();
        //拼接在一起
        stringBuffer.append(1).append(1.234).append("abc").append(true);
        System.out.println(stringBuffer);
        //实际长度
        System.out.println(stringBuffer.length());
        //初始化16个长度
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer);
        //线程不安全
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(1).append(1.234).append("abc").append(false);
    }
}
