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
        ListNode cur = head;
        ListNode prev = null;
        ListNode newnode = null;
        while(cur!=null){
            newnode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = newnode;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int c=1;
        ListNode st=head;
        ListNode ed,prev=null;
        ListNode cur=head;
        if(left==right)return head;
        while(cur!=null && c<right){
            if(c < left)prev=cur;
            if(c == left){
                st=cur;
            }
            cur=cur.next;
            c++;
        }
        ListNode tp = cur.next;
        cur.next=null;
        ListNode rev = reverseList(st);
        if(prev!=null) prev.next=rev;
        else head=rev;
        st.next=tp;
        return head;
    }
}