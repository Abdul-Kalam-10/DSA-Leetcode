class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0; //i initialize to 0
        for(int j=0;j<nums.length;j++){ //j ini to nums array
            if(nums[j] != val){ //when j != value
                nums[i] = nums[j];  //j pos element will go to the i position
                i++; //once i replaced it with j then inc++
            }
        }
        return i; //once the loop ends return i
    }
}