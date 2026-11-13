/*
 * Problem: Longest Common Prefix
 * LeetCode: 14
 * URL: https://leetcode.com/problems/longest-common-prefix/
 * Difficulty: Easy
 * Topic: Strings
 */

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(String str : strs){
                if(str.charAt(i)!=ch){
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
}
