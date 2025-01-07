package Array;

public class SortZerosOnes {
    public static void main(String[] args) {
//        int[] arr={1,1,0,1,0,0,1,0,1};
//        int z=0,o=0;
//        for(int ele:arr) {
//            if (ele==0) z+=1;
//            else o+=1;
//        }
//        for(int i=0;i<arr.length;i++) {
//            if (i<z) arr[i]=0;
//            else arr[i]=1;
//        }
//        for (int ele:arr) {
//            System.out.print(ele+" ");
//        }
        int[] arr={0,0,1,1};
        int i=0,j=arr.length-1;
        while (i<j) {
            if (arr[i]==0) i++;
            else if (arr[j]==1) j--;
//            else if (i>j) break;
            else if (arr[i]==1 && arr[j]==0) {
                arr[i]=0;arr[j]=1;
                i++;j--;
            }
        }
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
}
