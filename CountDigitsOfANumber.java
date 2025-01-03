package Loops;

import java.util.Scanner;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(">The sum of digits is : "+sum);
    }
}
