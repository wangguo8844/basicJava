package main.rrays.thread;

/**
 * 实现多线程的时候：
 *      1.需要继承Thread 类
 *      2。必须重写run方法，指的是核心执行的逻辑
 *      3. 线程在启动的时候，不要直接调用run方法，而是通过start（）来进行调用
 *      4每次运行相同的代码，出来的结果可能不一样
 *
 *第二种实现方式：使用了代理模式
 *      1.实现Runnable接口
 *      2.重写run方法
 *      3创建Thread 对象 ,将创建好的runnable的子类实现作为thread的构造参数
 *      4.通过thread.start()进行启动
 *两种方式更推荐使用第二种方式，
 *      1、java是单继承，将继承关系留给需要的类
 *      2.方便共享资源同一份资源多个代理访问
 * 线程的生命周期
 *      1、新生状态：处于新生状态的线程有自己的内存空间
 *          当创建好当前线程对象之后，没有启动之前（调用start方法前）
 *          ThreadDemo threadDemo = new ThreadDemo();
 *          RunnableDeo run = new RunnableDemo();
 *      2、就绪状态：准备开始执行，并没有执行（调用start方法后）,所有的线程同时去抢占CUP资源
 *      3、运行状态：当前进程获取到cpu资源之后，就绪队列中的所有线程会去抢占cpu的资源，谁抢到谁执行
 *          抢占到cpu资源，执行代码逻辑开始
 *      4、死亡状态：当运行中的线程正常执行完所有的代码逻辑或者因为异常情况导致程序结束叫做死亡状态
 *          正常结束，stop()、程序抛出未捕获的异常
 *      5、阻塞状态：在程序运行过程中，发生某些异常情况，导致当前线程无法再顺利执行下去，此时会进入阻塞状态，进入阻塞状态的原因消除之后
 *           所有的阻塞队列会再次进入到就结状态中，随机抢占cpu的资源，等待执行
 *         进入的方式：
 *         sleep 方法
 *         等待io资源
 *         join方法（代码中的执行逻辑）
 *
 *
 *      注意：
 *      在多线程的时候，可以实现唤醒和等待的过星，但是晚醒和等特操作的对应不是thread类
 *      而是我们设置的共享对象或者共享变量
 *      多线程并发访问的时候回出现数据安全问题：
 *      解决方式：
 *          1、同步代码块
 *               synchronized(共字资源、共字对单.需要object.的子类){具体执行的代码块)
 *          2、同步方法
 *               将核心的代码逻辑定义成一个方法，使用synchronized关键字进行修饰，此时不需要指定共享对象
 *
 *
 *
 */
public class ThreadDemo extends Thread{


    @Override
    public void run() {
        for (int i = 0 ; i< 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--------------" +i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        for(int i = 0 ;i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"==========" +i);
        }
    }
}
