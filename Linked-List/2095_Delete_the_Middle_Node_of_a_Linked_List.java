/*
 * Problem: Delete the Middle Node of a Linked List
 * LeetCode: 2095
 * URL: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = slow;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        if(slow==head){
            head=head.next;
            return null;
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