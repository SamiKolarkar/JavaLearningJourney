package TwoDimensionalArray;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        if (a[0].length==b.length) {
            // Multiplication is possible
            int[][] c=new int[a.length][b[0].length];
            for (int i=0;i<c.length;i++) {
                for (int j=0;j<c[0].length;j++) {
                    // c[i][j]=a[i][0]*b[0][j]+a[i][0]*b[1][j]+....;
                    for (int k=0;k<a[0].length;k++) {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            // For Printing
            for (int[] array:c) {
                for (int ele:array) {
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println(">Multiplication is not possible.");
        }
    }
}
