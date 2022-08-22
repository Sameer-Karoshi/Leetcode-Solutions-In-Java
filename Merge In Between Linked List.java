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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) { 
        //List2 Tail ( We already have List2 Head)
        ListNode list2Tail = list2;
        while(list2Tail.next != null){
            list2Tail = list2Tail.next;
        }
        //First Node (After new list comes)
        ListNode first = list1;
        int count = 0;
        while(count != a-1){
            count++;
            first = first.next;
        }
        //Second Node (before new list ends)
        ListNode second = first;
        while(count != b){
            count++;
            second = second.next;
        }
        first.next = list2;
        list2Tail.next = second.next;
        return list1;
    }
}
