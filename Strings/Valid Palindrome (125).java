class Solution {
    public boolean isPalindrome(String s) { //check given string is palindrome
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]",""); //replace all string char to  
        int i=0;             //i start from 0               //lowercase letters
        int j=s.length()-1;  //j start from length-1
        while(i<=j){        //i<=j
          if (s.charAt(i) != s.charAt(j)){   //check char at i != j
              return false;                  //then return as false
          } 
            i++;                   //i from index 0 i++
            j--;                   //j from index length-1 j--  
        }
         return true;              // when i==j,return true
    }  
 }