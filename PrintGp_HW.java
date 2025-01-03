package Loops;

import java.util.Scanner;

public class PrintGp_HW {
    public static void main(String[] args) {
        System.out.print(">Enter the nth term : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=3,t=4;
        for(int i=1;i<=n;i++) {
            System.out.println(a);
            a *= t;
        }
    }
}