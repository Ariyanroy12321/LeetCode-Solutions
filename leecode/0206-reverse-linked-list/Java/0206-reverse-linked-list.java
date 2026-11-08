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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode t1,t2,temp;
        t1=null;
        temp=head;
        t2=null;
        while(temp.next != null)
        {
            t2=temp.next;
            temp.next=t1;
            t1=temp;
            temp=t2;
        }
        temp.next=t1;
        head=temp;
        return head;
    }
}