//https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
package week5;

import classquestions.*;

import java.util.*;

public class AllElementsInTwoBinaryTrees {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    //First Approach
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        this.list1 = new ArrayList<>();
        this.list2 = new ArrayList<>();

        getList1(root1);
        getList2(root2);

        return mergeLists(list1,list2);


    }

    public void getList1(TreeNode root1){

        if(root1==null){
            return;
        }


        getList1(root1.left);

        list1.add(root1.val);


        getList1(root1.right);

        return;

    }

    public void getList2(TreeNode root2){

        if(root2==null){
            return;
        }


        getList2(root2.left);

        list2.add(root2.val);

        getList2(root2.right);

        return;

    }

    public List<Integer> mergeLists(List<Integer> list1,List<Integer> list2){

        int i = 0;
        int j = 0;
        System.out.println(list1);
        System.out.print(list2);
        List<Integer> finalList = new ArrayList<>();

        while(i<list1.size() && j<list2.size()){

            if(list1.get(i)<=list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }

            else{
                finalList.add(list2.get(j));
                j++;
            }
        }

        if(i!=list1.size()){

            while(i<list1.size()){
                finalList.add(list1.get(i));
                i++;
            }
        }

        if(j!=list2.size()){

            while(j<list2.size()){
                finalList.add(list2.get(j));
                j++;
            }
        }

        return finalList;

    }
}