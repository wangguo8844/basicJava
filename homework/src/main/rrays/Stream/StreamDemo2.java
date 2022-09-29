package main.rrays.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo2 {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("abc.txt");
            int length = 0;
//读出一个字节
//            int read = inputStream.read();
//            System.out.println((char) read);
// 把所有字节循环出来
//            while ((length = inputStream.read() )!=-1){
//                System.out.println((char) length);
//            }
            //添加缓冲区的方式进行读取，每次会将数据添加到缓冲区中，当满了后读取，而不是一个字节读取
            byte[] buffer = new byte[1023];
            while ((length = inputStream.read(buffer))!=-1) {
                System.out.println(new String(buffer,0,length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
