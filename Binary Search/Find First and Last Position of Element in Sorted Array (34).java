class Solution {
    public int[] searchRange(int[] nums, int target) {  //To Perform Binary Search 
        int low = 0 , high = nums.length-1 , mid = 0; //l to 0,h to length-1,mid=?
        int[] result = {-1,-1}; //result array created to return at end
        while(low <= high){    //while satisfies enter the loop
            mid = (low + high) / 2;  //mid value cal
            if(target == nums[mid]){  //mid == target
                result[0] = mid;   //mid value set to result index 0
                high = mid -1;    //high from right it moves to left
            }                             
            else if(nums[mid] < target){ //when mid less than target
                low = mid +1;           //low moves to right
            }                          
            else{                    
                high = mid -1;   //even mid greater than target 
            }                    //high from right it moves to left
        }
          low = 0 ; high = nums.length-1; mid = 0; //again re initialized for index 1 
         while(low <= high){             //while satisfies enter loop
            mid = (low + high) / 2;      //mid calculation 
            if(target == nums[mid]){    //when target = mid
                result[1] = mid;        //mid value set to result index 1
                low = mid +1;          //low moved to right 
            }
            else if(nums[mid] < target){  //mid less than target
                low = mid +1;       //low moved to right  
            }
            else{
                high = mid -1;    //high moved to left
            }       
    }
       return result;    //now return the result arr created if the elements 
    }               //at first and last position found else it will return  
                    //the default {-1,-1}     
}
