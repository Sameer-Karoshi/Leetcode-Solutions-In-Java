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
    TreeNode head = null;
    TreeNode tail = null;
    public void flatten(TreeNode root) {
        Preorder(root);
        if(root != null){
            head = root;
            tail = root;
            root.left = null;
            root.right = null;
        }
        for(int i = 1;i < list.size();i++){
            AddNodeToLL(list.get(i));
        }
    }
    public void Preorder(TreeNode node){
        if(node == null){
            return;
        }
        list.add(node.val);
        Preorder(node.left);
        Preorder(node.right);
    }
    public void AddNodeToLL(int val){
        TreeNode node = new TreeNode(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.left = null;
            tail.right = node;
            tail = tail.right;
        }
    }
}
