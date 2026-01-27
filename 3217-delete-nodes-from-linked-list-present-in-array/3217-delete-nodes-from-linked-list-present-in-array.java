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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode cur = head;
        Set<Integer> st = new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        ListNode dum = new ListNode(0);
        dum.next=head;
        cur = dum;
        while(cur.next != null){
            if(st.contains(cur.next.val)){
                cur.next = cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return dum.next;
    }
}