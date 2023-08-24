class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum = nums[0]; //initialized to 0
        int Sum = nums[0];   //initialized to 0

        for(int i=1; i<nums.length; i++){ //Element starts from 1 till last nums.length
            //Join
            if(Sum >= 0)     //sum should be >= 0
            {
                Sum = Sum + nums[i]; //then sum with last subarray
            }
            //Don't join
            else{ 
                Sum = nums[i]; //when (-ve) element comes newly element is sum  
            }
            if(Sum > MaxSum){   //when sum greater than maxsum
                MaxSum = Sum;  //maxsum will be sum value 
            }

        }
        return MaxSum;     //finally return the maxsum, max-subarray
    }
}