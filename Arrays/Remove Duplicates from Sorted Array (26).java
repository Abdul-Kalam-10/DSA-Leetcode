class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;  //j set to index 0
        for(int i = 0; i<nums.length; i++){ //i from 0 to length of arr , i++
            if(nums[j] != nums[i])   //check j != i ,then make j inc by 1    
            { 
              nums[++j]=nums[i]; //then move i element to j
            }
        }
        return j+1;    //j+1 actual count start from 0 ,to return size we hava to 
    }                  //return +1 of j
}