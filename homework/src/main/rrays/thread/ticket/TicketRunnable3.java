package main.rrays.thread.ticket;

/**
 *同步方法
 *
 */
public class TicketRunnable3 implements Runnable{

    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.sale();
        }
    }

    public synchronized void sale() {

        synchronized (this){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"几张");
            }
        }
    }

    public static void main(String[] args) {

        TicketRunnable3 ticket = new TicketRunnable3();
        Thread t1 = new Thread(ticket,"A");
        Thread t2 = new Thread(ticket,"B");
        Thread t3 = new Thread(ticket,"C");
        Thread t4 = new Thread(ticket,"D");



        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
