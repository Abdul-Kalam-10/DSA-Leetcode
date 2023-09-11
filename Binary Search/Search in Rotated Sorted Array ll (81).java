class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0,right=nums.length-1;  //left to 0 ,right to last number 
        while(left <= right){     //while cond
            if(nums[left]==target || nums[right]==target){ //anyone cond is true
                return true;                //true because target matched
            }
            else if(target>nums[left]){    //target > left 
                    left++;                 // left inc
                } 
            else if(target<nums[right]){   //target < right
                    right--;              //right dec
                }         
            else {
                break;                  //cond over break it
            }
        }
        return false;       //return as false because target not found
    }
}