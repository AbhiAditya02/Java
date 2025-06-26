public class MaxWealth {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
