/*
 * Problem: Set Matrix Zeroes
 * LeetCode: 73
 * URL: https://leetcode.com/problems/set-matrix-zeroes/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        //check if first row or column initially has a zero
        boolean firstRow=false;
        boolean firstCol=false;
        //first row
        for(int j=0; j<col; j++){
            if(matrix[0][j]==0){
                firstRow=true;
            }
        }
        //first col
        for(int i=0; i<row; i++){
            if(matrix[i][0]==0){
                firstCol=true;
            }
        }

        //mark zeroes
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //set zeroes
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        //set zeroes of first row and column
        if(firstRow){
            for(int j=0; j<col; j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0; i<row; i++){
                matrix[i][0]=0;
            }
        }
    }
}
