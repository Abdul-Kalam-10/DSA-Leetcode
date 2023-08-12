class Solution {
    public int[] twoSum(int[] nums, int target) { 
        for(int i=0; i<nums.length; i++){ //i set to index 0
            for(int j =i+1;j<nums.length;j++){ //j set to index i+1
                if(nums[i] + nums[j] == target){ //i+j = target
                    int a[] = {i,j};  //insert i,j in array a[]
                    return a;       //return a[]
                }
            }

        }
        return null;       //if not found null
    }
}