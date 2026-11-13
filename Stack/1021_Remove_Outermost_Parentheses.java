/*
 * Problem: Remove Outermost Parentheses
 * LeetCode: 1021
 * URL: https://leetcode.com/problems/remove-outermost-parentheses/
 * Difficulty: Easy
 * Topic: Stack
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth=0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(depth>0) result.append(ch);
                depth++;
            }
            
            else if(ch==')'){
                depth--;
                if(depth>0) result.append(ch);
            }
        }
        return result.toString();
    }
}
