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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int l = c/2;
        curr=head;
        for(int i=0;i<l-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}

// while(f&&f.next){
//     p=s;
//     s=s.next;
//     f=f.next.next;
// }
// if(p)p.next=s.next;
// else head=s.next;
// return head;
