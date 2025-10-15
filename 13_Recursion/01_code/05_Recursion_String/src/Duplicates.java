import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        Arrays.sort(arr);
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // add empty list
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]) start = end + 1;
            else start = 0;
            end = outer.size()-1;
            for (int j = start; j <= end; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
