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
        if(root == null)
            return 0;

        int[] ans = new int[1];
        ans[0]++;
        count(root.left, root.val, ans);
        count(root.right,root.val, ans);
        return ans[0];
    }

    private void count(TreeNode root, int max, int[] ans){
        if(root == null)
            return;
        if(root.val >= max){
            ans[0]++;
            count(root.left, root.val, ans);
            count(root.right,root.val,ans);
        }
        if(root.val < max){
            count(root.left,max,ans);
            count(root.right,max,ans);
        }
    }
}
