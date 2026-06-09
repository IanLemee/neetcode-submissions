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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length < 1) return null;
         while (lists.length > 1) {
            List<ListNode> temp = new ArrayList<>();
            for (int i = 0; i < lists.length; i += 2) {
                ListNode l1 = lists[i];
                ListNode l2 = i + 1 < lists.length ? lists[i + 1] : null;
                temp.add(mergeLists(l1, l2));
            }
            lists = temp.toArray(new ListNode[0]);
        }
        return lists[0];
    }

    public ListNode mergeLists(ListNode i, ListNode j) {
            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;
            while(i != null && j != null) {
                if(i.val < j.val) {
                    curr.next = i;
                    i = i.next;
                } else {
                    curr.next = j;
                    j = j.next;
                }
                curr = curr.next;
            }

            curr.next = (i == null) ? j : i;
            return dummy.next;
    }
}
