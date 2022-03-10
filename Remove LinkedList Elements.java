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
    public ListNode removeElements(ListNode head, int val) {
       if(head == null){
           return null;
       }
        
        ListNode Current = head;
        ListNode Prev = head;
        while(Current != null){
            if(Current.val == val){
                Prev.next = Current.next;
                Current = Current.next;
            }
            else{
                Prev = Current;
                Current = Current.next;
            }
        }
    
        ListNode result;
        if(head.val == val){
            result = head.next;
        }
        else{
            result = head;
        }
        return result;
    }
}