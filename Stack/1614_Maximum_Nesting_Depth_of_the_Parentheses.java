/*
 * Problem: Maximum Nesting Depth of the Parentheses
 * LeetCode: 1614
 * URL: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 * Difficulty: Easy
 * Topic: Stack
 */

class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxdepth=0;
        for(char c: s.toCharArray()){
            if(c=='(') depth++;
            if(c==')') depth--;
            maxdepth = Math.max(depth, maxdepth);
        }
        return maxdepth;
    }
}
