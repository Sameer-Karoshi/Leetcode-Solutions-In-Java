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
    List<Integer> list = new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
        Inorder(root);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < list.size()-1;i++){
            int val = Math.abs(list.get(i)-list.get(i+1));
            if(val<min){
                min = val;
            }
        }
        return min;
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
