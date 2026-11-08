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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null )
        {
            return null;
        }
        ListNode fast,slow;
        Boolean loop=false;
        fast=slow=head;
        while(fast != null && fast.next != null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow)
            {
                loop=true;
                break;
            }
        }
        if(loop)
        {
            slow = head;
                while(slow != fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
        }
        return null;
    }
}