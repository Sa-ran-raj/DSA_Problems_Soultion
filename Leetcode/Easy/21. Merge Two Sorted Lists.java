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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode temp=dummy;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                t1=t1.next;
                temp=temp.next;
            }
            else{
                temp.next=t2;
                t2=t2.next;
                temp=temp.next;
            }

        }
        if(t2!=null) temp.next=t2;
        else temp.next=t1;
        return dummy.next;
        
    }
}
