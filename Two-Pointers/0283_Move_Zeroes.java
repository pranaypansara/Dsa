/*
 * Problem: Move Zeroes
 * LeetCode: 283
 * URL: https://leetcode.com/problems/move-zeroes/
 * Difficulty: Easy
 * Topic: Two-Pointers
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int cnt=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==0){
                cnt++;
            }else{
                nums[i]=nums[j];
                i++;
            }
        }
        for(int k=0; k<cnt; k++){
            nums[nums.length-1-k]=0;
        }
    }
}
