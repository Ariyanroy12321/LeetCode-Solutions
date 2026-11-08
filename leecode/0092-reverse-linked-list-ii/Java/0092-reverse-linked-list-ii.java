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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode t1,t2,lp,sp,temp;
        t1=t2=null;
        sp=lp=null;
        temp=head;
        if(head == null || head.next == null)
        {
            return head;
        }
        if(left-right == 0)
        {
            return head;
        }
        int l=left-2;
        while(temp.next != null && l>0)
        {
            l--;
            temp=temp.next;
        }
        lp=temp;
        sp=(left == 1)?head:temp.next;
        temp=(left == 1)?temp:temp.next;
        while(temp != null && (right-left+1)>0)
        {
            right--;
            t2=temp.next;
            temp.next=t1;
            t1=temp;
            temp=t2;
        }
        if(temp == null && head == sp)
        {
            head=t1;
        }
        else if(temp == null)
        {
            lp.next=t1;
        }
        else if(head == sp)
        {
            sp.next=temp;
            head=t1;
        }
        else
        {
            lp.next=t1;
            sp.next=temp;
        }
        return head;
    }
}