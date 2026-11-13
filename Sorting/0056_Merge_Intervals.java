/*
 * Problem: Merge Intervals
 * LeetCode: 56
 * URL: https://leetcode.com/problems/merge-intervals/
 * Difficulty: Medium
 * Topic: Sorting
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(row->row[0]));
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0]<=end){
                end = Math.max(end, intervals[i][1]);
            }else{
                list.add(new int[]{start, end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[list.size()][]);
    }
}
