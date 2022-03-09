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
    public ListNode deleteDuplicates(ListNode head) {
        //First count the number of elements in LinkedList :)
        int size = 0;
        ListNode Current = head;
        while(Current != null){
            size++;
            Current = Current.next;
        }
        Current = head;
        
        //create the array of size 'size' and store all the elements of LL in array
        int[] array = new int[size];
        int i = 0;
        while(Current != null){
          array[i] = Current.val;
          i++;
          Current = Current.next;
        }
        Current = head;
        
        //Create set
        HashSet<Integer> set=new HashSet();
        for(int j = 0;j < size;j++){
            set.add(array[j]);
        }
        
        //Number: Frequency
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer I: set){
            int value = I;
            int count = 0;
            for(int j = 0;j < size;j++){
                if(array[j] == value){
                    count++;
                }
            }
         map.put(value,count);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value == 1){
                addNode(entry.getKey());
            }
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