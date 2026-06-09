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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = head.next;
        ListNode a = null;

        while(dummy != null) {
            head.next = a;
            a = head;
            head = dummy;
            dummy = dummy.next;
        }
        head.next = a;
        a = head;
        return a;
    }
}
