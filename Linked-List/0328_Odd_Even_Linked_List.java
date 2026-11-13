/*
 * Problem: Odd Even Linked List
 * LeetCode: 328
 * URL: https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode evenHead = head.next;
        ListNode oddHead = head;
        ListNode even = evenHead;
        ListNode odd = oddHead;
        int cnt = 3;
        ListNode temp = head.next.next;
        while(temp!=null){
            if(cnt%2!=0){
                odd.next=temp;
                odd=odd.next;
            }else{
                even.next=temp;
                even=even.next;
            }
            temp=temp.next;
            cnt++;
        }
        even.next=null;
        odd.next=evenHead;
        return oddHead;
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