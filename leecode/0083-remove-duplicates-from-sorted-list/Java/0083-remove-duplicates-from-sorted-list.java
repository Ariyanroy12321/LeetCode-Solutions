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
    public ListNode deleteDuplicates(ListNode top) {
        ListNode head=top;
        ListNode fast=top;
        if (fast != null && fast.next != null) {
            fast = fast.next;
            while(fast != null)
        {
            if(head.val==fast.val)
            {
                fast=fast.next;
            }
            else
            {
                head=head.next;
                head.val=fast.val;
            }
        }
        head.next=null;
        }
        return top;
    }
}