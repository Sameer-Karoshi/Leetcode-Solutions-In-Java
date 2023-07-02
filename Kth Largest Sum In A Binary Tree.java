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
    public long kthLargestLevelSum(TreeNode root, int k) {
        // we will use BFS here
        if (root == null) {
            return 0;
        }
        List<Long> listToSort = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            long levelSum = 0;
            for(int i = 0;i < size;i++) {
                TreeNode curr = queue.poll();
                levelSum += curr.val;
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            listToSort.add(levelSum);
        }

        // sort the list
        Collections.sort(listToSort);
        if(k > listToSort.size()) {
            return -1;
        }
        return listToSort.get(listToSort.size() - k);
    }
}