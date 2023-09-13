class Solution {
    public int jump(int[] nums) {
        int jump=0,pos=0,des=0;
        for(int i= 0;i<nums.length-1;i++) {
            des = Math.max(des,nums[i]+i);
            if(pos==i){
                pos = des;
                jump++;
         }
    }
      return jump;

    }
}
   