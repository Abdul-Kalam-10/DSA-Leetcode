class Solution {
    public int strStr(String haystack, String needle) {   
       for(int i=0;i<haystack.length(); i++){  //haystack on for loop
           if(haystack.charAt(i) == needle.charAt(0)){  //check haystack char with needle char
               int j=0; //for needle for index 0
               int k=i; //for haystack

               while(j<needle.length() && k<haystack.length() && needle.charAt(j) == haystack.charAt(k)){
                   j++;      //inc j(needle)                   //when while condition true
                   k++;      //inc k(haystack)
                   if(j==needle.length()){ //finally if j is at lenght of needle
                       return i;           //return the i index
                   }
               }
            }
       }
         return -1; //otherwise return -1
    }
}