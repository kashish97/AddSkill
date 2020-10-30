package week3;

//https://leetcode.com/problems/valid-anagram/submissions/

import java.util.*;

public class Anagram {

    public boolean isAnagram(String s, String t) {

        //converting both strings to array of characters
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        //sorting both
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //for anagram length should be exactly same
        if(s.length()!=t.length()){
            return false;
        }
        // if any character is not equal return false
        for(int i = 0;i<arr1.length;i++){
            if(arr2[i]!=arr1[i]){
                return false;
            }
        }

        //if loop is completed return true
        return true;
    }


}
