/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    public TreeNode Root = null;
    public List<Integer> list = new ArrayList<Integer>();
    public int i = 0;
    public BSTIterator(TreeNode root) {
       Root = root;
       Inorder(root);
    }
    
    public int next() {
       int result = list.get(i);
       i++;
       return result;
    }
    
    public boolean hasNext() {
       if(i > list.size()-1){
           return false;
       } 
        return true;
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

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
