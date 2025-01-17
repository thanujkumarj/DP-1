// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length==0){
            return -1;
        }
        int dp[] = new int [nums.length + 1];
        dp[0]=0;
        dp[1] = nums[0];
        for(int i=2;i<nums.length + 1;i++)
        {
            dp[i] = Math.max(dp[i-2] + nums[i-1] , dp[i-1]);
        }
        return dp[nums.length];
        
    }
}