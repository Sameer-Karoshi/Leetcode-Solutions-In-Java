class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {        
        Inorder(root);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < list.size();i++){
            map.put(list.get(i),0);
        }
        for(int i = 0;i < list.size();i++){
            int val = map.get(list.get(i));
            val++;
            map.put(list.get(i),val);
        }
        
        int max = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = (int)entry.getValue();
            max = Math.max(max,val);       
        }
        int size = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = (int)entry.getValue();
            if(val == max){
                size++;
            }       
        }
        int[] res = new int[size];
        int i = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = (int)entry.getValue();
            if(val == max){
                res[i++] = (int)entry.getKey();
            }     
        }
        
      return res;  
        
    }
    public void Inorder(TreeNode node){
        if(node == null){
            return;
        }
        Inorder(node.left);
        list.add(node.val);
        Inorder(node.right);
    }
}
