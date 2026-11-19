/*
 * Problem: Subsets II
 * LeetCode: 90
 * URL: https://leetcode.com/problems/subsets-ii/
 * Difficulty: Medium
 * Topic: Backtracking
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(ans, nums, 0, new ArrayList<>());
        return ans;
    }

    private void helper(List<List<Integer>> list, int[] arr, int ind, List<Integer> temp){
        //add temp as it is unique
        list.add(new ArrayList<>(temp));

        for(int i=ind; i<arr.length; i++){
            //skip duplicate at same recursion level
            if(i>ind && arr[i]==arr[i-1]) continue;

            //pick
            temp.add(arr[i]);
            helper(list, arr, i+1, temp);

            //backtrack
            temp.remove(temp.size()-1);
        }
    }
}
