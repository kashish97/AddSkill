package Week1;

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        //Size of array
        int n = nums.length;
        //Initializing majority element as -1
        int majority = -1;
        Arrays.sort(nums);
        int count = 1;

        if(nums.length==1){
            return nums[0];
        }

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                //Check if the frequency is greater than size/2(Majority condition)
                if(count>n/2){
                    majority = nums[i];
                    return majority;
                }
            }
            //Next element count initialized by 1
            else{
                count = 1;
            }
        }
        return majority;
    }

    public static void main(String [] args){
        int [] arr = {3,2,3};
        System.out.print(majorityElement(arr));
    }
}
