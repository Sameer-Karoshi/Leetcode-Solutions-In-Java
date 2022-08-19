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
    public ListNode mergeNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        for(int i = 1;i < list.size();i++){
            if(list.get(i) != 0){
                sum += list.get(i);
            }
            else{
                res.add(sum);
                sum = 0;
            }
        }
        //System.out.println(res);
        for(int i = 0;i < res.size();i++){
            CreateLL(res.get(i));
        }
        return Head;   
    }
    public void CreateLL(int val){
        ListNode node = new ListNode(val);
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
