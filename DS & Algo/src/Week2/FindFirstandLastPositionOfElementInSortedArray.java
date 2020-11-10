package Week2;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstandLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        int start = -1;
    int end = -1;
    int [] arr = new int[2];

        if(nums.length==1 && nums[0]==target){
        arr[0] = 0;
        arr[1] = 0;
        return arr;
    }

        for(int i = 0;i<nums.length-1;i++){

        if(nums[i]==target && start ==-1){
            start = i;
        }

        if(nums[i]==target && nums[i+1]!=target){
            end = i;
        }
    }



        if(nums.length>0 && nums[nums.length-1]==target){
        end = nums.length-1;

        if(start==-1){
            start = nums.length-1;
        }
    }


    arr[0] = start;
    arr[1] = end;

        return arr;

}
}
