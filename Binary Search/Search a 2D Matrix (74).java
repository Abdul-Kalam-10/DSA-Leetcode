class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row  = matrix.length;  //row length
        int col  = matrix[0].length; //col length
 
        int left = 0;           //left start pos 0 in 2d
        int right = row * col -1; //right last in 2d  

        while(left <= right){  //binary search cond
            int mid = left + (right-left)/2;   //mid formula
            int cur = matrix[mid/col][mid%col]; //[/] for row [%] for col mid element 

            if(cur == target) return true;  //cur = target element found
            if(cur < target) left = mid+1;  //element is less than target left=mid+1
               else right = mid-1;    //element is greater than target right=mid-1
        }
        return false;  //when element not found false
    }
}