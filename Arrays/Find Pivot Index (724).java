class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
    }
        int leftsum = 0;
        int rightsum = sum;

        for(int i=0; i<nums.length; i++){
            rightsum -= nums[i];
            if(rightsum == leftsum){
                return i;
            }
             leftsum += nums[i];
        }        
        return -1;
    }
}