package main.rrays.thread.ticket;


/**
 * 解决缺少数据同步导致错误
 *此时出现的问题：
 * 1、每次在启动线程付象的时候都会创建自己对象的属性值，相当于每个线程操作自己，没有真正意义上实现贡献
 * 解次方法：将共享对象.共享变量设置成static
 * 2、每次访间共享对象的时候，数据不一致了、
 * 解决方法：使用线程同步
 *
 */
public class TicketThread extends Thread{

    private static int ticket = 5 ;

    @Override
    public void run() {
        for (int i = 0 ; i <100; i++){
            if (ticket > 0 ) {
                System.out.println(Thread.currentThread().getName()+"正在出售"+(ticket--)+"张票");
            }
        }
    }

    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
