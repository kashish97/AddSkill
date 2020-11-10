package week3;
//    https://leetcode.com/problems/daily-temperatures/

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {

        int [] returnArr = new int[T.length];
        int k = 0;

        for(int i = 0;i<T.length-1;i++){
            for(int j = i+1;j<T.length;j++){
                if(T[j]>T[i]){
                    returnArr[k] = j-i;
                    break;

                }
            }

            k++;
        }

        return returnArr;
    }

}
