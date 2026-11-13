/*
 * Problem: Remove Nth Node From End of List
 * LeetCode: 19
 * URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Difficulty: Medium
 * Topic: Linked-List
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int pos = len-n+1;

        if(pos==1){
            head=head.next;
            return head;
        }
        temp=head;
        for(int i=1; i<pos-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
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