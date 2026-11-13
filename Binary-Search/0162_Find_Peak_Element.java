/*
 * Problem: Find Peak Element
 * LeetCode: 162
 * URL: https://leetcode.com/problems/find-peak-element/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
