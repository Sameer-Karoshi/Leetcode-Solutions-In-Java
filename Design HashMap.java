class MyHashMap {
    HashMap<Integer,Integer> map;
    public MyHashMap() {
       map = new HashMap<Integer,Integer>(); 
    }
    
    public void put(int key, int value) {
       map.put(key,value); 
    }
    
    public int get(int key) {
        int result = -1;
        try{
           result = map.get(key); 
        }
       catch(Exception E){
           
       }
       return result;
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */