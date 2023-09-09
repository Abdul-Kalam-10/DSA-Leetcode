class Solution {
    public int missingNumber(int[] nums) {
        //using XOR operator//  
        int xor =0;
        //xor all numbers from range 0 - n//
        for(int i=0; i<= nums.length; i++) {
            xor = xor ^ i;
        }
        //xor input with already xored nums//
         for(int num : nums){
             xor = xor ^ num;
         }
        //missing number//
        return xor; 
    }
}