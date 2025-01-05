package Pattern_Printing.Squares;

import java.util.Scanner;

public class StarRectangles {
    public static void main(String[] args) {
        System.out.print(">Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.print(">Enter the number of columns : ");
        int n=sc.nextInt();
        for (int i=0;i<m;i++) { //rows
            for (int j=0;j<n;j++) { //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
