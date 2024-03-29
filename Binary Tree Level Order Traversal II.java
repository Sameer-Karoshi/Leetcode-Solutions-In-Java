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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        if (root == null) {
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> temp = new ArrayList();
            for(int i=0; i<len; i++){
                TreeNode cur = q.poll();
                temp.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            res.add(0, temp);
        }
        return res;
    }
}