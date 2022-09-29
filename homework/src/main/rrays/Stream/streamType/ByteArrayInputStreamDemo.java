package main.rrays.Stream.streamType;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {

    public static void main(String[] args) {

        String str = "www.baidu.com";

//        byte[] buffer = new byte[1024];
        byte[] buffer = str.getBytes();


        //从缓存区中读数据
        ByteArrayInputStream byteArrayInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while ((read = byteArrayInputStream.read())!=-1){
            byteArrayInputStream.skip(4);
            System.out.println((char) read);
        }

        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
