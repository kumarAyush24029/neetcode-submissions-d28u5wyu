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
    List<Integer> ls2 = new ArrayList<>();
    
    public void inOrder(TreeNode root, List<Integer> ls){
        if(root==null){
            ls.add(90);
            return;
        }
        inOrder(root.left,ls);
        ls.add(root.val);
        inOrder(root.right,ls);
    }
    public void preOrder(TreeNode root, List<Integer> ls){
        if(root==null){
            ls.add(90);
            return;
        }
        ls.add(root.val);
        preOrder(root.left,ls);
        preOrder(root.right,ls);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inOrder(p,ls);
        inOrder(q,ls2);
        preOrder(p,ls);
        preOrder(q,ls2);
        System.out.println(ls);
        System.out.println(ls2);
        return ls.equals(ls2);

        
    }
}
