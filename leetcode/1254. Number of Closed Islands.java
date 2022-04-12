class Solution {    
    public int closedIsland(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    if(dfs(grid,i,j))
                        res++;
                }
            }
        }
        return res;
    }
    
    private boolean dfs(int[][] grid, int i, int j){
        if(i == 0 || i == grid.length-1 || j == 0 || j == grid[0].length-1)
            return false;
        if(grid[i][j] == 1 || grid[i][j] == 2)
            return false;
        grid[i][j] = 2;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        boolean isClosed = true;
        for(int[] dir : dirs){
            int m = i + dir[0];
            int n = j + dir[1];
            if(grid[m][n] == 0){
                isClosed = dfs(grid,m,n) && isClosed;
            }
        }
        return isClosed;
    }
}
