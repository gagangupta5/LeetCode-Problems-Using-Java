/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=0,sizeB=0;
        ListNode tempA=headA;
        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }
        ListNode tempB=headB;
        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }
        boolean isALarge=sizeA>sizeB?true:false;
        if(isALarge){
            tempA=headA;
            tempB=headB;
            int i=1;
            while(i<=(sizeA-sizeB)){
                tempA=tempA.next;
                i++;
            }
        }
        else{
            tempB=headB;
            tempA=headA;
            int i=1;
            while(i<=(sizeB-sizeA)){
                tempB=tempB.next;
                i++;
            }
        }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB) return tempA;
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}
