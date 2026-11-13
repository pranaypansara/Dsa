/*
 * Problem: Weighted Word Mapping
 * LeetCode: 3838
 * URL: https://leetcode.com/problems/weighted-word-mapping/
 * Difficulty: Easy
 * Topic: Strings
 */

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<words.length; i++){
            String s = words[i];
            int sum=0;
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                sum+=weights[c-'a'];
            }
            int mod=sum%26;
            char ch = (char)Math.abs(mod-'z');
            ans.append(ch);
        }
        return ans.toString();
    }
}
