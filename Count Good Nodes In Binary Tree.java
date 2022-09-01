class Solution {
    int result = 0;
    public int goodNodes(TreeNode root) {
        preorder(root, root.val);
        return result;
    }
    private void preorder(TreeNode root, int max) {
        if (root != null) {
            if (root.val >= max) { 
                result++; 
            }
            preorder(root.left, Math.max(root.val, max));
            preorder(root.right, Math.max(root.val, max));
        }
    }
}
