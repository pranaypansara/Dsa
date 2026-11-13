/*
 * Problem: Find a Peak Element II
 * LeetCode: 1901
 * URL: https://leetcode.com/problems/find-a-peak-element-ii/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        int[] peak = {-1,-1};
        while(low<=high){
            int col=low+(high-low)/2;
            int row=max(mat, col);
            
            int left = col-1>=0 ? mat[row][col-1] : -1;
            int right = col+1<mat[0].length ? mat[row][col+1] : -1;

            if(mat[row][col]>left && mat[row][col]>right){
                return new int[]{row, col};
            }else if(mat[row][col]<right){
                low=col+1;
            }else{
                high=col-1;
            }
        }
        return new int[]{-1, -1};
    }

    public int max(int[][] mat, int col){
        int max=0;
        for(int i=1; i<mat.length; i++){
            if(mat[i][col]>mat[max][col]){
                max=i;
            }
        }
        return max;
    }
}
