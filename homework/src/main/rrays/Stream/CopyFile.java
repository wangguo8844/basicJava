package main.rrays.Stream;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File file = new File("abc.txt");


        File file2 = new File("aaa.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file2);
            byte[] buff = new byte[1024];
            inputStream.read(buff);
            outputStream.write(buff);

            //完成数据传输
            int length = 0;
            while((length =inputStream.read(buff))!=-1){  ///每次忘
                outputStream.write(buff);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }


}
