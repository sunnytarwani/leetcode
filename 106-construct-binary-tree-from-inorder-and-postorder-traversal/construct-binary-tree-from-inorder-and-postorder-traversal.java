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
    public int pointer;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        pointer = postorder.length - 1;
        
        // Create a map from inorder values to their indices
        for(int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }

        // Start the recursive building of the tree
        return buildPostOrder(postorder, 0, postorder.length - 1, hm);
    }

    private TreeNode buildPostOrder(int[] postorder, int start, int end, HashMap<Integer, Integer> hm) {
        if (start > end || pointer < 0) {
            return null;
        }

        // Get the current root value and decrement the pointer
        int value = postorder[pointer];
        pointer--;
        TreeNode root = new TreeNode(value);
        
        // Find the index of this value in the inorder array
        int index = hm.get(value);

        // Build right subtree first because of postorder nature
        root.right = buildPostOrder(postorder, index + 1, end, hm);
        root.left = buildPostOrder(postorder, start, index - 1, hm);

        return root;
    }
}