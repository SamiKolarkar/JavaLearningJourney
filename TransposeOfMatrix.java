package TwoDimensionalArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int[][] transpose=new int[arr[0].length][arr.length];
        // similar to col wise printing
        for (int j=0;j<arr[0].length;j++) { //columns
            for (int i=0;i<arr.length;i++) { //row  s
                transpose[j][i]=arr[i][j];
            }
        }
        for (int[] ele:transpose) {
            for (int x:ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
