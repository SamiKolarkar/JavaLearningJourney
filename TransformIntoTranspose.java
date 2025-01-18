package TwoDimensionalArray;

public class TransformIntoTranspose {
    public static void print(int[][] arr){
        for (int[] ele:arr) {
            for (int x:ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void reverse(int[] arr) {
        int i=0,j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i=0;i<arr.length;i++) {
//            for (int j=0;j<=i;j++) {
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        // rotate ------>reverse each row
        for (int[] ele:arr) {
            reverse(ele);
        }
        print(arr);
    }
}
