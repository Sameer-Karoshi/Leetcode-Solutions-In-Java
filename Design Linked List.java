class MyLinkedList {
    //create one inner class for creating node
    class Node{    
        int val;    
        Node next;    
        //constructor 
        public Node(int val) {    
            this.val = val;    
            this.next = null;    
        }    
    }
    
    public Node head = null;
    public Node tail = null;
    public int size = 0;
    public MyLinkedList() {
        //lets keep this empty
    }
    
    public int get(int index) {
        if(index >= size){
            return -1;
        }
        Node current = head;
        for(int i = 0;i <= index-1;i++){
            current = current.next;
        }       
        return current.val;    
    }
    
    public void addAtHead(int val) {
        size++;
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        //System.out.println("After adding new head: ");
        //Print(head);
    }
    
    public void addAtTail(int val) {
        if(head == null){
            addAtHead(val);
            return;
        }
        size++;
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        //size++;
        //System.out.println("After adding at tail: ");
        //Print(head);
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        else if(index == size){
            addAtTail(val);
            return;
        }
        size++;
        Node node = new Node(val);
        Node current = head;
        for(int i = 0;i <= index-2;i++){
            current = current.next;
        }
        //size++;
        node.next = current.next;
        current.next = node;
        //System.out.println("After adding at index: ");
        //Print(head);
        
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || head == null){
            return;
        }
        else if(head != null && index == 0){
            head = head.next;
            size--;
            return;
        }
        else{
            Node current = head;
            for(int i = 0;i <= index-2;i++){
                current = current.next;
            }
            if(index == size-1){
                tail = current;
                tail.next = null;
                
            }
            else{
                current.next = current.next.next;
            }
        }
        size--;
        //System.out.println("After deleting at index: ");
        //Print(head);
    }
    public void Print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
