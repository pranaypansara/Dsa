/*
 * Problem: Valid Subarrays With Matching Sum Digits I
 * LeetCode: 3969
 * URL: https://leetcode.com/problems/valid-subarrays-with-matching-sum-digits-i/
 * Difficulty: Medium
 * Topic: Arrays
 */

class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int cnt = 0;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long curr = prefix[j + 1] - prefix[i];

                if (isValid(curr, x)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public boolean isValid(long sum, int x) {
        sum = Math.abs(sum);

        long last = sum % 10;

        while (sum >= 10) {
            sum /= 10;
        }

        long first = sum;

        return first == x && last == x;
    }
}
