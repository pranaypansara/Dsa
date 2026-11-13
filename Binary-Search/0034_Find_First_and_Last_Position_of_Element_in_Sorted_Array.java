/*
 * Problem: Find First and Last Position of Element in Sorted Array
 * LeetCode: 34
 * URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    int firstOccurance(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }

    int lastOccurance(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int last = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int fo = firstOccurance(nums, target);
        if(fo==-1) return new int[] {-1,-1};
        int lo = lastOccurance(nums, target);
        return new int[] {fo, lo};
    }
}
