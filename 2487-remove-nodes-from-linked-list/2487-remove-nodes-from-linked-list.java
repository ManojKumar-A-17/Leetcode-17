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
    public ListNode revp(ListNode head){
        ListNode p = null;
        ListNode cur = head;
        while(cur != null){
            ListNode t = cur.next;
            cur.next = p;
            p= cur;
            cur=t;
        }
        cur=head;
        return p;
    }
    public ListNode removeNodes(ListNode head) {
        head = revp(head);
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val > cur.next.val){
                cur.next = cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        head=revp(head);
        return head;
    }
}