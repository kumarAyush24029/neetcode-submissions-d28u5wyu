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
    int maxdepth(TreeNode root){
        if(root==null) return 0;
        int count = Math.max(maxdepth(root.left),maxdepth(root.right))+1;
        return count;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff = maxdepth(root.left)-maxdepth(root.right);
        // System.out.println(diff);
        if(diff > 1 || diff<-1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));

        
    }
}
