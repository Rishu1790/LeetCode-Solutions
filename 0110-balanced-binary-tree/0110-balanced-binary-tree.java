class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int leftH = checkHeight(root.left);
        if (leftH == -1) return -1; // Left subtree is not balanced

        int rightH = checkHeight(root.right);
        if (rightH == -1) return -1; // Right subtree is not balanced

        if (Math.abs(leftH - rightH) > 1) return -1; // Current node is not balanced

        return 1 + Math.max(leftH, rightH);
    }
}