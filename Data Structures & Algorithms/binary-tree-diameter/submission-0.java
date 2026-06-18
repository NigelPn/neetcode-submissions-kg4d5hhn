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
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        heightCheck(root);
        return ans;
    }

    public int heightCheck(TreeNode root){
        if (root == null) return 0;

        int leftHeight = heightCheck(root.left);
        int rightHeight = heightCheck(root.right);

        int diameterOfNode = leftHeight+rightHeight;
        ans = Math.max(diameterOfNode,ans);

        return 1 + Math.max(leftHeight,rightHeight);
    }
}
