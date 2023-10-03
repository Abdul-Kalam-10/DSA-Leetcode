class Solution {
    public int countNegatives(int[][] grid) {
        int r = 0; //r int to 0
        for(int i=0;i<grid.length;i++){ //i matrix
            for(int j = grid[0].length-1; j>=0; j--) //j matrix
              if(grid[i][j]<0){   //grid elements < 0 -ve
                r++;  //r inc
            }
              else{
                break;  //else break loop
            }
        }
        return r; //r with count of -ve elements
    }
}