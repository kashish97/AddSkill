package Week2;

public class SortColors {

    public void sortColors(int[] nums) {
        //count of zeros,1s and 2s
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i = 0;i<nums.length;i++){

            if(nums[i]==0){
                countZero++;
            }
            else if(nums[i]==1){
                countOne++;
            }
            else if(nums[i]==2){
                countTwo++;
            }
        }

        int j = 0;
        //traversing from 0 to 0count and so on and setting the elements
        while(j<countZero){
            nums[j] = 0;
            j++;
        }

        while(j<countZero+countOne){
            nums[j] = 1;
            j++;
        }

        while(j<countZero+countOne+countTwo){
            nums[j] = 2;
            j++;
        }
    }

    //Second method
    public void sortColors2(int[] nums) {
        //lowest element index less than pivot
        int lowRange = 0;
        //element index greater than pivot
        int highRange = nums.length-1;
        int i = 0;
        int j = nums.length-1;
        while(i<nums.length){
            if(nums[i]==0){
                int temp = nums[lowRange];
                nums[lowRange] = nums[i];
                nums[i] = temp;
                lowRange++;
            }
            i++;
        }

        while(j>=0){
            if(nums[j]==2){
                int temp = nums[highRange];
                nums[highRange] = nums[j];
                nums[j] = temp;
                highRange--;
            }
            j--;
        }
    }
}
