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
    ListNode Tail = null;
    ListNode Head = null;
    public ListNode insertionSortList(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList<Integer>();
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        current = head;
        Collections.sort(list);
        //System.out.println(list);
        for(int i = 0;i < list.size();i++){
            Insert(list.get(i));
        }
        return Head;
    }
    public void Insert(int value){
        ListNode node = new ListNode(value);
        if(Head == null){
           Head = node;
           Tail = node;
        }
        else{
            Tail.next = node;
            Tail = node;
        }
    }
}
