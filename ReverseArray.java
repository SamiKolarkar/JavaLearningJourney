package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,30,50,45,60};
//        for (int i=0;i<=arr.length/2;i++) {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
        int n=arr.length;         //TWO POINTER TECHNIQUE
        int i=0,j=n-1;
        while (i<=j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
}
