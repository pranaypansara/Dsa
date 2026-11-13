/*
 * Problem: Assign Cookies
 * LeetCode: 455
 * URL: https://leetcode.com/problems/assign-cookies/
 * Difficulty: Easy
 * Topic: Greedy
 */

import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(l<g.length && r<s.length){
            if(s[r]>=g[l]) l++;
            r++;
        }
        return l;
    }
}
