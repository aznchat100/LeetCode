/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * Iterative:
 * public class Flatten {
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        //stack.push(root.right);
        //stack.push(root.left);
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            if(current.right != null)
                stack.push(current.right);
            if(current.left != null)
                stack.push(current.left);
            if(!stack.isEmpty()){
                current.right = stack.peek();
            }
             current.left = null;   
        }
    }
}
 */
public class Solution {
    public void flatten(TreeNode root){
        if(root == null)
            return;
            
        flatten(root.left);
        flatten(root.right);
        
        TreeNode right = root.right;
        if(root.left != null){
            root.right = root.left;
            root.left = null;
            
            while(root.right != null)
                root = root.right;
            root.right = right;
        }
    }
}