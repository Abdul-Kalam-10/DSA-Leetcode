class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); //sorting array
        int sum = 0;    //sum set to 0
        for(int i=1;i<nums.length;i=i+2) { //parring element from 1
            sum += Math.min(nums[i],nums[i-1]);
        }       
        return sum;
    }
}