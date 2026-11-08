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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if(head.next.next == null)
        {
            return head.val ==head.next.val;
        }
        ListNode slow,fast;
        slow=fast=head;
        while(fast.next != null && fast.next.next!= null)// finding the middle
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        
        fast=reverse(slow.next);
        slow=head;
        while(fast != null)
        {
            if(slow.val != fast.val)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head)
    {
        ListNode t1=null,t2=null,temp=head;
        while(temp != null)
        {
            t2=temp.next;
            temp.next=t1;
            t1=temp;
            temp=t2;
        }
        return t1;
    } 
}