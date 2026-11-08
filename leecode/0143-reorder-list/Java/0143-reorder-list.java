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
        if(head == null || head.next == null || head.next.next == null)
        {
            return;
        }
        ListNode fast,slow,temp;
        fast=slow=temp=head;
        while(fast.next != null && fast.next.next != null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        fast=reverse(slow.next);
        slow.next=null;
        slow=head.next;

        while(slow !=null)
        {
            temp.next=fast;
            temp=fast;
            fast=fast.next;

            temp.next=slow;
            temp=slow;
            slow=slow.next; 
        }
        if(temp != null)
        {
            temp.next=fast;
        }
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode temp=head,t1,t2;
        t1=t2=null;
        while(temp !=null)
        {
            t2=temp.next;
            temp.next=t1;
            t1=temp;
            temp=t2;
        }
        return t1;
    }
}