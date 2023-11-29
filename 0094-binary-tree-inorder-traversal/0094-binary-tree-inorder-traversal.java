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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ar = new ArrayList<>();
        return sol(root , ar);       
    }

    public ArrayList<Integer> sol(TreeNode root , ArrayList<Integer> ar){
        if(root == null){
            return ar;
        }

        sol(root.left , ar);
        ar.add(root.val);
        sol(root.right , ar);

        return ar;
    }
}