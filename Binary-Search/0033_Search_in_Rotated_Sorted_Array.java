/*
 * Problem: Search in Rotated Sorted Array
 * LeetCode: 33
 * URL: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            //left half sorted
            if(nums[low]<=nums[mid]){
                //present in left half
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                }
                //present in right half
                else{
                    low=mid+1;
                }
            }
            //right half sorted
            else{
                //present in right half
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }
                //present in left half
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
