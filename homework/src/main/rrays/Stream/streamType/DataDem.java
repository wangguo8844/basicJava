package main.rrays.Stream.streamType;

import java.io.*;

public class DataDem {
    public static void main(String[] args) {


        FileInputStream fileInputStream =null;
        DataInputStream dataInputStream = null;
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream=null;
        try {
            //从文件中写入数据流
            fileOutputStream = new FileOutputStream("abc.txt");
            dataOutputStream =  new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeShort(123);
            dataOutputStream.writeDouble(123);
            dataOutputStream.writeUTF("www.rrays.牛逼");

            //从文件写读取数据流
            fileInputStream = new FileInputStream("abc.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
