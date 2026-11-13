/*
 * Problem: Two Sum
 * LeetCode: 1
 * URL: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * Topic: Hashing
 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int con=target-nums[i];
            if(map.containsKey(con) && map.get(con)!=i){
                return new int[]{i, map.get(con)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
