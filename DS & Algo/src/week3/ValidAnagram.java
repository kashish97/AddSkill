//https://leetcode.com/problems/valid-anagram/

package week3;

import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0;i<arr1.length;i++){
            if(arr2[i]!=arr1[i]){
                return false;
            }
        }

        return true;
    }
}
