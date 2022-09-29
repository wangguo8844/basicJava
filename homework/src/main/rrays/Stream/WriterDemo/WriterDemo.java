package main.rrays.Stream.WriterDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 什么时候需要加writer.flush()，什么时候不需要加writer.flush()       writer.flush();
 *      最保险的方式，在输出流关闭之前，每次都flush一下，然后再关时
 *      当某·个输出流对象中带有缓冲区的时候，就需要进行flush，不建议大家去记住每个输出流的分类
 *
 */

public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("writer.txt");
        Writer writer = null;

        try {
            writer = new FileWriter(file);
            writer.write("www.Andrew.com");
            writer.write("还有谁");


            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
