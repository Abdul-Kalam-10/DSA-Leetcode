class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedInteger  = new HashSet<>(); //new hashset created
        while(true){  //seting while loop for infinite operations
        int sum =0;  //sum initialize to zero
        while(n != 0) { //n != 0 , n enters loop
            sum += Math.pow(n % 10 , 2.0); //last digit sq up
            n = n / 10; //getting first digit
        } 

       if(sum == 1)  return true; //check sum == 1, then true 
       n = sum;  //sum number set to n
        if(usedInteger.contains(n)) //usedinteger having n means
        return false;  //then false
        usedInteger.add(n); //add other than 1 to used integer
   }
}
}
   