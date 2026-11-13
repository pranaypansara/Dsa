/*
 * Problem: Search a 2D Matrix
 * LeetCode: 74
 * URL: https://leetcode.com/problems/search-a-2d-matrix/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target) return true;
            if(matrix[mid/m][mid%m]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
