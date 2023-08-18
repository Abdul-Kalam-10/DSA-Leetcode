class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length; //size var set to length of array
        if(size == 0 || size == 1){  //if size is 0 or 1 
            return;        //return it
        }
        int nz=0,z=0;    //non-zero init to 0 , zero init to 1
        while(nz < size){  //nz - size
            if(nums[nz] != 0){  //non zero not equal to 0
                int temp = nums[nz]; //nz element placed at temp var
                nums[nz] = nums[z];  //z var moved to nz
                nums[z] = temp;  //temp var taken from nz moved to z
                nz++;     //inc 
                z++;      //inc
            }
            else{      //when nz == 0 
                nz++;  //nz inc
            }

        }
    }
}