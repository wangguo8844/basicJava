package main.rrays.ThreadPool.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i< 20; i++) {
            /**
             *
             * 如果要返回值 就用submit
             * 如果不需要就用execute
             */
            Future<String> future = executorService.submit(new Task(i));
            try {
                String s = future.get();
                System.out.println(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
