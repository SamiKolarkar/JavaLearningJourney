package Conditionals;

import java.util.Scanner;

import static java.lang.System.*;

public class ProfitLoss {
    public static void main(String[] args) {
        out.print(">Enter the selling price : ");
        Scanner sc = new Scanner(in);
        int sp = sc.nextInt();

        System.out.print(">Enter the cost price : ");
        int cp = sc.nextInt();

        if (sp > cp){
            System.out.println(">You have incured profit.");
            System.out.println(">You have incured a profit of "+(sp-cp));
        } else if (sp == cp) {
            System.out.println(">You have made no profit no loss.");
        } else {
            System.out.println(">You have incured a loss.");
            System.out.println(">You have incured a loss of "+(cp-sp));
        }
//        (OR)
//        if (sp > cp) System.out.println(">You have incured profit of "+(sp - cp));
//        if (sp < cp) System.out.println(">You have incured a loss of "+(cp - sp));
//        if (sp == cp) System.out.println(">You have made no profit no loss.");
    }

    public static class TernaryOperator {
    }
}
