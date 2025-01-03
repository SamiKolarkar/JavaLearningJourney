package Loops;

import java.sql.SQLType;
import java.util.Scanner;

public class PrintGp {
    public static void main(String[] args) {
        System.out.print(">Enter the nth term : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,t=2;
        for(int i=1;i<=n;i++) {
            System.out.println(a);
            a*=t;
        }
    }
}
