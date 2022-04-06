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
    public int Value = 0;
    TreeNode ResultNode = null;
    public TreeNode searchBST(TreeNode root, int val) {
        Value = val;
        Inorder(root);
        return ResultNode;
    }
    public void Inorder(TreeNode node){
        if(node == null){
            return;
        }
        Inorder(node.left);
         if(node.val == Value){
            ResultNode = node;
            return;
        }
        Inorder(node.right);
    }
}