//https://leetcode.com/problems/running-sum-of-1d-array/description/

public class Running_sum_of_1d_array {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0]=nums[0];
        for(int i = 1; i < n; i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}
