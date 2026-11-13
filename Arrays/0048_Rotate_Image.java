/*
 * Problem: Rotate Image
 * LeetCode: 48
 * URL: https://leetcode.com/problems/rotate-image/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        //first make the transpose
        for(int i=0; i<row; i++){
            for(int j=i; j<row; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //now reverse the rows of matrix
        for(int i=0; i<row; i++){
            reverse(matrix[i]);
        }
    }

    public void reverse(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
