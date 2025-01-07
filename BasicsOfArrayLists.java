package Array;

import java.util.ArrayList;

public class BasicsOfArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(5);
        arr.add(0,10);
        arr.add(1,20); // Initialize
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        for (int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println(arr.size());
        System.out.println(arr);
        arr.set(2,300);   // Modify
        System.out.println(arr);
        arr.add(90); // push back in C++
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
