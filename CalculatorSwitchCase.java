package Conditionals;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        System.out.print(">Enter the 1st number : ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print(">Enter the 2nd number : ");
        int n2=sc.nextInt();
        System.out.print(">Enter the operation : ");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(">The result is :"+(n1+n2));
                break;
            case '-':
                System.out.println(">The result is :"+(n1-n2));
                break;
            case '*':
                System.out.println(">The result is :"+(n1*n2));
                break;
            case '/':
                System.out.println(">The result is :"+(n1/n2));
                break;
            default:
                System.out.println(">Invalid Operator");
        }
    }
}
