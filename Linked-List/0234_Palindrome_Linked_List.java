/*
 * Problem: Palindrome Linked List
 * LeetCode: 234
 * URL: https://leetcode.com/problems/palindrome-linked-list/
 * Difficulty: Easy
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //slow is exactly at middle
        if(fast!=null){
            slow=slow.next;
        }

        ListNode secHalf = reverseLL(slow);
        ListNode firstHalf = head;
        while(secHalf!=null){
            if(firstHalf.val!=secHalf.val){
                return false;
            }
            firstHalf=firstHalf.next;
            secHalf=secHalf.next;
        }
        return true;
    }

    public ListNode reverseLL(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
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