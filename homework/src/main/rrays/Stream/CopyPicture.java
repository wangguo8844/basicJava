package main.rrays.Stream;

import java.io.*;


/**
 * 字节byte,FileInputStream可以处理万物，字符char,FileReader只能处理纯文本
 *
 */

public class CopyPicture {
    public static void main(String[] args) {
/*        //图片型式无法处理
        FileReader reader =null;
        FileWriter writer = null;

        try {
            reader = new FileReader("1.jpg");
            writer = new FileWriter("2.jpg");

            int length = 0;
            char[] chars = new char[1024];
            while((length = reader.read(chars))!=-1) {
                writer.write(chars);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("1.jpg");
            outputStream = new FileOutputStream("2.jpg");

            int length = 0;
            byte[] buff = new byte[1024];
            while ((length = inputStream.read(buff)) != -1) {
                outputStream.write(buff);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
