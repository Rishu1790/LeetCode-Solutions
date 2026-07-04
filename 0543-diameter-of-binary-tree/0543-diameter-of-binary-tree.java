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
      static class Info{
            int diam;
            int ht;
               Info(int diam, int ht){
                this.diam  = diam;
                this.ht = ht; 
            }

        }

        public static Info diameter(TreeNode root){
            if(root == null){
             return new Info(0,0);

            }
            Info LDiam = diameter(root.left);
            Info RDiam = diameter(root.right);

            int FinalHeight = Math.max(LDiam.ht, RDiam.ht)+1;
            int FinalDiam = Math.max( Math.max(RDiam.diam, LDiam.diam),LDiam.ht+RDiam.ht+1 );

            return new Info(FinalDiam, FinalHeight);

        }
    public int diameterOfBinaryTree(TreeNode root) {
        int diam = diameter(root).diam;
        return diam-1;

        
    }
}