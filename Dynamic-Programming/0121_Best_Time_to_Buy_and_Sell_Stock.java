/*
 * Problem: Best Time to Buy and Sell Stock
 * LeetCode: 121
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Difficulty: Easy
 * Topic: Dynamic-Programming
 */

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int Maxprofit=0;
        for(int i=0; i<prices.length; i++){
            int profit = prices[i]-min;
            Maxprofit = Math.max(Maxprofit, profit);
            min = Math.min(min, prices[i]);
        }
        return Maxprofit;
    }
}
