package Array;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr={30,10,40,23,89,34};
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] nums=arr; // Shallow copy
//        nums[0]=70;
//        System.out.print(arr[0]);
        int[] arr2= Arrays.copyOf(arr,arr.length);
        arr[0]=100;
        System.out.print(arr2[0]);
//        for (int i=0;i<arr.length;i++) {
//            System.out.print(nums[i]+" ");
//        }
    }
}
