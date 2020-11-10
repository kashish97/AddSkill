//https://leetcode.com/problems/validate-binary-search-tree/
package classquestions;


public class IsValidBST {


    static int value = Integer.MIN_VALUE;
    static boolean flag = true;

    public boolean isValidBST(TreeNode root) {
        this.value=-1;
        this.flag = true;
        getBST(root);
        System.out.println(value);
        return flag;
    }
    public void getBST(TreeNode root){

        if(root==null || !this.flag) return ;


        getBST(root.left);
        System.out.println(value);
        if((value==-1 || value<root.val) && this.flag==true ){

            this.value = root.val;
        }
        else{
            this.flag=false;
            return;
        }

        getBST(root.right);
        return;
    }
}

