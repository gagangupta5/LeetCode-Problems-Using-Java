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
    int res=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return res;
        int n=0;
        helper(root, n);
        return res;
    }
    private void helper(TreeNode root, int n){
        if(root.left==null && root.right==null){
            n=n*10+root.val;
            res+=n;
            return;
        }
        if(root.left!=null) helper(root.left, n*10+root.val);
        if(root.right!=null) helper(root.right, n*10+root.val);
    }
}
