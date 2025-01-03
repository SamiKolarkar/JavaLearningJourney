package Loops;

import java.util.Scanner;

public class PrintAP {
    public static void main(String[] args) {
        System.out.print(">Enter the nth number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=(3*n+1);i+=3) {
            System.out.println(i);
        }
//        int a=4,d=3;
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a+=d;
    }
}