package Pattern_Printing.Triangles;

import java.util.Scanner;

public class StarTriangleHorizontalFlip {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n+1-i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
