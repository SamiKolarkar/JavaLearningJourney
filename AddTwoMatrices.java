package TwoDimensionalArray;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a={{1,9,2},{3,7,4},{8,5,6}};
        int[][] b={{9,3,7},{8,6,5},{2,4,1}};
        int m=a.length,n=a[0].length;
//        int[][] res=new int[m][n];
//        for (int i=0;i<m;i++) {
//            for (int j=0;j<n;j++) {
//                res[i][j]=a[i][j]+b[i][j];
//            }
//        }
//        for (int[] ele:res) {
//            for (int x:ele) {
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }

        //Without using extra array
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int[] ele:a) {
            for (int x:ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
