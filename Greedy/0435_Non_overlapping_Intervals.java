/*
 * Problem: Non-overlapping Intervals
 * LeetCode: 435
 * URL: https://leetcode.com/problems/non-overlapping-intervals/
 * Difficulty: Medium
 * Topic: Greedy
 */

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[1]));
        int cnt=0;
        int lastEndtime=intervals[0][1];
        for(int i=1; i<=intervals.length-1; i++){
            if(intervals[i][0]<lastEndtime){
                cnt++;
            }else{
                lastEndtime = intervals[i][1];
            }
        }
        return cnt;
    }
}
