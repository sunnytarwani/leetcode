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
    HashMap<Integer , Integer> hm;
    int p;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        hm = new HashMap<>();
        p = 0;

        for(int i = 0 ; i < inorder.length ; i++){
            hm.put(inorder[i] , i);
        }
        
        return build(preorder , 0 , preorder.length-1);
    }

    public TreeNode build(int [] preorder , int s , int e){
        if(s>e){
            return null;
        }

        int temp = preorder[p];
        p++;

        TreeNode root = new TreeNode(temp);
        int r = hm.get(temp);

        root.left = build(preorder , s , r-1 );
        root.right = build(preorder , r+1 , e );

        return root;
    }

}