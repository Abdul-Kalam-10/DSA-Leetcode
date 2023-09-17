class Solution {
    public int singleNumber(int[] nums) {
        //0 index starting//
        int single = nums[0];
        //Loop starts from index 1 comparing single index 0//
        for(int i=1;i<nums.length;i++){
            //xor comparing first 0 & 1 then i++//
            single = single ^ nums[i];
        }
        //return single element left//
        return single; 
    }
}