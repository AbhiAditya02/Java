//https://leetcode.com/problems/concatenation-of-array/

public class Concatenation_of_array {
    public static void main(String[] args) {

    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i]=ans[i+n]=nums[i];
        }
        return ans;
    }
}
