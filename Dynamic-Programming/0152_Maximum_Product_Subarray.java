/*
 * Problem: Maximum Product Subarray
 * LeetCode: 152
 * URL: https://leetcode.com/problems/maximum-product-subarray/
 * Difficulty: Medium
 * Topic: Dynamic-Programming
 */

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(pre==0) pre = 1;
            if(suff==0) suff = 1;
            pre *= nums[i];
            suff *= nums[n-1-i];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
}
