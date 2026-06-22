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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            int loop = nodeQueue.size();
            int rightSide = 0;
            for(int i = 0; i < loop; i++){
                TreeNode node = nodeQueue.poll();
                rightSide = node.val;
                if(node.left != null) nodeQueue.add(node.left);       
                if(node.right != null) nodeQueue.add(node.right); 
            } 
            ans.add(rightSide);
        }

        return ans;
    }
}
