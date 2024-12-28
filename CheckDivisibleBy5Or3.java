package Conditionals;

import java.util.Scanner;

public class CheckDivisibleBy5Or3 {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num%5==0 || num%3==0) System.out.println(">The number is divisible by 5 or 3.");
        else System.out.println(">The given number is not divisible by 5 or 3");
    }
}
