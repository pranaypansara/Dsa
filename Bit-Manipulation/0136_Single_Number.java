/*
 * Problem: Single Number
 * LeetCode: 136
 * URL: https://leetcode.com/problems/single-number/
 * Difficulty: Easy
 * Topic: Bit-Manipulation
 */

class Solution {
    public int singleNumber(int[] nums) {
        int xorr=0;
        for(int n : nums){
            xorr = xorr^n;
        }
        return xorr;
    }
}
