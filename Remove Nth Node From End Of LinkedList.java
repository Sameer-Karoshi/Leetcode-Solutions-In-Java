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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //we have to remove nth node from the end of LL
        //first calculate its no from front !
        
        ListNode current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        if(size == 1 && n == 1){
            return null;
        }
        else if(size == n){
            return head.next;
        }
        current = head;
        int index = size - n + 1;
        for(int i = 0;i < index-2;i++){
           current = current.next; 
        }
        current.next = current.next.next;
        return head;
    }
}