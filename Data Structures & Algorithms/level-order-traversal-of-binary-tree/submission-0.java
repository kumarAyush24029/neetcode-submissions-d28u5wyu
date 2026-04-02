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
    Deque<TreeNode> queue = new ArrayDeque<>();
    List<List<Integer>> traversedls = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root!=null){
           queue.offer(root);
        }
        while(!queue.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode pop = queue.poll();
                ls.add(pop.val);
                if(pop.left!=null){
                    queue.offer(pop.left);
                }
                if(pop.right!=null){
                    queue.offer(pop.right);
                }
            
            }
            traversedls.add(ls);
            ls = new ArrayList<>();


        }
        return traversedls;
        





        
    }
}
