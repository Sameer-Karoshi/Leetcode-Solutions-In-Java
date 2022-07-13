class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {  
        
        List<List<Integer>> levelOrderList = new ArrayList<>();    
        levelOrder(root, 0, levelOrderList);
        return levelOrderList;
    }
    
    void levelOrder(TreeNode node, int level, List<List<Integer>> levelOrderList){
       
        if(node == null) {
            return;
        }
        
        // add element in inner list if present for that level  
        // or create new inner list and insert 
        if(levelOrderList.size() == level){
            List<Integer> levelList = new ArrayList<>();
            levelList.add(node.val);
            levelOrderList.add(level, levelList);
        } else {
            levelOrderList.get(level).add(node.val);
        }
        
        level++;
        levelOrder(node.left, level, levelOrderList); 
        levelOrder(node.right, level, levelOrderList);
    }
}
