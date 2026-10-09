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

public int ht(TreeNode root){
    if(root==null) return 0;
    
    int leftH = ht(root.left);
    int rightH = ht(root.right);

    return 1+Math.max(leftH,rightH);
}


    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        if((ht(root.left)-ht(root.right))>1 || (ht(root.right)-ht(root.left))>1){
            return false;
        }
        boolean right = isBalanced(root.right);
        boolean left = isBalanced(root.left);

        return right&&left;

        
    }
}