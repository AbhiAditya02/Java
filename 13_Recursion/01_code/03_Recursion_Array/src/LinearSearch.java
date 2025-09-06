import java.util.ArrayList;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> occurrence = new ArrayList<>(1);
        System.out.println(allOccurrence(arr, occurrence, target, 0));
    }
    static int search(int[] arr, int target, int i){
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return search(arr, target, i+1);
    }

    static int searchLast(int[] arr, int target, int i){
        if(i < 0) return -1;
        if(arr[i] == target) return i;
        return searchLast(arr, target, --i);
    }

    static ArrayList<Integer> allOccurrence(int[] arr, ArrayList<Integer> list, int target, int i){
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        return allOccurrence(arr, list, target, ++i);
    }
}
