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
    Set<Integer> treeset = new TreeSet<Integer>();
    public int findSecondMinimumValue(TreeNode root) {
        Inorder(root);
         if(treeset.size() == 1){
            return -1;
        }
        Integer[] result = treeset.toArray(new Integer[treeset.size()]);
        return (int)result[1];
    }
    public void Inorder(TreeNode node){
        if(node == null){
            return;
        }
        Inorder(node.left);
        treeset.add(node.val);
        Inorder(node.right);
    }
}
