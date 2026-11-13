/*
 * Problem: Pascal's Triangle
 * LeetCode: 118
 * URL: https://leetcode.com/problems/pascals-triangle/
 * Difficulty: Easy
 * Topic: Dynamic-Programming
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                    int num = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    temp.add(num);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
