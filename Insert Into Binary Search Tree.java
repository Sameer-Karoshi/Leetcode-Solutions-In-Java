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
    public TreeNode Root;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        Root = root;
        insert(val);
        return Root;
    }
    public void insert(int data) {  
          //Create a new node  
          TreeNode newNode = new TreeNode(data);  
  
          //Check whether tree is empty  
          if(Root == null){  
              Root = newNode;  
              return;  
            }  
          else {  
              //current node point to root of the tree  
              TreeNode current = Root, parent = null;  
  
              while(true) {  
                  //parent keep track of the parent node of current node.  
                  parent = current;  
  
                  //If data is less than current's data, node will be inserted to the left of tree  
                  if(data < current.val) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  //If data is greater than current's data, node will be inserted to the right of tree  
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
