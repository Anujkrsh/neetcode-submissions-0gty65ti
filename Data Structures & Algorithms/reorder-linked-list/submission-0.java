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
        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> list = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            ListNode first = list.get(start);
            ListNode second = list.get(end);

            first.next = second;
            start++;

            if (start > end) {
                break;
            }

            second.next = list.get(start);
            end--;
        }

        list.get(start).next = null;
    }
}