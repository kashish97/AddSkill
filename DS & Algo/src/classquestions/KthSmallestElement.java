package classquestions;

import java.util.*;

public class KthSmallestElement {
    List<Integer> arr = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> arr = getList(root);
        return arr.get(k - 1);
    }

    public List<Integer> getList(TreeNode root){


        if(root!=null && root.left!=null){

            getList(root.left);

        }

        arr.add(root.val);

        if(root!=null && root.right!=null){
            getList(root.right);

        }

        return arr;
    }
}