package Array;

public class MoveNegativeAndPositivess {
    public static void main(String[] args) {
        int[] arr = {-2, 8, 1, -5, 6, -3, 9, -11};
        int i=0,j=arr.length-1;
        while (i<j) {
            if (arr[i]<0) i++;
            else if (arr[j]>0) j--;
            else if (arr[i]>0 && arr[j]<0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
}
