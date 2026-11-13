/*
 * Problem: Letter Combinations of a Phone Number
 * LeetCode: 17
 * URL: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Difficulty: Medium
 * Topic: Backtracking
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return helper("", digits);
    }

    public ArrayList<String> helper(String p, String up){
        ArrayList<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0)-'0';
        String range = getRange(digit);

        for(char ch: range.toCharArray()){
            ans.addAll(helper(p+ch, up.substring(1)));
        }
        return ans;
    }

    public String getRange(int i){
        switch(i){
            case 2: return "abc";
            case 3: return "def";
            case 4: return "ghi";
            case 5: return "jkl";
            case 6: return "mno";
            case 7: return "pqrs";
            case 8: return "tuv";
            case 9: return "wxyz";
        }
        return "";
    }
}
