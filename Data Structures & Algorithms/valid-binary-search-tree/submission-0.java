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
    public boolean isValidBST(TreeNode root) {
        return checkBounds(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkBounds(TreeNode node , long lowerBound , long upperBound){
        if(node == null) return true;

        if(!(node.val > lowerBound && node.val < upperBound )) return false;
      
        return checkBounds(node.left,lowerBound,node.val) &&
                checkBounds(node.right,node.val,upperBound);
    }
}
