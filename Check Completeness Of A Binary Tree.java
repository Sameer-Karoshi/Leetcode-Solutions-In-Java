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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) {
            return false;
        }

        boolean nullfound=false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            System.out.println(size);
            for(int i = 0;i < size;i++){
                TreeNode curr = q.poll();
                if(curr == null) nullfound=true;
                else {
                    if(nullfound) return false;
                    else{
                        q.add(curr.left);
                        q.add(curr.right);
                    }
                } 
            }
        }
        return true;
    }
}