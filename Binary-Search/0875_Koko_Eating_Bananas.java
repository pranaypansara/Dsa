/*
 * Problem: Koko Eating Bananas
 * LeetCode: 875
 * URL: https://leetcode.com/problems/koko-eating-bananas/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=Arrays.stream(piles).max().getAsInt();
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(timetaken(piles, mid)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }


    long timetaken(int[] piles, int k){
        long t=0;
        for(int i=0; i<piles.length; i++){
            t += (piles[i]+k-1)/k;
        }
        return t;
    }
}
