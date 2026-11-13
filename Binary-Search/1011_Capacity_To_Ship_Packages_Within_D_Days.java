/*
 * Problem: Capacity To Ship Packages Within D Days
 * LeetCode: 1011
 * URL: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
        int high=0;
        int ans=-1;
        for(int weight:weights){
            high+=weight;
            if(weight>=low){
                low=weight;
            }
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(Days(weights, mid)<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int Days(int[] weights, int capacity){
        int days=1;
        int w=0;
        for(int weight:weights){
            if(w+weight>capacity){
                days++;
                w=weight;
            }else{
                w+=weight;
            }
        }
        return days;
    }
}
