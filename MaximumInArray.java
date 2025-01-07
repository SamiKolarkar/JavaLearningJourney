package Array;

import java.util.Scanner;

public class MaximumInArray {
    public static void main(String[] args) {
        System.out.print(">Enter the array size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print(">Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
//        int mx=arr[0];
//        for (int i = 1; i < size; i++) {
//            if (arr[i]>mx) mx=arr[i];
//        }
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            mx=Math.max(mx,arr[i]);
        }
        System.out.println(">The maximum of the array is : "+mx);
    }
}
