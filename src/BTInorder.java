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
//    List<Integer> inorder_recursive=new ArrayList<>();
         public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
    //        System.out.println(stack.peek().val);
        if(root==null){
            return inorder;
        }
        while(!stack.isEmpty()){
            TreeNode top=stack.peek();
    //            System.out.println(top.val);
            if(top.left==null || top.left.val==-1){
                inorder.add(top.val);
    //                System.out.println("No left child of "+top.val);
    //                System.out.println("storing value "+top.val);
                stack.pop();
                if(top.right!=null){
                    stack.push(top.right);
    //                    System.out.println("Has a right child of value "+top.right.val);
                }
                top.val=-1;
            }
            else {
    //                System.out.println("has left child with value "+top.left.val);
                stack.push(top.left);
            }
            //print stack
    //            System.out.print("Stack is: ");
    //            for (TreeNode node:stack){
    //                System.out.print(node.val+" ");
    //            }
            System.out.println();

        }
        return inorder;
    }

    public List<Integer> inorderTraversalGFG(TreeNode root){
        List<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while (curr!=null || !stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.peek();
            stack.pop();
            inorder.add(curr.val);
            curr=curr.right;
        }
        return inorder;
    }

    public List<Integer> inorderTraversalGFGMorrisTraversal(TreeNode root){
        List<Integer> inorder=new ArrayList<>();
        TreeNode curr=root;
        while (curr!=null){
            if(curr.left==null){
                inorder.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode pre=curr.left;
                while (pre.right!=null && pre.right!=curr){
                    pre=pre.right;
                }

                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }

                else {
                    pre.right=null;
                    inorder.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return inorder;
    }


}
public class BTInorder {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(2,null,null);
        TreeNode b=new TreeNode(3,null,a);
        TreeNode c=new TreeNode(5,null,null);
        TreeNode d=new TreeNode(4,c,null);
        TreeNode e=new TreeNode(2,b,d);
        BTInorderHelper bt=new BTInorderHelper();
        List<Integer> inorder=bt.inorderTraversal(e);
        for (Integer i:inorder){
            System.out.print(i+" ");
        }
    }
}
