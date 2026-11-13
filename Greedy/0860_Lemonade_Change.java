/*
 * Problem: Lemonade Change
 * LeetCode: 860
 * URL: https://leetcode.com/problems/lemonade-change/
 * Difficulty: Easy
 * Topic: Greedy
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0; i<bills.length; i++){
            //5
            if(bills[i]==5){
                five+=1;
            }
            //10
            else if(bills[i]==10){
                if(five>=1){
                    five-=1;
                    ten+=1;
                }else{
                    return false;
                }
            }
            //20
            else{
                if(five>=1 && ten>=1){
                    five-=1;
                    ten-=1;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
