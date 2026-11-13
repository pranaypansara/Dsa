/*
 * Problem: Power of Two
 * LeetCode: 231
 * URL: https://leetcode.com/problems/power-of-two/
 * Difficulty: Easy
 * Topic: Bit-Manipulation
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        return (n&(n-1))==0;
    }
}
