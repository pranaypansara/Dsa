/*
 * Problem: Intersection of Two Linked Lists
 * LeetCode: 160
 * URL: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Difficulty: Easy
 * Topic: Linked-List
 * Note: Class visibility adjusted for this repository's filename convention.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = getdiff(headA, headB);
        if(diff<0){
            while(diff++!=0) headB=headB.next;
        }else{
            while(diff--!=0) headA=headA.next;
        }

        while(headA!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    public int getdiff(ListNode headA, ListNode headB){
        int lenA = 0;
        int lenB = 0;
        while(headA!=null || headB!=null){
            if(headA!=null){
                lenA++;
                headA=headA.next;
            }
            if(headB!=null){
                lenB++;
                headB=headB.next;
            }
        }
        return (lenA-lenB);
    }
}

/*
 * LeetCode provides this definition for the problem; included for standalone compilation.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}