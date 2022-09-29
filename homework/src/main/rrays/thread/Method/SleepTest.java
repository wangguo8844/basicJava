package main.rrays.thread.Method;

public class SleepTest {
    public static void main(String[] args) {

        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i < 5;i++){
            System.out.println(Thread.currentThread().getName()+"========="+i);
            if (i==2){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
