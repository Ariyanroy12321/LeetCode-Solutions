/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast,slow;
        fast=head;
        slow=head;
        if(head == null || head.next == null)
        {
            return false;
        }
        if(fast.next.next!= null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        else
        {
            return false;
        }
        while (fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;

    if (fast == slow) {
        return true;
    }
}
return false;
        
        
    }
}