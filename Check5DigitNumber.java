package Conditionals;

import java.util.Scanner;

public class Check5DigitNumber {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>9999 && num<100000) System.out.println(">The given number is a 5 digit number.");
        else System.out.println(">The given number is not a 5 digit number.");
    }
}
