class Solution {
    public int titleToNumber(String column) {
        int sum =0,p =0; //sum set to 0 ,p the power as 0
        int n = column.length(); //n to the length of col
        for(int i = n-1;i>= 0;i--) //decrease order from end to first  
        {
            int temp = column.charAt(i)-64; //temp var letter sky value - 64
            sum = sum +(int)Math.pow(26,p++)*temp  ; //26 pow 0 to end * temp 
        }
        return sum;    //return final sum
    }
}