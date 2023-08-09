class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length]; //new array result is created to return at end
        for(int i=0;i<nums.length;i++){     //var i from 0 to length set ,i++
            nums[i] = nums[i]*nums[i];      //squaring i elements
        }
        int head = 0;                    //head set to first index 0
        int tail = nums.length-1;        //tail set to last index length-1

        for(int pos=nums.length-1;pos>=0;pos--){ //pos set to last index of array ,pos -- 
            if(nums[head] > nums[tail]){        //head is greater 
                result [pos] = nums[head];      //head element goes to pos
                head++;                         //head element inc++
            }                                      
            else{                              //otherwise
                result[pos] = nums[tail];      //tail element goes to pos
                tail--;                        //tail element dec--      
            }
        }
        return result;                        //return 
        
    }
}