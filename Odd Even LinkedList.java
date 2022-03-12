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
    ListNode Head = null;
    ListNode Tail = null;
    public ListNode oddEvenList(ListNode head) {
        ListNode Current = head;
        int i = 0;
        while(Current != null){
            int data = Current.val;
            if(i % 2 == 0){
                AddNode(data);
            }
            i++;
            Current = Current.next;
        }
        Current = head;
        i = 0;
        while(Current != null){
            int data = Current.val;
            if(i % 2 == 1){
                AddNode(data);
            }
            i++;
             Current = Current.next;
        }
        return Head;
    }
    
    public void AddNode(int data){
        ListNode NewNode = new ListNode(data);
        if(Head == null){
            Head = NewNode;
            Tail = NewNode;
        }
        else{
            Tail.next = NewNode;
            Tail = NewNode;
        }
    }
}