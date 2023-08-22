class Solution {
    public boolean containsDuplicate(int[] nums) {
        //create hashset//
        Set<Integer> in = new HashSet<>();
        //iterate over each element//
        for(int num : nums){
            //check num in hashset//
            if(in.contains(num))
            return true;
            //add element to hashset//
            in.add(num);
        }
        return false;
    }
}