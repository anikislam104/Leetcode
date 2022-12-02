import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(stack.peek()!=null){
            TreeNode top=stack.peek();
            if(top.left==null){
                inorder.add(top.val);
                System.out.println(top.val);
                stack.pop();
                if(top.right!=null){
                    stack.push(top.right);
                }
            }
            else {
                System.out.println();
                stack.push(top.left);
            }
        }
        return inorder;
    }
}
public class BTInorder {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(2,null,null);
        TreeNode b=new TreeNode(3,a,null);
        TreeNode c=new TreeNode(5,null,null);
        TreeNode d=new TreeNode(4,c,null);
        TreeNode e=new TreeNode(2,b,d);
        BTInorderHelper bt=new BTInorderHelper();
        bt.inorderTraversal(e);
    }
}
