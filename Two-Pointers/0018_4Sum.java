/*
 * Problem: 4Sum
 * LeetCode: 18
 * URL: https://leetcode.com/problems/4sum/
 * Difficulty: Medium
 * Topic: Two-Pointers
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int l = j+1;
                int r = nums.length-1;
                while(l<r){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }



    int aux[];
    private void sort(int[] arr) {
        aux = new int[arr.length];
        sort(arr, 0, arr.length);
    }

    private void sort(int[] arr, int low, int high) {
        if (low+1 < high) {
            int mid = low + (high-low)/2;

            sort(arr, low, mid);
            sort(arr, mid, high);

            merge(arr, low, high);
        }
    }


    private void merge(int[] arr, int low, int high) {
        int l = low, mid = low + (high-low)/2, m = mid, n = high-low;

        for (int i = 0; i < n; i++) {
            if (l == mid) {
                aux[i] = arr[m++];
            } else if (m == high) {
                aux[i] = arr[l++];
            } else if (arr[l] <= arr[m]) {
                aux[i] = arr[l++];
            } else {
                aux[i] = arr[m++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[low+i] = aux[i];
        }
    }
}
