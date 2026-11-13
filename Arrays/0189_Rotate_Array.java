/*
 * Problem: Rotate Array
 * LeetCode: 189
 * URL: https://leetcode.com/problems/rotate-array/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<=1){
            return;
        }
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
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
