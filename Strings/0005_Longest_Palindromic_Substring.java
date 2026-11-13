/*
 * Problem: Longest Palindromic Substring
 * LeetCode: 5
 * URL: https://leetcode.com/problems/longest-palindromic-substring/
 * Difficulty: Medium
 * Topic: Strings
 */

class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }
        String res = "";
        for(int i=1; i<n; i++){
            int left=i;
            int right=i;
            
            while(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                if(left==-1 || right==n) break;
            }

            String palindrome = s.substring(left+1, right);
            if(palindrome.length()>res.length()) res=palindrome;

            left=i-1;
            right=i;
            while(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                if(left==-1 || right==n) break;
            }
            palindrome = s.substring(left+1, right);
            if(palindrome.length()>res.length()) res=palindrome;
        }
        return res;
    }
}
