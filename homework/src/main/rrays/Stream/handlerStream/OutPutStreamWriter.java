package main.rrays.Stream.handlerStream;

import java.io.*;

/**
 * 字节byte 是物理概念  本来是一个字节一个字节的处理
 * outputStreamWriter变
 * 字符char 是逻辑概念   现在外面包了一层变成字符，处理效率提升
 *
 *
 * 为什么这么写  1 时间会缩短
 *            2 更加灵活
 */

public class OutPutStreamWriter {


    public static void main(String[] args) {

        File file = new File("abc.txt");

        OutputStreamWriter outPutStreamWriter = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            outPutStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
            outPutStreamWriter.write("89");
            outPutStreamWriter.write("rrays");
            outPutStreamWriter.write("啊hi哟");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流对象的时候建议创建顺序的逆序来进行关闭
            try {
                outPutStreamWriter.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
