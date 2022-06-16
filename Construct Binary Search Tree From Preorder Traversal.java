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
    TreeNode root = null;
    public TreeNode bstFromPreorder(int[] preorder) {
        for(int i = 0;i < preorder.length;i++){
            insert(preorder[i]);
        }
        return root;
    }
    public void insert(int data) {  
          //Create a new node  
          TreeNode newNode = new TreeNode(data);    
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              TreeNode current = root, parent = null;  
              while(true) {    
                  parent = current;  
 
                  if(data < current.val) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
  
}
