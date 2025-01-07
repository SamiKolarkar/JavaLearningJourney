package Array;

import java.util.Scanner;

public class InitializeArray {
    public static void main(String[] args) {
//        System.out.print(">Enter the size of the array : ");
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] arr=new int[n];
        int[] arr={10,20,30,40,50};
//        for (int i=0;i<=n-1;i++) {
//            arr[i]=sc.nextInt();
//        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
