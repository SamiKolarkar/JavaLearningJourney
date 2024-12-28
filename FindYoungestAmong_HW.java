package Conditionals;

import java.util.Scanner;

public class FindYoungestAmong_HW {
    public static void main(String[] args) {
        System.out.print(">Enter the 1st number : ");
        Scanner sc=new Scanner(System.in);
        int ram=sc.nextInt();
        System.out.print(">Enter the 2nd number : ");
        int shyam=sc.nextInt();
        System.out.print(">Enter the 3rd number : ");
        int ajay=sc.nextInt();
        if (ram<shyam) {
            if (ram<ajay) System.out.println(">The youngest among them is "+ram);
            else System.out.println(">The youngest among them is "+shyam);
        }
        else {
            if (shyam<ajay) System.out.println(">The youngest among them is "+shyam);
            else System.out.println(">The youngest among them is "+ajay);
        }
    }
}
