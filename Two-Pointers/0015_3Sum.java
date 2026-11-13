/*
 * Problem: 3Sum
 * LeetCode: 15
 * URL: https://leetcode.com/problems/3sum/
 * Difficulty: Medium
 * Topic: Two-Pointers
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        sort(nums);
        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
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
