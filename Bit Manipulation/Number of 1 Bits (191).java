public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;    //ones var init to return ones at end 
        for(int i=0;i<=31;i++){ //for loop from 0 - 31 (32 bits)
            ones += n & 1;  //0 & 1 = 0 // 1 & 1 = 1 ,add ones count into ones  
            n = n >> 1;      //then rigth shift 1 bit
        }
        return ones;  //return the final ones which contains 
    }                 //the count of number of ones
}
