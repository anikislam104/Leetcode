import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 *  */
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
            this.left = left;
             this.right = right;
         }
 }
class BTInorderHelper {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        TreeNode pseudo_root=root;
        TreeNode prev_root=null;
        while (pseudo_root.left!=null){
            prev_root=pseudo_root;
            pseudo_root=pseudo_root.left;
        }
        inorder.add(pseudo_root.val);
        inorder.add(prev_root.val);
    }
}
public class BTInorder {

}
