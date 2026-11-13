/*
 * Problem: Rotate String
 * LeetCode: 796
 * URL: https://leetcode.com/problems/rotate-string/
 * Difficulty: Easy
 * Topic: Strings
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String doubleS = s+s;
        return doubleS.contains(goal);
    }
}
