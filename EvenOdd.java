package Conditionals;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print(">Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0) System.out.println(">"+num+" number is even.");
        if (num%2!=0) System.out.println(">"+num+" number is odd.");
//        else System.out.println("> "+num+" number is odd.");
    }
}
