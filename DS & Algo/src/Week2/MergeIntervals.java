//https://leetcode.com/problems/merge-intervals/
package Week2;

import java.util.*;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0;i<intervals.length;i++){
            if(arr==null || arr.isEmpty()){

                List<Integer> list = new ArrayList();
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
                arr.add(list);

            }

            else{

                List<Integer> lastAddedList = arr.get(arr.size()-1);

                if(intervals[i][0]>=lastAddedList.get(0) && intervals[i][0]<=lastAddedList.get(1)){
                    if(intervals[i][1]>=lastAddedList.get(1)){
                        lastAddedList.set(1,intervals[i][1]);
                    }

                }

                else if(intervals[i][0]<=lastAddedList.get(0) && lastAddedList.get(0)<=intervals[i][1]){

                    lastAddedList.set(0,intervals[i][0]);

                    if(intervals[i][1]>=lastAddedList.get(1)){
                        lastAddedList.set(1,intervals[i][1]);
                    }

                }

                else{
                    List<Integer> a1 = new ArrayList<>();
                    a1.add(intervals[i][0]);
                    a1.add(intervals[i][1]);
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
