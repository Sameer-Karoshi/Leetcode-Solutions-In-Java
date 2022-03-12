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
    public ListNode middleNode(ListNode head) {
       //hehe first calculate the size of LL :)
        ListNode Current = head;
        int Size = 0;
        while(Current != null){
            Size++;
            Current = Current.next;
        }
        
        ListNode Middle = null;
        int i = 0;
        Current = head;
        
        while(i != Size/2){
            Current = Current.next;
            i++;
        }
        
        Middle = Current;
        return Middle;
    }
}