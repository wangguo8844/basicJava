package main.rrays.Arithmetic;


import java.util.Scanner;

import static java.lang.System.in;

/**
 *
 * 首项末项
 *
 */
public class Problem1 {
    public static void main(String[] args) {

        int n;
        int sum=0;
        int count=0;
        Scanner scanner= new Scanner(in);
        n=scanner.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                sum=(i+j)*(j-i+1)/2;
                if(sum==n){
                    count++;

                }
                else if(sum>n){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
