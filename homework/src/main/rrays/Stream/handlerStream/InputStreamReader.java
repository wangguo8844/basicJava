package main.rrays.Stream.handlerStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamReader {
    public static void main(String[] args) {


        File file = new File("abc.txt");

        FileInputStream fileInputStream = null;
        java.io.InputStreamReader inputStreamReader = null;

        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new java.io.InputStreamReader(fileInputStream,"gbk");
            char[] chars = new char[1024];
            int length = inputStreamReader.read(chars);
            System.out.println(new java.lang.String(chars, 0, length));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStreamReader.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

