//https://leetcode.com/problems/shuffle-the-array/

public class Shuffle_the_array {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for(int i = 0; i < n * 2; i += 2){
            ans[i] = nums[i/2];
            ans[i+1] = nums[i/2+n];
        }
        return ans;
    }
}
