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
class Solution {
    public List<Integer> list = new ArrayList<Integer>();
    public boolean isUnivalTree(TreeNode root) {
        Inorder(root);
        boolean result = false;
        int val = list.get(0);
        int i = 1;
        for(i = 1;i < list.size();i++){
            if(val != list.get(i)){
                break;
            }
        }
        if(i == list.size()){
            result = true;
        }
        return result;
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