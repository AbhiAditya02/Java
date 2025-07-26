//https://leetcode.com/problems/create-target-array-igiven_order

import java.util.ArrayList;

public class Create_target_array_in_given_order {
    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            target.add(index[i],nums[i]);
        }
        return ans(target);
    }
    // Convert ArrayList to int[]
    int[] ans(ArrayList<Integer> target){
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        return result;
    }
}
