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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            int temp1 = Integer.MAX_VALUE;
            int temp2 = Integer.MIN_VALUE;
            for(int i = 0;i < size;i++) {
                TreeNode curr = queue.poll();
                if(level % 2 == 0 && curr.val % 2 == 0) return false;
                if(level % 2 != 0 && curr.val % 2 != 0) return false;
                if (level % 2 == 0) {
                    if(temp2 >= curr.val) return false;
                    else temp2 = curr.val;
                } else {
                    if(temp1 <= curr.val) return false;
                    else temp1 = curr.val;
                }
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            level++;
        }
        return true;
    }
}