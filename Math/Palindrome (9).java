class Solution {
    public boolean isPalindrome(int x) { //check for palindrome 121 = 121 in reverse
        int temp = x; //temp set to x
        int rev = 0;  //reverse set to 0
        while(x>0)   //when x is greater than zero
        {  
            int digit = x % 10;  //121 % 10 =1 ,12 % 10 = 2 .......
            rev = (rev*10) + digit;  //(rev*10) + digit , (0*10)+1 =1 .....
            x = x / 10;       //121/10 = 12 , 12/10 = 1 ,....
        }
    if(rev == temp){  //temp x is same as even it reversed then true
        return true;
    }
    else{
        return false;  //else false not same
    }
    
    }
}