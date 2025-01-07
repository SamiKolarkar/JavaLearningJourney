package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.print(">Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.print(">Enter the array size : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print(">Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        boolean bool=false;
        for (int i = 0; i < size; i++) {
            if (arr[i]==target) {
                bool=true;
                break;
            }
        }
        if (bool) System.out.println(">Element Found.");
        else System.out.println(">Element Not Found.");
    }
}
