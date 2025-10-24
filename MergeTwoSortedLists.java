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
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1!=null || p2!=null){
            if (p1 == null){
                tail.next = p2;
                p2 = p2.next;
            }
            else if(p2 == null){ 
                tail.next = p1;
                p1 = p1.next;
            }
            else if(p1.val < p2.val){
                tail.next = p1;
                p1 = p1.next;
            }
            else{ 
                tail.next = p2;
                p2 = p2.next;
            }
        tail = tail.next;    
        }
    return dummy.next;
    }
}
