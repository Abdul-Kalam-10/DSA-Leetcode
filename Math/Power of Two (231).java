class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n>=2){    //check n greater than or equi to three 
            if(n%2 != 0){   //n % 2 remainder not 0 
                return false; //then it is false
            } 
            n = n/2;  //reducing number
        }
       return n==1;   //after reducing 
    }
}