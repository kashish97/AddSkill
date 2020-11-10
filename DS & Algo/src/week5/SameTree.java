//https://leetcode.com/problems/same-tree/
package week5;

import classquestions.*;

public class SameTree {
    boolean flag = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {

        this.flag = true;
        validate(p,q);
        return flag;


    }

    public void validate(TreeNode p,TreeNode q){

        if(flag==false){
            return;
        }

        if(p!=null && q==null){
            flag = false;
            return;
        }

        else if(q!=null && p==null){
            flag = false;
            return;
        }

        if(p==null){
            return;
        }

        if(q==null){
            return;
        }

        validate(p.left,q.left);

        if(p.val!=q.val){
            flag = false;
            return;
        }

        validate(p.right,q.right);

        return;

    }


}