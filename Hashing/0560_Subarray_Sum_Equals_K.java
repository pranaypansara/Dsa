/*
 * Problem: Subarray Sum Equals K
 * LeetCode: 560
 * URL: https://leetcode.com/problems/subarray-sum-equals-k/
 * Difficulty: Medium
 * Topic: Hashing
 */

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        //stores the sums that appeared and how many times they appeared
        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);
        int sum=0;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum-k;
            if(sums.containsKey(rem)){
                cnt+=sums.get(rem);
            }
            sums.put(sum, sums.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}
