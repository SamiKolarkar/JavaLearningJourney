package TwoDimensionalArray;

import java.util.Scanner;

public class OutputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.print(">Enter the elements : ");
        // Input
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        // Output of Two Dimensional Array
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}