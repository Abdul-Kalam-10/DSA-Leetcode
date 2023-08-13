class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0] ,votes=1;  //majority set to element at 0 pos // votes =1 
        for(int i=1;i<nums.length;i++){   //start loop from element 1
            if(votes==0){               //when votes = 0
                votes++;             //inc votes
                majority = nums[i];  //num at i is mmajority
            }
            else if(majority == nums[i]){ //nums[i] is majority 
                votes++;                   //increase votes
            }
            else
            votes--;            //else decrease votes
        }
        return majority;      //finally return the majority element
    }
}