/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;

        // kth node from start
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        temp = first;

        // kth node from end
        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // Swap values
        int t = first.val;
        first.val = second.val;
        second.val = t;

        return head;
    }
}