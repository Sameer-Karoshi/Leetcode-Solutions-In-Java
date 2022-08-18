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
    public void reorderList(ListNode head) {
        //copying elements from LL into List 1 
        List<Integer> list1 = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            list1.add(current.val);
            current = current.next;
        }
        current = head;
        //reversing elements from List1 into List2
        List<Integer> list2 = new ArrayList<>();
        for(int i = list1.size()-1;i > -1;i--){
            list2.add(list1.get(i));
        }
        //then take element one from List 1 and one from List 2 alternatively
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < list1.size();i++){
            res.add(list1.get(i));
            res.add(list2.get(i));
            if(res.size()>=list1.size()){
                break;
            }
        }
        // if length of the input list is odd then one extra elemnts get added
        //we must remove that element
        if(res.size() == list1.size()+1){
            res.remove(res.size()-1);
        }
        //assigning final values to LL again :)
        int i = 0;
        while(current != null){
            current.val = res.get(i++);
            current = current.next;
        }
        
    }
}
