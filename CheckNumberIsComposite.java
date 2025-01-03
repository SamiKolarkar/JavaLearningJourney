package Loops;

import java.util.Scanner;

public class CheckNumberIsComposite {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean x=true;
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                x=false;
                System.out.println(">" + n + " is a composite number.");
                break;
            }
        }
        if(n==1) System.out.println(">The given number is neither prime nor composite.");
        else if (x==true) System.out.println(">The given number is a prime number.");
    }
}
