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
   public ListNode swapPairs(ListNode head) {
        
       if(head == null || head.next == null)
           return head;
       
        ListNode current = head;
        ListNode prev = null;
       
        while (current != null &&  current.next != null) {
            ListNode temp = current.next;
            current.next = current.next.next;
            temp.next = current;
            current = temp;
            
            if (prev != null) {
                prev.next = current;
            } else {
                head = current;
            }
            
            prev = current.next;
            current = prev.next;
            
        }
        return head;
   }
}