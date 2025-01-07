package Array;

public class BasicSyntax {
    public static void main(String[] args) {
        int[] arr=new int[5];
//        (OR)
//        int[] arr;
//        arr=new int[];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.print(arr[0]+" ");
        arr[0]+=99;
        System.out.print(arr[0]+" ");
    }
}
