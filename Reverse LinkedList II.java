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
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
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
    
     int[] finalarray = new int[size];
     for(int j = 0;j < size;j++){
         if(j < left-1 || j > right-1){
             finalarray[j] = array[j];
         }
         else{
             int m = j;
             for(int k = right-1;k > left-2;k--){
                 finalarray[m] = array[k];
                 m++;
             }
             j = right-1;
         }
     }
        
    for(int j = 0;j < size;j++){
        addNode(finalarray[j]);
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