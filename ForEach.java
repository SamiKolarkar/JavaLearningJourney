package TwoDimensionalArray;

public class ForEach{
    public static void main(String[] args) {
        int[] arr={4,7,8,2};
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        int[][] brr={{1,2,3},{4,5,6}};
        for (int[] ele:brr) {
            for (int x:ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
