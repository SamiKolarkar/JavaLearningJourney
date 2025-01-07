package Array;

public class FindNextPermutationsOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2}; // {1,3,2} // {2,1,3} // {2,3,1} // {3,1,2} // {3,2,1}
        int[] nums=new int[arr.length];
        int i=arr.length-2,j=arr.length-1;
        if (arr[i] < arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            reverse(arr, i - 1, i);
            reverse(arr, i - 1, arr.length-1);

        }
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
    public static void reverse(int[] arr,int i,int j) {
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
}