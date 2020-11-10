package week3;

//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.*;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {

        if(s=="" || s==" "){
            return -1;
        }

        char ch = 'A';

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i = 0;i<s.length();i++){

            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }

            else{
                map.replace(s.charAt(i),Integer.parseInt(String.valueOf(map.get(s.charAt(i))))+1);
            }
        }

        for (Map.Entry mapElement : map.entrySet()) {

            if((int)mapElement.getValue()==1){
                ch = (char)mapElement.getKey();
                break;
            }
        }

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return i;

            }
        }

        return -1;

    }
}