/*
 * Problem: Minimum Number of Days to Make m Bouquets
 * LeetCode: 1482
 * URL: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
 * Difficulty: Medium
 * Topic: Binary-Search
 */

import java.util.Arrays;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(BoquetMade(bloomDay, mid, k)>=m){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int BoquetMade(int[] bloomDay, int days, int k){
        int flowerCnt=0;
        int boquetCnt=0;
        for(int oneFlower : bloomDay){
            if(oneFlower<=days){
                flowerCnt++;
                if(flowerCnt==k){
                    boquetCnt++;
                    flowerCnt=0;
                }
            }
            else{
                flowerCnt=0;
            }
        }
        return boquetCnt;
    }
}
