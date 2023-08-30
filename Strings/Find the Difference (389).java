class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;     //total init to 0
        for(int i=0;i<t.length();i++){  //str t in for loop till end                                    
            total += t.charAt(i);    //adding each char of t in total         
        }    
        for(int i=0;i<s.length();i++){ //str s in for loop till end 
          total -= s.charAt(i);  //subtracting each char of s in total, which is of t char
         }
        return (char)total;  //return total the leftout element is difference
        
    }
}