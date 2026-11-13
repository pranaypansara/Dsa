/*
 * Problem: Find the Duplicate Number
 * LeetCode: 287
 * URL: https://leetcode.com/problems/find-the-duplicate-number/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public int findDuplicate(int[] nums) {
        int[] hash = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            hash[nums[i]]++;
            if(hash[nums[i]]==2){
                return nums[i];
            }
        }
        return -1;
    }
}
