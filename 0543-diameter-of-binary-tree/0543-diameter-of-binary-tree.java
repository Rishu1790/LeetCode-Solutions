class Solution {
    // Global variable to keep track of the maximum diameter found so far
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight(root);
        return maxDiameter;
    }

    private int calculateHeight(TreeNode root) {
        if (root == null) return 0;

        // Step 1: Left aur Right subtree ki height nikalo
        int leftH = calculateHeight(root.left);
        int rightH = calculateHeight(root.right);

        // Step 2: Current node ke through banne wale diameter ko check karo
        maxDiameter = Math.max(maxDiameter, leftH + rightH);

        // Step 3: Parent ko apni height return karo
        return 1 + Math.max(leftH, rightH);
    }
}