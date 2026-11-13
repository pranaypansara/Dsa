/*
 * Problem: Sort Colors
 * LeetCode: 75
 * URL: https://leetcode.com/problems/sort-colors/
 * Difficulty: Medium
 * Topic: Sorting
 */

class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0; i<nums.length; i++){
            switch(nums[i]){
                case 0:
                    zero++;
                    break;
                case 1: 
                    one++;
                    break;
                case 2: 
                    two++;
                    break;
            }
        }

        for(int i=0; i<zero; i++){
            nums[i]=0;
        }
        for(int i=0; i<one; i++){
            nums[zero+i]=1;
        }
        for(int i=0; i<two; i++){
            nums[zero+one+i]=2;
        }
    }
}
