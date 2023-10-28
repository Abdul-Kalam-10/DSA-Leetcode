class Solution {
    public int countOdds(int low, int high) {
        int total = high - low +1; //def total
        if(total % 2 ==0){  //total length is even then 
            return total/2;  //odd = tot/2
        }
        else if(low % 2 != 0 && high % 2 != 0){ //both low != even && high != even
                return total/2 +1; //tot/2+1
        }
        else{                   //low is even and high is even
                return total/2; //tot/2
        }
    }
}