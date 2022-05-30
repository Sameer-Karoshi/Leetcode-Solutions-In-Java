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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        Inorder(root);
        for(int i = 0;i < list.size();i++){
            for(int j = i + 1;j < list.size();j++){
                if(k == list.get(i) + list.get(j)){
                    return true;
                }
            }
        }
        return false;
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
