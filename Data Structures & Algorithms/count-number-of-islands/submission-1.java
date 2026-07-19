class Solution {
    public int numIslands(char[][] grid) {
        int islandCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    visitAdjacentTeritory(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    private void visitAdjacentTeritory(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0')
            return;
        grid[r][c] = '0';

        visitAdjacentTeritory(grid,r,c+1);
        visitAdjacentTeritory(grid,r,c-1);
        visitAdjacentTeritory(grid,r+1,c);
        visitAdjacentTeritory(grid,r-1,c);
    }
}
