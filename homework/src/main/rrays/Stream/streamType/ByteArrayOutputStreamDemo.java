package main.rrays.Stream.streamType;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {

        ByteArrayOutputStream  byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(123);
        try {
            byteArrayOutputStream.write("www.baidu.com".getBytes());
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
