package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print(">Enter the 1st number : ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print(">Enter the 2nd number : ");
        int n2=sc.nextInt();
        System.out.print(">Enter the operation : ");
        char op=sc.next().charAt(0);
        if (op=='+') System.out.println(">The result is : "+(n1+n2));
        else if (op=='-') System.out.println(">The result is : "+(n1-n2));
        else if (op=='*') System.out.println(">The result is : "+(n1*n2));
        else System.out.println(">The result is : "+(n1/n2));
    }
}
