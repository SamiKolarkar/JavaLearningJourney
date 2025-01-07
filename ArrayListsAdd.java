package Array;

import java.util.ArrayList;

public class ArrayListsAdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(arr+" "+arr.size());
        arr.add(60);
        System.out.println(arr+" "+arr.size());
        arr.add(20);
        System.out.println(arr+" "+arr.size());
        arr.remove(0);
        System.out.println(arr+" "+arr.size());
        arr.add(30);
        System.out.println(arr+" "+arr.size());
    }
}
