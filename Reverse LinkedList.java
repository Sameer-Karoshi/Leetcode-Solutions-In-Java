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
    public ListNode Head = null;
    public ListNode Tail = null;
    
    public ListNode reverseList(ListNode head) {
        //First Calculate the size of LL
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
        
        //Create new LinkedList
        for(int j = size-1;j > -1;j--){
           addNode(array[j]); 
        }
        
     return Head;   
    }
       
    public void addNode(int data) {    
           
        ListNode newNode = new ListNode(data);    
                
        if(Head == null) {      
            Head = newNode;    
            Tail = newNode;    
        }    
        else {        
            Tail.next = newNode;     
            Tail = newNode;    
        }    
    }    
}