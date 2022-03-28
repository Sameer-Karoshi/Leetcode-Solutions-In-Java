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
        if(head == null || head.next == null){
            return null;
        }
        //first calculate the size of LL
        int size = 0;
        ListNode current = head;
        
        while(current != null){
            size++;
            current = current.next;
        }
       //System.out.println(size);
        ListNode Prev = head;
        for(int i = 0;i < (size/2)-1;i++){
            Prev = Prev.next;
            //System.out.println(Prev.val);
        }
        //System.out.println(Prev.val);
        ListNode temp = Prev.next;
        Prev.next = temp.next;
        
        return head;
    }
}