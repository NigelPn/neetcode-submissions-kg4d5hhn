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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queueNode =  new ArrayDeque<>();

        if (root == null) return ans;
        queueNode.add(root);


        while(!queueNode.isEmpty()){
            List<Integer> dummy = new ArrayList<>();
            int loop =  queueNode.size();
            for(int i = 0; i < loop ; i++){
                TreeNode node = queueNode.poll();
                dummy.add(node.val);

                if(node.left !=null) queueNode.add(node.left);
                if(node.right !=null) queueNode.add(node.right);
            }
            ans.add(dummy);
        }
        return ans;
    }
}
