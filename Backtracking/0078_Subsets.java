/*
 * Problem: Subsets
 * LeetCode: 78
 * URL: https://leetcode.com/problems/subsets/
 * Difficulty: Medium
 * Topic: Backtracking
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, nums, 0, new ArrayList<>());
        return ans;
    }

    private void helper(List<List<Integer>> list, int[] arr, int i, List<Integer> temp){
        //base case
        if(i==arr.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        //pick current element
        temp.add(arr[i]);
        helper(list, arr, i+1, temp);

        //backtrack
        temp.remove(temp.size()-1);
        //skip current element
        helper(list, arr, i+1, temp);
    }
}
