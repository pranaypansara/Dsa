/*
 * Problem: Largest Odd Number in String
 * LeetCode: 1903
 * URL: https://leetcode.com/problems/largest-odd-number-in-string/
 * Difficulty: Easy
 * Topic: Strings
 */

class Solution {
    public String largestOddNumber(String num) {
        StringBuilder result = new StringBuilder();
        int i=num.length()-1;
        while(i>=0){
            char ch = num.charAt(i);
            if(ch=='1'||ch=='3'||ch=='5'||ch=='7'||ch=='9'){
                result.append(num.substring(0, i+1));
                break;
            }
            i--;
        }
        return result.toString();
    }
}
