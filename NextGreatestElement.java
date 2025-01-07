package Array;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int[] ans=new int[arr.length];
//        Method I  ------>Brute Force
//        ans[arr.length-1]=-1;
//        int mx=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++) {
//            for (int j=i+1;j<arr.length;j++) {
//                mx=Math.max(arr[j],mx);
//            }
//        }
//        Method II  -------->Optimized Solution
        ans[arr.length-1]=-1;
        int mx=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--) {
            ans[i]=mx;
            mx=Math.max(mx,arr[i]);
        }
        for (int ele:ans) {
            System.out.print(ele+" ");
        }
    }
}
