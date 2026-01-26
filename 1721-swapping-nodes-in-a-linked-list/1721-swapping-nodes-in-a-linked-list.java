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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next== null) return head; 
        int c=0;
        ListNode cur = head;
        while(cur != null){
            c++;
            cur=cur.next;
        }
        if(k>c) return head;
        ListNode f = head;
        ListNode p1 = null;
        for(int i=1;i<k;i++){
            p1=f;
            f=f.next;
        }
        ListNode l = head;
        ListNode p2 = null;
        for(int i=1;i<c-k+1;i++){
            p2=l;
            l=l.next;
        }
        if(f==l) return head;
        if(p1 != null) p1.next = l;
        else head=l;
        if(p2 != null) p2.next = f;
        else head=f;
        ListNode t = f.next;
        f.next = l.next;
        l.next = t;
        return head;
    }
}