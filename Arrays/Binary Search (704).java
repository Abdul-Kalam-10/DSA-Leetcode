class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length; //initializing nums length
        int low = 0 , high = n-1; //low set to 0 and high be n-1  
        while(low <= high){ //when low to high in ascending order
           int mid = (low + high) /2; // mid = (low + high)/2
           if(nums[mid] == target){ //check mid == target
               return mid;     //then return       
           }
           else if(nums[mid] < target){ //check mid is less than target
               low = mid+1;    //if so, mid will move +1
           }           
           else{
               high = mid-1;   //else the mid will move -1
           }
        }
        return -1;    //when no target found return as -1
    }
}                     