package main.rrays.Arithmetic;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.getenv;
import static java.lang.System.in;

public class Problem2 {
    static int  count=0;
    public static void main(String[] args) {

        int k;
        String s;
        int n;
        Scanner scanner1 = new Scanner(in);
        s=scanner1.nextLine();
        Scanner scanner = new Scanner(in);
        k=scanner.nextInt();
        char limit= (char) (k+96);
        char[] test=new char[s.length()];
        char[] chars = s.toCharArray();
        int i=0;
        char[] a=new char[chars.length];
        for(int j=97;j<j+k&&j<chars[i];j++){
            for (i=0;i<chars.length;i++){
                char c=(char)j;
                System.out.println(c);
            }
        }

        boolean b = checkPalindrome(chars);
        System.out.println(limit);



        System.out.println(Arrays.toString(chars));


    }

    public static boolean checkPalindrome(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
            count++;
            return true;
        }
        return true;
    }


}
