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
    public int getDecimalValue(ListNode head) {
        
        ListNode current = head;
        int size = 0;
        while(current != null){
            size++;  
            current = current.next;
        }
        current = head;
        int i = size-1;
        int result = 0;
        while(current != null){
            int temp = current.val;
            result = result + temp*(int)Math.pow(2,i);
            i--;
            current = current.next;
        }
     return result;   
    }
}