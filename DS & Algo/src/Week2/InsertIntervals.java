//https://leetcode.com/problems/insert-interval/

package Week2;

import java.util.*;

public class InsertIntervals {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] newIntervals = new int[intervals.length+1][2];
        newIntervals[newIntervals.length-1][0] = newInterval[0];
        newIntervals[newIntervals.length-1][1] = newInterval[1];


        for(int i = 0;i<intervals.length;i++){

            for(int j = 0;j<intervals[i].length;j++){

                newIntervals[i][j] = intervals[i][j];

            }
        }

        Arrays.sort(newIntervals, (a, b) -> a[0] - b[0]);
        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0;i<newIntervals.length;i++){
            if(arr==null || arr.isEmpty()){

                List<Integer> list = new ArrayList();
                list.add(newIntervals[i][0]);
                list.add(newIntervals[i][1]);
                arr.add(list);

            }

            else{

                List<Integer> lastAddedList = arr.get(arr.size()-1);

                if(newIntervals[i][0]>=lastAddedList.get(0) && newIntervals[i][0]<=lastAddedList.get(1)){
                    if(newIntervals[i][1]>=lastAddedList.get(1)){
                        lastAddedList.set(1,newIntervals[i][1]);
                    }

                }

                else if(newIntervals[i][0]<=lastAddedList.get(0) && lastAddedList.get(0)<=newIntervals[i][1]){

                    lastAddedList.set(0,newIntervals[i][0]);

                    if(newIntervals[i][1]>=lastAddedList.get(1)){
                        lastAddedList.set(1,newIntervals[i][1]);
                    }

                }

                else{
                    List<Integer> a1 = new ArrayList<>();
                    a1.add(newIntervals[i][0]);
                    a1.add(newIntervals[i][1]);
                    arr.add(a1);
                }
            }
        }

        int [][] finalArr = new int[arr.size()][2];
        for(int i = 0;i<arr.size();i++){
            for(int j = 0;j<arr.get(i).size();j++){
                finalArr[i][j] = arr.get(i).get(j);
            }
        }

        return finalArr;

    }

}


