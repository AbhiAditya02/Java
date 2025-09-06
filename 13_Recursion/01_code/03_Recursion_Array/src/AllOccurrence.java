// find all occurrence without using Array list as a parameter

import java.util.ArrayList;

public class AllOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5};
        int target = 4;

        System.out.println(allOccurrence(arr, target, 0));
    }

    static ArrayList<Integer> allOccurrence(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>(1);
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        list.addAll(allOccurrence(arr, target, i+1));
        return list;
    }
}
