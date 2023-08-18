class Solution {
    public int searchInsert(int[] nums, int target){//Binary search approach 
    int low=0; //low set to first index
    int high=nums.length-1; //high set to last index 
        while(low<=high){   //when this satisfies enter while loop
            int mid = (low + high)/2; //mid = (low+high)/2

            if(nums[mid] == target){  //mid element == target
                return mid;            //return mid
            }
            else if(nums[mid] > target){  //if mid is greater then target
                high = mid-1;             //dec mid by mid-1
            }
            else{                         //it may be greater so
                low= mid+1;               //inc mid by mid+1
            }
        }
        return low;                   //return low
        
    }
}