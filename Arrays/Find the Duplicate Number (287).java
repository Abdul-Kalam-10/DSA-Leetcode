class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){  //i in increasing order
            int index = Math.abs(nums[i]); //each index abs value
            if(nums[index]<0){     //when the index is -ve 
                return index;        //return that index 
            }
            nums[index] = -nums[index];  //index made to -ve as a marking 
        }
        return -1;   //no duplicate found return -1
    }
}