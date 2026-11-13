/*
 * Problem: Check if Array Is Sorted and Rotated
 * LeetCode: 1752
 * URL: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * Difficulty: Easy
 * Topic: Arrays
 */

class Solution {
    public boolean check(int[] nums) {
        int patternChanges = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                patternChanges++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            patternChanges++;
        }
        if(patternChanges<=1){
            return true;
        }else{
            return false;
        }
    }
}
