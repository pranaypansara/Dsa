/*
 * Problem: Combination Sum II
 * LeetCode: 40
 * URL: https://leetcode.com/problems/combination-sum-ii/
 * Difficulty: Medium
 * Topic: Backtracking
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans, candidates, 0, target, new ArrayList<>());
        return ans;
    }

    private void helper(List<List<Integer>> list, int[] arr, int i, int target, List<Integer> temp){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }

        //possible candidates after picking current i index
        //ex: [1,1,2,5,6] at i=0, we can then choose next element from [1,2,5,6]
        for(int j=i; j<arr.length; j++){
            //skip duplicates at same recursion level
            if(j>i && arr[j]==arr[j-1]) continue;

            //since array is sorted
            if(arr[j]>target) break;

            //pick
            temp.add(arr[j]);
            helper(list, arr, j+1, target-arr[j], temp);

            //backtrack
            temp.remove(temp.size()-1);
        }
    }
}
