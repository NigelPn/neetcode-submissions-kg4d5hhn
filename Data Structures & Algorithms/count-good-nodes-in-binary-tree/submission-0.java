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
    public int goodNodes(TreeNode root) {
        return dfsGoodNode(root,root.val);
    }

    public int dfsGoodNode(TreeNode node, int currMax){
        if (node == null) return 0 ;

        int res = (node.val >= currMax) ? 1:0;
        currMax = Math.max(currMax, node.val);
        res += dfsGoodNode(node.left,currMax);
        res += dfsGoodNode(node.right,currMax);

        return res;


    }
}
