/*
 * Problem: Combination Sum
 * LeetCode: 39
 * URL: https://leetcode.com/problems/combination-sum/
 * Difficulty: Medium
 * Topic: Backtracking
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, candidates, 0, target, new ArrayList<>());
        return ans;
    }

    private void helper(List<List<Integer>> list, int[] arr, int i, int target, List<Integer> temp) {

        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        if(i == arr.length || target < 0) return;

        // Pick the current element
        temp.add(arr[i]);
        helper(list, arr, i, target - arr[i], temp);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Skip the current element
        helper(list, arr, i + 1, target, temp);
    }
}
