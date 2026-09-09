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
        if(left==right || head==null || head.next==null) return head;
        ListNode curr=head;
        int i=1;
        while(i<left-1){
            curr=curr.next;
            i++;
        } 
        ListNode temp=curr;
        while(i<right){
            temp=temp.next;
            i++;
        }
        ListNode last=temp.next;
        temp.next=null;
        ListNode newHead=reverseList(left==1?head:curr.next);
        if(left==1) head=newHead;
        else curr.next=newHead;
        while(curr.next!=null) curr=curr.next;
        curr.next=last;
        return head;
    }

    private ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
