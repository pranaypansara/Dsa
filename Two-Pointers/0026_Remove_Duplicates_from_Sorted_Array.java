/*
 * Problem: Remove Duplicates from Sorted Array
 * LeetCode: 26
 * URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty: Easy
 * Topic: Two-Pointers
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        //dry run ts nga
        int i=0;
        for(int j=1;j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
