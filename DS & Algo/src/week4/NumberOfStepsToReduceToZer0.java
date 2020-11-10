//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
package week4;

public class NumberOfStepsToReduceToZer0 {

    public int numberOfSteps (int num) {
        return getSteps(num,0);
    }

    public int getSteps(int num,int count){
        if(num==0){
            return count;
        }

        if(num%2==0){
            num /=2;
            count++;
            return getSteps(num,count);
        }

        else if(num%2!=0){
            num -=1;
            count++;
            return getSteps(num,count);
        }

        return 0;
    }
}