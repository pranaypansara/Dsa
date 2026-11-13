/*
 * Problem: Spiral Matrix
 * LeetCode: 54
 * URL: https://leetcode.com/problems/spiral-matrix/
 * Difficulty: Medium
 * Topic: Arrays
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right){
            //top row from left to right
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //right column from top to bottom
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //bottom row from right to left
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left column bottom to top
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
