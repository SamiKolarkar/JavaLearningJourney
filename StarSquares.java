package Pattern_Printing.Squares;

import java.sql.SQLType;
import java.util.Scanner;

public class StarSquares {
    public static void main(String[] args) {
        System.out.print(">Enter the side of square : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) { //rows
            for (int j=0;j<n;j++) { //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
