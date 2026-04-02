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
    ArrayList<Integer> ls = new ArrayList<>();

    public void inOrder(TreeNode root){
        if(root==null) return;

        inOrder(root.left);
        ls.add(root.val);
        inOrder(root.right);
    }
    public boolean isSorted(ArrayList<Integer> list) {
  
        for(int i = 0; i < list.size() - 1; i++) {
            
        
            if(list.get(i) >= list.get(i + 1)) {
                return false;
            }
    }
    
    return true; // sorted
}
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        
        return isSorted(ls);



       

        

        // if(root==null) return true;
        // if(root.left==null && root.right==null) return true;
        // // if(root.right==null && root.left!=null){
        // //     if(root.r)
        // // }
        // if(root.left != null){
        //     if(root.left.val>=root.val){
        //         return false;
        //     }
        //     // if(root.left.left==null) return true;
            
        // }
        // if(root.right !=null){
        //     if(root.right.val<=root.val){
        //         return false;
        //     } 
        //     // if(root.right.right==null) return true;       
        // }
        
        // return  (isValidBST(root.left) && isValidBST(root.right));
        
          
        
        
    }
}
