/*
 * Problem: Rotated Digits
 * LeetCode: 788
 * URL: https://leetcode.com/problems/rotated-digits/
 * Difficulty: Medium
 * Topic: Math
 */

class Solution {
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1; i<=n; i++){
            int temp = i;
            boolean valid = true;
            boolean changed = false;
            while(temp>0 && valid){
                int digit = temp%10;
                if(digit==3||digit==4||digit==7){
                    valid=false;
                }
                if(digit==2||digit==5||digit==6||digit==9){
                    changed=true;
                }
                temp/=10;
            }
            if(valid && changed) cnt++;
        }
        return cnt;
    }
}
