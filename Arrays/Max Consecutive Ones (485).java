class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;  //count value set to 0
        int max_count = 0;  //max_count will be max value took from count
        for(int i=0;i<nums.length;i++){ //loop till end of the array
            if(nums[i] == 1 ){  //when i == 1
                count ++ ;     //count will inc
                max_count = Math.max(max_count,count); //max_count will be defind with Math.max()
            }
            else{
                count = 0 ; //when i != 1 , count = 0
            }
        }
        return max_count; //return max_count which contains max consecutive ones 
    }
}