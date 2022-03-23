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
import java.util.*;
class Solution {
    public List<Integer> list = new ArrayList<Integer>();
    public TreeNode increasingBST(TreeNode root) {
        //we have to do inoder traversal means elements are arranged in ascending order
        Inorder(root);
        Collections.sort(list);
        
        TreeNode new_root = new TreeNode(list.get(0));
        TreeNode temp = new_root;
        for(int i = 1;i < list.size();i++){
            temp.right = new TreeNode(list.get(i));
            temp = temp.right;
        }
        return new_root;
        
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