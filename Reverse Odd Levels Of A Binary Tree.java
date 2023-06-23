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
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        int level = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            if (level % 2 != 0) {
                List<Integer> list = new ArrayList<>();
                for (TreeNode node: q) {
                    list.add(0,node.val);
                }

                for (TreeNode node: q) {
                    node.val = list.get(0);
                    list.remove(0);
                }
            } 
            for(int i=0; i<len; i++){
                TreeNode cur = q.poll();
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            level++;
        }
        return root;
    }
}