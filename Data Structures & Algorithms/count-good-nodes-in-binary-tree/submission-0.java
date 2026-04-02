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
    int count=0;
    public boolean checkgood(TreeNode root){
        if(root==null) return false;
        
        
        if(root.right!=null){
            if(root.right.val>=root.val){
                count+=1;

            }
            else root.right.val = root.val;
            System.out.println(root.right.val);
            
        }
        if(root.left!=null){
            if(root.left.val>=root.val){
                count+=1;
            }
            else root.left.val=root.val;
            
        }
        return checkgood(root.right) || checkgood(root.left);
        
        

    }
    
    public int goodNodes(TreeNode root) {
        if(root!=null) count+=1;
        checkgood(root);
        return count;
        
        
    }
}
