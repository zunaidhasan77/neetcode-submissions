class Solution {
    public void islandsAndTreasure(int[][] grid) {

        int INF = 2147483647;

        if(grid == null || grid.length ==0) return;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int r =0; r<rows;r++){

            for (int c=0; c< cols; c++) {

                if (grid[r][c] == 0) {
                    queue.add(new int[]{r,c});
                }
            }
        }

        int[][] directions = {{1,0},{-1,0}, {0,1}, {0,-1}};

        while (!queue.isEmpty()) {

            int[] current = queue.remove();

            int row = current[0];

            int column = current[1];

            for (int[] direction : directions) {

                int newRow = row + direction[0];

                int newCol = column + direction[1];

                if (newRow<0 || newRow >=rows || newCol <0 || newCol>= cols || grid[newRow][newCol] !=INF){
                    continue;
                }

                grid[newRow][newCol] = grid[row][column] +1;
                queue.add(new int[] {newRow, newCol});
            }

        }
        
    }
}
