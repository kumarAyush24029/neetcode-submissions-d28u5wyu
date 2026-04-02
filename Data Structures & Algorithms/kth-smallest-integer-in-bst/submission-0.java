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
    List<Integer> ls = new ArrayList<>();
    public boolean inorder(TreeNode root){
        if(root==null) return false;

        inorder(root.left);
        ls.add(root.val);
        inorder(root.right);
        return true;
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return ls.get(k-1);

        
    }
}
