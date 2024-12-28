package Conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.print(">Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num%2==0) ? "The given number is even." : "The given number is odd");
    }
}
