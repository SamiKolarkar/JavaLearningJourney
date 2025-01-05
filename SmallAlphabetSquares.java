package Pattern_Printing.Squares;

import java.util.Scanner;

public class SmallAlphabetSquares {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++) { //rows
            for (int j=1;j<=n;j++) { //columns
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
