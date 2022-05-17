/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode result = null;
    public int value = 0;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        value = target.val;
        Inorder(cloned);
        return result;
    } 
    public void Inorder(TreeNode node){
        if(node == null){
            return; 
        }
        Inorder(node.left);
        if(node.val == value){
            result = node;
            return;
        }
        Inorder(node.right);
    }
}
