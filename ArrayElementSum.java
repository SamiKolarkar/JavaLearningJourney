package Array;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] arr={81,17,45,36,31,100,60};
        int sum=0,prod=1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            prod*=arr[i];
        }
        System.out.print(sum+" "+prod);
    }
}
