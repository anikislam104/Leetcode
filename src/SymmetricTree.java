import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SymmetricTreeHelper {
    public boolean isEqualLists(List<Integer> a,List<Integer> b){
        if(a.size()!=b.size()){
            return false;
        }
        int mismatch=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)!=b.get(i)){
                mismatch++;
                break;
            }
        }
        if(mismatch==0) return true;
        else return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        else if(root.left!=null && root.right==null){
            return false;
        }
        else if(root.right!=null && root.left==null){
            return false;
        }
        TreeNode treeNode=new TreeNode();
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> inorder=new ArrayList<>();
        List<Integer> postorder=new ArrayList<>();
        TreeNode left_root=root.left,right_root=root.right;
        //inorder traversal
        TreeNode curr=left_root;
        while (curr!=null || !stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            inorder.add(-101);
            curr=stack.peek();
            inorder.add(curr.val);
            stack.pop();
            curr=curr.right;
        }

        //postorder traversal
        curr=right_root;
        while (curr!=null || !stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.right;
            }
            postorder.add(-101);
            curr=stack.peek();
            postorder.add(curr.val);
            stack.pop();
            curr=curr.left;
        }
        //print inorder and postorder
        System.out.println("Inorder traversal is: ");
        for (int i:inorder){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Postorder traversal is: ");
        for (int i:postorder){
            System.out.print(i+" ");
        }
        return isEqualLists(inorder, postorder);
    }
}
public class SymmetricTree {
    public static void main(String[] args) {
        //[1,2,2,2,null,2] like tree
        TreeNode a=new TreeNode(2,null,null);
        TreeNode b=new TreeNode(2,a,null);
        TreeNode c=new TreeNode(2,null,null);
        TreeNode d=new TreeNode(2,c,null);
        TreeNode e=new TreeNode(1,b,d);
        SymmetricTreeHelper symmetricTreeHelper=new SymmetricTreeHelper();
        System.out.println(symmetricTreeHelper.isSymmetric(e));
    }
}
