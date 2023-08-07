class Solution {
    public int lengthOfLastWord(String s) {
        int count =0; //count set to 0
        for(int i = s.length()-1; i>=0; i--){ //To find the last word we are coming from end
            if(s.charAt(i) != ' '){     //untill we reach the space between a string count++
                count++;
            }
            else{
                //white space//
                if(count>0)     //once we reached the empty space, check count > 0 
                return count;   //return the count
            }
        }
        return count; 
    }
    }