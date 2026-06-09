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
    public void reorderList(ListNode head) {
      ListNode temp = head;
      
      while(temp != null && temp.next != null) {
        ListNode fast = temp.next;
        ListNode slow = temp;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = null;
        fast.next = temp.next;
        temp.next = fast;
        temp = temp.next.next;
      }
    }
}
