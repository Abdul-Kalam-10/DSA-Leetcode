lass Solution {
    public void reverseString(char[] s) {
    for(int i=0;i<s.length/2;i++){  //i set to 0 to length of str/2 , i++ 
    char temp = s[i];             //i value moved to temp 
    s[i] = s[s.length -1 -i];     //last value s.length()-1 moved to i
    s[s.length-1 -i] = temp;      //i value to temp now it is moved to last position
    }                           //process repeats until i reaches length str/2
  }
}