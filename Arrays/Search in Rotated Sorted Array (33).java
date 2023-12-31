class Solution {
    public int search(int[] nums, int target) {
        int low = 0 , high = nums.length-1 , mid = 0 ;
            while(low <= high) {
             mid = (low + high)/2 ;  

             if(target == nums[mid]){
                 return  mid;
             }
            // left portion
            else if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            //right portion
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }

            }
            }
    
            return -1;
}
}
   