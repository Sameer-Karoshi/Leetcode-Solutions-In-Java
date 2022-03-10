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
import java.math.BigInteger;
class Solution {
    public ListNode Head = null;
    public ListNode Tail = null;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode Current1 = l1;
        ListNode Current2 = l2;
        
        String a = "";
        while(Current1 != null){
            int value = Current1.val;
            a = a + Integer.toString(value);
            Current1 = Current1.next;
        }
        
        String b = "";
        while(Current2 != null){
            int value = Current2.val;
            b = b + Integer.toString(value);
            Current2 = Current2.next;
        }
        
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        
        BigInteger C = A.add(B); 
        String c = C.toString();
        
        String[] array = c.split("");
    
        for(int i = 0;i < array.length;i++){
            int value = (int)Integer.valueOf(array[i]);
            //System.out.println(value);
            addNode(value);
        }
      return Head;  
    }
    
    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(Head == null){
            Head = newNode;
            Tail = newNode;
        }
        else{
            Tail.next = newNode;
            Tail = newNode;
        }
    }
}