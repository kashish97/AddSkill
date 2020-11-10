package week3;

//https://leetcode.com/problems/group-anagrams/

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> listReturn = new ArrayList<>();


        String [] newStrs = new String [strs.length];

        boolean [] arrNew = new boolean [strs.length];

        for(int i = 0;i<arrNew.length;i++){
            arrNew[i] = false;
        }

        for(int i = 0;i<strs.length;i++){
            newStrs[i] = strs[i];
        }

        for(int i = 0;i<newStrs.length;i++){

            char[] arr = newStrs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            newStrs[i] = s;
        }

        for(int i = 0;i<newStrs.length-1;i++){

            if(arrNew[i]==false){

                Set<Integer> list = new HashSet<>();
                List<String> addList = new ArrayList<>();

                for(int j = i+1;j<newStrs.length;j++){

                    if(arrNew[j]==false){

                        if(newStrs[i].length()==newStrs[j].length()){

                            if(newStrs[i].equals(newStrs[j])){

                                list.add(i);
                                arrNew[i] = true;

                                list.add(j);
                                arrNew[j] = true;

                            }
                        }
                    }
                }

                List<Integer> useSet = new ArrayList<>(list);

                for(int k = 0;k<useSet.size();k++){

                    addList.add(strs[useSet.get(k)]);

                }

                if(addList.size()>0)
                    listReturn.add(addList);

            }
        }

        for(int i = 0;i<strs.length;i++){

            if(arrNew[i]==false){
                List<String> ab = new ArrayList<>();
                ab.add(strs[i]);
                listReturn.add(ab);
            }
        }



        //listReturn.removeIf(x->x.size()==0);


        return listReturn;


    }
}
