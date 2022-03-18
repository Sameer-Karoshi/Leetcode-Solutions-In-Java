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
    public int pairSum(ListNode head) {
        //first count the size of LL :)
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        current = head;
        int[] array = new int[size];
        int i = 0;
        while(current != null){
          array[i] = current.val;
          i++;
          current = current.next;
        }
        
        int index = size/2;
        int maxsum = 0;
        for(int j = 0;j < index;j++){
           int temp = array[j] + array[size-1-j];
            maxsum = Math.max(temp,maxsum);
        }
        return maxsum;
    }
}