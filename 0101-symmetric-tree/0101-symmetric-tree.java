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
    public boolean checkSymmetry(TreeNode lt,TreeNode rt){
        if(lt == null && rt == null){
            return true;
                }
        if(rt == null || lt == null){
            return false;
        }
        if(rt.val!=lt.val){
            return false;
        }

        return checkSymmetry(lt.left,rt.right) && checkSymmetry(lt.right,rt.left);
       
       
    

    }

    public boolean isSymmetric(TreeNode root) {
        if(root== null){
            return false;
        }
        return checkSymmetry(root.left,root.right);
    
        


        
    }
}