class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new ArrayList();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            while(i < nums.length-1 && nums[i]+1 == nums[i+1] ){
                i++;
            }
            if(a == nums[i]){
                range.add("" + nums[i]);
            }
            else{
                range.add(a + "->" + nums[i]);
            }
        }
        return range;
    }
}