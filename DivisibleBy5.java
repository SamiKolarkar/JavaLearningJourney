package Conditionals;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data%5==0) System.out.println("> "+data+" is divible by 5");
        else System.out.println("> "+data+" is not divible by 5");
    }
}
