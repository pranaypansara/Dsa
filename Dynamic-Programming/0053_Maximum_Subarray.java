/*
 * Problem: Maximum Subarray
 * LeetCode: 53
 * URL: https://leetcode.com/problems/maximum-subarray/
 * Difficulty: Medium
 * Topic: Dynamic-Programming
 */

class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum=Math.max(sum+nums[i], nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}
