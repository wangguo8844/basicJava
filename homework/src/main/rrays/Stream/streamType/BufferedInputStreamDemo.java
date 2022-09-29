package main.rrays.Stream.streamType;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            //因为有需要另外一个流 的情况 ，此类为处理流BufferedInputStream
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int read = 0;
            while ((read = bufferedInputStream.read())!= -1){
                //
                System.out.println((char) read);
            }
            bufferedInputStream.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
