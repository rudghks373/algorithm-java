class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int result = 0;
        for(int i = 0; i< grid2.length; i++){
            for(int j =0; j<grid2[0].length; j++){
                if(grid2[i][j] == 1){
                    result += dfs(grid1, grid2, i, j);
                }
            }
        }
        return result;
    }
    private int dfs(int grid1[][], int grid2[][], int i, int j) {
        int res = 1;
        if(i < 0 || i == grid2.length || j < 0 || j == grid2[0].length || grid2[i][j] == 0) return 1;
        grid2[i][j] = 0;
        res &= dfs(grid1,grid2, i + 1, j);
        res &= dfs(grid1,grid2, i - 1, j);
        res &= dfs(grid1,grid2, i, j + 1);
        res &= dfs(grid1,grid2, i, j - 1);
        return res & grid1[i][j];
    }
}
