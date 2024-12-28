package Conditionals;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        System.out.print(">Enter your percentage : ");
        Scanner sc=new Scanner(System.in);
        int perc=sc.nextInt();
        if (perc>=81) System.out.println(">Your grade is : Very good");
        else if (perc>=61) System.out.println(">Your grade is : Good");
        else if (perc>=41) System.out.println(">Your grade is : Average");
        else System.out.println(">Your grade is Fail");
    }
}
