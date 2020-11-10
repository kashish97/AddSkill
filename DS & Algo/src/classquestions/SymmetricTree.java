//https://leetcode.com/problems/symmetric-tree/
package classquestions;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if(root==null){
            return true;
        }

        if(root.left==null && root.right==null){
            return true;
        }

        return getSymmetry(root,root);


    }

    public boolean getSymmetry(TreeNode r1 , TreeNode r2){

        if(r1==null && r2==null){
            return true;
        }

        if(r1!=null && r2!=null && r1.val==r2.val){

            if(getSymmetry(r1.left,r2.right) && getSymmetry(r1.right,r2.left)){
                return true;
            }
        }

        return false;

    }
}