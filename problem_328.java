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
        if(head==null || head.next==null) return head;
        ListNode even=new ListNode(-1);
        int i=2;
        ListNode temp=head.next, tempEven=even, tempOdd=head;
        while(temp!=null){
            if(i%2==0){
                tempEven.next=temp;
                tempEven=tempEven.next;
            }
            else{
                tempOdd.next=temp;
                tempOdd=tempOdd.next;
            }
            i++;
            temp=temp.next;
        }
        tempEven.next=null;
        tempOdd.next=even.next;
        return head;
    }
}
