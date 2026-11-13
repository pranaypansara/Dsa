/*
 * Problem: Next Permutation
 * LeetCode: 31
 * URL: https://leetcode.com/problems/next-permutation/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public void nextPermutation(int[] nums) {
        //Step 1: find the breaking point
        int index=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        //Edge case: if ther is no breaking point, it's the last permutation
        if(index==-1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        //Step 2: find the smallest number greater than the number at index and swap them
        for(int i=nums.length-1; i>=index; i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }

        //Step 3: sort the array after breaking point in ascending order
        reverse(nums, index+1, nums.length-1);
    }

    public void reverse(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
