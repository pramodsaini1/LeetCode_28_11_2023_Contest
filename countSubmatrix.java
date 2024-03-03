public class countSubmatrix {
    public int countSubmatrices(int[][] grid, int k) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=1;j<grid[i].length;j++){
                grid[i][j] +=grid[i][j-1];
            }
        }
        for(int i=1;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j] +=grid[i-1][j];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<=k){
                    count++;
                }
            }
        }
        return count;
    }
}
/*
 * You are given a 0-indexed integer matrix grid and an integer k.

Return the number of submatrices that contain the top-left element of the grid, and have a sum less than or equal to k.

 

Example 1:


Input: grid = [[7,6,3],[6,6,1]], k = 18
Output: 4
Explanation: There are only 4 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 18.
Example 2:


Input: grid = [[7,2,9],[1,5,0],[2,6,6]], k = 20
Output: 6
Explanation: There are only 6 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 20.
 */
