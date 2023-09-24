class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>=3){    //check n greater than or equi to three 
            if(n%3 != 0){   //n % 3 remainder not 0 
                return false; //then it is false
            } 
            n = n/3;  //reducing number
        }
       return n==1;   //after reducing 
    }
}