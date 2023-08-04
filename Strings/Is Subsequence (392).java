class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; //initializing i for s
        int j = 0; //initializing j for t
    while (i < s.length() && j < t.length()) { //when i < s & j < t
        if (s.charAt(i) == t.charAt(j)) {   //check char(i) == char(j)
            i++;         //then inc i
            j++;         //then inc j
        }
        else{
            j++;         //if i != j then j++
        }
    }
    return (i == s.length()); //if i has reached end we have completed ,return it     
    }
}