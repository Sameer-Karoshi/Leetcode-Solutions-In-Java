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
    public int[] nextLargerNodes(ListNode head) {
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        current = head;
        int k = 0;
        int[] arr = new int[size];
        while(current != null){
            arr[k++] = current.val;
            current = current.next;
        }
        for(int i = 0;i < arr.length;i++){
            int element = 0;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j]>arr[i]){
                    element = arr[j];
                    break;
                }
            }
            arr[i] = element;
        }
        return arr;
    }
}
