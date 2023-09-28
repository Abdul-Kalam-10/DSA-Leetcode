class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;       //row int to 0
        int col = matrix[0].length-1;  //col length
        while(row < matrix.length && col >= 0){  //in  a ascending order
            if(matrix[row][col] == target) return true; //element == target true
            else if(matrix[row][col] < target) row++; //otherwise element less than target row++
           else col--;  //end col--
        }
        return false; //if not found then false
    }
}

