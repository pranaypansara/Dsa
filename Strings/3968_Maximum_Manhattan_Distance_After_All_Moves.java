/*
 * Problem: Maximum Manhattan Distance After All Moves
 * LeetCode: 3968
 * URL: https://leetcode.com/problems/maximum-manhattan-distance-after-all-moves/
 * Difficulty: Medium
 * Topic: Strings
 */

class Solution {
    public int maxDistance(String moves) {
        int hor=0;
        int ver=0;
        int wild=0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            switch(ch){
                case 'U':
                    ver++;
                    break;
                case 'D':
                    ver--;
                    break;
                case 'R':
                    hor++;
                    break;
                case 'L':
                    hor--;
                    break;
                default:
                    wild++;
            }
        }
        return Math.abs(hor)+Math.abs(ver)+wild;
    }
}
