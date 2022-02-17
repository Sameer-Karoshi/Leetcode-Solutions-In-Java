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
import java.util.*;
class Solution {
    public ListNode head = null;    
    public ListNode tail = null;    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1==null){
           return list2; 
        }    
        if(list2==null){
            return list1;
        }
        int size_1 = 0;
        int size_2 = 0;
        
        ListNode CurrentNode_1 = list1;
        while(CurrentNode_1 != null){
            size_1++;
            CurrentNode_1 = CurrentNode_1.next;
        }
        ListNode CurrentNode_2 = list2;
        while(CurrentNode_2 != null){
            size_2++;
            CurrentNode_2 = CurrentNode_2.next;
        }
        //Move towards end of list2
        ListNode CurrentNode = list2;
        while(CurrentNode.next != null){
            CurrentNode = CurrentNode.next;
        }
        //System.out.println(CurrentNode.val);
        CurrentNode.next = list1;
        int[] array = new int[size_1 + size_2];
        
        int i = 0;
        ListNode Current = list2;
        while(Current != null){
           array[i] = Current.val;
           Current = Current.next;
           i++;
        }
       Arrays.sort(array);
        for(int j = 0;j < array.length;j++){
            addNode(array[j]);
        }
        
       return head;
    }
    
    //Create Linkedlist
      public void addNode(int data) {    
        //Create a new node    
        ListNode newNode = new ListNode(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
}