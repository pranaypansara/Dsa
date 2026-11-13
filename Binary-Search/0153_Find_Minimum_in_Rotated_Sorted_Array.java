/*
 * Problem: Find Minimum in Rotated Sorted Array
 * LeetCode: 153
 * URL: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            //left half sorted
            if(nums[low]<=nums[mid]){
                //minimum will be low : low<mid
                ans = Math.min(nums[low], ans);
                low=mid+1;
            }
            //right half sorted
            else{
                //minimum will be mid : mid<high
                ans = Math.min(nums[mid], ans);
                high=mid-1;
            }
        }
        return ans;
    }
}
