/*
 * Problem: Majority Element II
 * LeetCode: 229
 * URL: https://leetcode.com/problems/majority-element-ii/
 * Difficulty: Medium
 * Topic: Arrays
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt1=0, cnt2=0;
        int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;
        //Boyer Moore's voting algorithm
        for(int i=0; i<nums.length; i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                el1=nums[i];
            }else if(cnt2==0 && el1!=nums[i]){
                cnt2=1;
                el2=nums[i];
            }else if(nums[i]==el1){
                cnt1++;
            }else if(nums[i]==el2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        //checkin if both elements are in majority
        cnt1=0;
        cnt2=0;
        int threshold = nums.length/3;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==el1){
                cnt1++;
            }else if(nums[i]==el2){
                cnt2++;
            }
        }
        if(cnt1>threshold){
            ans.add(el1);
        }
        if(cnt2>threshold){
            ans.add(el2);
        }
        return ans;
    }
}
