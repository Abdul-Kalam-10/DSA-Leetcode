class Solution {
    public int arrangeCoins(int n) {
        int i = 1; //i init to 1
        while(n>=i) //while cond
        {
            n = n-i; //n dec by 1
            i = i+1; //i inc by 1
        }
        return i-1; ///return i-1
    }
}  //end
