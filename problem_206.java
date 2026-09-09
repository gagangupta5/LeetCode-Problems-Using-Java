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
class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode rhead=null;
        while(head!=null){
           ListNode node=head.next;
           head.next=rhead;
           rhead=head;
           head=node;
        }
        return rhead;
    }
}


//Recusive Solution
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
