package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a={11,33,42,71};
        int[] b={26,54,69,81};
        int[] c=new int[a.length+b.length];
//        int i=0,j=0,k=0;
//        Merging
//        while (i<a.length && j<b.length) {
//            if (a[i]<=b[j]) {
//                c[k]=a[i];
//                i++;
//            }
//            else {
//                c[k]=b[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < a.length) {
//            c[k] = a[i];
//            i++;
//            k++;
//        }
//        while (j < b.length) {
//            c[k] = b[j];
//            j++;
//            k++;
//        }
        int i=a.length-1,j=b.length-1,k=c.length-1;
        while (i>=0 && j>=0) {
            if (a[i]>b[j]) {
                c[k]=a[i];
                i--;k--;
            }
            else {
                c[k]=b[j];
                j--;k--;
            }
        }
        while (i>=0) {
            c[k]=a[i];
            i--;k--;
        }
        while (j>=0) {
            c[k]=b[j];
            j--;k--;
        }
        for (int ele:c) {
            System.out.print(ele+" ");
        }
    }
}
