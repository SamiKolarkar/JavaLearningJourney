package Array;

import java.util.Scanner;

public class MinimumInArray {
    public static void main(String[] args) {
        System.out.print(">Enter the array size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print(">Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int mn=Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            mn=Math.min(mn,arr[i]);
        }
        System.out.println(">The minimum in the array is : "+mn);
    }
}
