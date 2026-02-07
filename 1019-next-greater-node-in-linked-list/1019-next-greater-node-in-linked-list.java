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
    public int[] nextLargerNodes(ListNode head) {
        int c=0;
        ListNode cur = head;
        while(cur != null){
            c++;
            cur=cur.next;
        }
        int[] a = new int[c];
        for(int i=0;i<c;i++){
            a[i]=0;
        }
        cur=head;
        int[] a1 = new int[c];
        for(int i=0;i<c;i++){
            a1[i]=cur.val;
            cur=cur.next;
        }
        for(int i=0;i<c-1;i++){
            int l=i+1;
            while(l<c){
                if(a1[i]<a1[l]){
                    a[i]=a1[l];
                    break;
                }
                l++;
            }
        }
        return a;
    }
}