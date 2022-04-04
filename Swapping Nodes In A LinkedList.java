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
    public ListNode swapNodes(ListNode head, int k) {
        //first calculate size of LL
        ListNode current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        current = head;
        
        ListNode first = head;
        ListNode second = head;
        
        for(int i = 0;i < k-1;i++){
            first = first.next;
        }
        for(int i = 0;i < size-k;i++){
            second = second.next;
        }
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}