package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num>0) {
            System.out.println("> " + num);
        } else {
            System.out.println("> "+num*(-1));
//          System.out.println("> "+-num);
        }
    }
}
