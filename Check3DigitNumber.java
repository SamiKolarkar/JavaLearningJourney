package Conditionals;

import java.util.Scanner;

public class Check3DigitNumber {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>99 && num<1000) System.out.println(">The given number is a 3 digit number.");
        else System.out.println(">The given number is not a 3 digit number.");
    }
}
