/*
 * Problem: Jump Game
 * LeetCode: 55
 * URL: https://leetcode.com/problems/jump-game/
 * Difficulty: Medium
 * Topic: Greedy
 */

class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        for(int i=0; i<nums.length; i++){
            if(i>maxIndex) return false;
            maxIndex= Math.max(maxIndex, i+nums[i]);
            if(maxIndex >= nums.length-1) return true;
        }
        return true;
    }
}
