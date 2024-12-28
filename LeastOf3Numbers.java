package Conditionals;

import java.util.Scanner;

public class LeastOf3Numbers {
    public static void main(String[] args) {
        System.out.print(">Enter the 1st number : ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print(">Enter the 2nd number : ");
        int n2=sc.nextInt();
        System.out.print(">Enter the 3rd number : ");
        int n3=sc.nextInt();
        if (n1<=n2 && n1<=n3) System.out.println(">The greatest number is : "+n1);
        else if (n2<=n1 && n2<=n3) System.out.println(">The greatest number is : "+n2);
        else System.out.println(">The greatest number is : "+n3);
    }
}
