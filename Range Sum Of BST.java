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
    int Low = 0;
    int High = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        Low = low;
        High = high;
        Inorder(root);
        int result = 0;
        for(int i = 0;i < list.size();i++){
            result = result + list.get(i);
        }
        return result;
        
    }
    public void Inorder(TreeNode node){
        if(node == null){
            return;
        }
        Inorder(node.left);
        if(node.val > Low-1 && node.val < High+1){
           list.add(node.val);
        }
        Inorder(node.right);
    }
}