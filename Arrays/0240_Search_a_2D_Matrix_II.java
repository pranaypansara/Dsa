/*
 * Problem: Search a 2D Matrix II
 * LeetCode: 240
 * URL: https://leetcode.com/problems/search-a-2d-matrix-ii/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target) return true;
            else if(target<matrix[i][j]) j--;
            else i++;
        }
        return false;
    }
}
