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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        // Use the root's value as the single required value for all nodes
        return helper(root, root.val);
    }

    private boolean helper(TreeNode node, int targetValue) {
        // Base Case: Base null nodes are valid
        if (node == null) {
            return true;
        }

        // If current node's value doesn't match the target value, it's not univalued
        if (node.val != targetValue) {
            return false;
        }

        // Recursively check left and right subtrees
        return helper(node.left, targetValue) && helper(node.right, targetValue);
    }
}