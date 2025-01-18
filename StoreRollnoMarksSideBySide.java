package TwoDimensionalArray;

import java.util.Scanner;

public class StoreRollnoMarksSideBySide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        System.out.print(">Enter roll no. and marks : ");
        for (int i=0;i<=3;i++) {
            for (int j=0;j<=1;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int[] ele:arr) {
            for (int x:ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
