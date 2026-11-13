/*
 * Problem: Number of Steps to Reduce a Number to Zero
 * LeetCode: 1342
 * URL: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * Difficulty: Easy
 * Topic: Recursion
 */

class Solution {
    public int numberOfSteps(int num) {
        return steps(num, 0);
    }
    public int steps(int num, int cnt){
        if(num==0) return cnt;
        if(num%2==0) return steps(num/2, ++cnt);
        else return steps(num-1, ++cnt);
    }
}
