/*
 * Problem: Max Consecutive Ones
 * LeetCode: 485
 * URL: https://leetcode.com/problems/max-consecutive-ones/
 * Difficulty: Easy
 * Topic: Arrays
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcnt=0;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                cnt++;
                if(cnt>maxcnt){
                    maxcnt=cnt;
                }
            }
            else{
                cnt=0;
            }
        }
        return maxcnt;
    }
}
