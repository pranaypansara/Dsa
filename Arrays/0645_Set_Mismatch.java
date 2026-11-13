/*
 * Problem: Set Mismatch
 * LeetCode: 645
 * URL: https://leetcode.com/problems/set-mismatch/
 * Difficulty: Easy
 * Topic: Arrays
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] hash = new int[nums.length+1];
        //hash array precompute
        for(int i=0; i<nums.length; i++){
            hash[nums[i]]++;
        }
        //target
        for(int i=1; i<hash.length; i++){
            if(hash[i]==2){
                ans[0]=i;
            }
            if(hash[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}
