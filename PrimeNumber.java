package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean x=true;
        for (int i=2;i<n;i++) {
            if (n%i==0) {
                x=false;
                break;
            }
        }
        if (x==true) System.out.println(">The given number is a prime number.");
        else System.out.println(">The given number is not a prime number.");
    }
}
