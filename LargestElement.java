package TwoDimensionalArray;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                mx=Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(">The max element is : "+mx);
    }
}
