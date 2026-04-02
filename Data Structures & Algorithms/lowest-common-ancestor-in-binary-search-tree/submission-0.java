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
    // boolean iscommonparent(TreeNode root,TreeNode one, TreeNode two){
    //     if(root==null) return false;
    //     // boolean a = false;
    //     // boolean b =false;
    //     if(root==one || root ==two) return true; 
        
    //     boolean left = iscommonparent(root.left,one,two);
    //     boolean right = iscommonparent(root.right,one,two);
    //     return left||right;
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TreeNode result=root;
        if(root==null) return null;
        if(root.val == p.val || root.val ==q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null) return root;
        if(left!=null) return left;
        return right;
        
    }
}