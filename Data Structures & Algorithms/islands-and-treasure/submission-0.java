class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int INF = 2147483647;

        if(grid ==null || grid.length ==0 ) return;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int r=0; r<grid.length; r++) {
            for (int c=0; c< grid[0].length; c++) {

                if (grid[r][c] == 0){
                    queue.add(new int[] {r,c});
                }
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty()) {

            int[] current = queue.remove();

            int r = current[0];
            int c = current[1];

            for (int[] direction : directions) {
                int newRow = r+ direction[0];
                int newCol = c+ direction[1];

                if(newRow<0 || newRow>= rows || newCol<0 || newCol>=cols || grid[newRow][newCol] != INF){
                    continue;
                }
                grid[newRow][newCol] = grid[r][c] +1;

                queue.add(new int[]{newRow,newCol});


            }
        }
    }
}
