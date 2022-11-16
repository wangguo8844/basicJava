package com.rrays.dp.singleton1;

/**
 * * 大臣是天天要面见皇帝，今天见的皇帝和昨天的，前天不一样那就出问题了！
 *
 *单例模式很简单，就是在构造函数中多了加一个构造函数，访问权限是 private 的就可以了，这个模
 * 式是简单，但是简单中透着风险，风险？什么风险？在一个 B/S 项目中，每个 HTTP Request 请求到 J2EE
 * 的容器上后都创建了一个线程,每个线程都要创建同一个单例对象,怎么办
 */
public class Minister {
    public static void main(String[] args) {

        Emperor emperor1 = Emperor.getInstance();
        System.out.println(emperor1);
        emperor1.emperorInfo();
        Emperor emperor2 = Emperor.getInstance();
        System.out.println(emperor2);
        Emperor.emperorInfo();
        Emperor emperor3 = Emperor.getInstance();
        System.out.println(emperor3);
        emperor1.emperorInfo();

        //三天见的皇帝都是同一个人，荣幸吧！
    }
}
