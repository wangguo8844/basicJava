package main.rrays.thread;

/**
 * 介绍线程类的api方法
 *
 */
public class ThreadApiDemo implements Runnable{
    public static void main(String[] args) {

        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取当前线程对象名称
        System.out.println(thread.getName());
        //获取线程的id
        System.out.println(thread.getId());
        //获取线程的优先级,一般系统的范围是0-10的值，如果没有设置的话，就是默认是5
        System.out.println(thread.getPriority());
        //设置线程池的优先级
        /**
         *优先级越高，执行一定靠前么
         *不一定，只是优先执行的概率比较大
         *
         */
        thread.setPriority(10);
        System.out.println(thread.getPriority());
        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread t1= new Thread(threadApiDemo);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t1.getPriority());
//        for (int i = 0 ;i < 5; i++){
//            System.out.println(Thread.currentThread().getName()+"-----"+i);
//        }

        System.out.println(t1.isAlive());

    }

    @Override
    public void run() {
//        for (int i = 0 ;i < 5; i++){
//            System.out.println(Thread.currentThread().getName()+"-----"+i);
//        }
    }
}
