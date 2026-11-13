/*
 * Problem: Find the Smallest Divisor Given a Threshold
 * LeetCode: 1283
 * URL: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

import java.util.Arrays;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(function(nums, mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int function(int[] nums, int mid){
        int sum=0;
        for(int num:nums){
            if(num%mid==0){
                sum+=(num/mid);
            }else{
                sum+=(num/mid)+1;
            }
        }
        return sum;
    }
}
