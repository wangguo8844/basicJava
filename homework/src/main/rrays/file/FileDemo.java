package main.rrays.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());


        File file2 = new File("c:/");
        System.out.println(file2.isDirectory());
        String[] list = file2.list();
        for (String str:list) {
            System.out.println(list.toString());
        }

        File[] files = file2.listFiles();
        for (File f: files) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
