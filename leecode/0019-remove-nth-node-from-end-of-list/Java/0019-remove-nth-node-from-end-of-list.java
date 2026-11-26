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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null)
        {
            return null;
        }

        ListNode temp=head;
        ListNode tail=head;
        ListNode demo=null;

        for(int i=0;i<n;i++)
        {
            tail=tail.next;
        }
        if(tail ==null)
        {
            return head.next;
        }
        
        while(tail!=null && tail.next != null)
        {
            temp=temp.next;
            tail=tail.next;
        }
        demo=temp.next;;
        temp.next=demo.next;
        
        return head;

    }
}