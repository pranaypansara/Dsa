/*
 * Problem: Split Array Largest Sum
 * LeetCode: 410
 * URL: https://leetcode.com/problems/split-array-largest-sum/
 * Difficulty: Hard
 * Topic: Binary-Search
 */

class Solution {
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>low){
                low=nums[i];
            }
            high+=nums[i];
        }
        int ans=high;

        while(high>=low){
            int mid = low+(high-low)/2;
            int numberOfSubArrays = nSubArrays(nums, mid);
            if(numberOfSubArrays>k){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }

    public int nSubArrays(int[] nums, int max){
        int cnt=1;
        int sum=nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum+nums[i]>max){
                cnt++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return cnt;
    }
}
