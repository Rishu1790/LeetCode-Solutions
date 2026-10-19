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
    private int diameterMax = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterMax = 0;
        calculateHeight(root);

        return diameterMax;
        
    }
    public int calculateHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);

        diameterMax =  Math.max(diameterMax,right+left);

         return 1+ Math.max(left,right);



    }
}