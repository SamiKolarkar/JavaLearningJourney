package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.print(">Enter the array size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print(">Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            mx=Math.max(mx,arr[i]);
        }
        int mx2=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i]!=mx) mx2=Math.max(arr[i],mx2);
        }
        System.out.println(">The second largest of the array is : "+mx2);
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                secondLargest = largest;
//                largest = arr[i];
//            } else if (arr[i] > secondLargest && arr[i]
//                    != largest) {
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println(largest+secondLargest);

    }
}
