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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
        {
            return head;
        }
        int x=1;
        ListNode temp,odd,even,dummy;
        odd=head;
        even=head.next;
        temp=even.next;
        dummy=even;
        while(temp != null)
        {
            if(x>0)
            {
                odd.next=temp;
                odd=temp;
            }
            else
            {
                even.next=temp;
                even=temp;
            }
            x=x*-1;
            temp=temp.next;
        }
        even.next=null;
        odd.next=dummy;
        return head;
    }
}