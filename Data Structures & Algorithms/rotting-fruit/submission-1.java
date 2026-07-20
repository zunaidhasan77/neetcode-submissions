class Solution {
    public int orangesRotting(int[][] grid) {

        if (grid == null || grid.length == 0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount =0;
        int minutes =0;
        for (int r=0; r<rows; r++) {

            for (int c=0; c<cols; c++) {
                if (grid[r][c] == 2){
                    queue.add(new int[] {r,c});
                }
                if (grid[r][c] ==1){
                    freshCount++;
                }
            }
        }

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        while (!queue.isEmpty()) {

            int levelSize = queue.size();

            boolean rottingThisMinute = false;

            for (int i =0; i<levelSize; i++){

                int[] current = queue.remove();

                int row = current[0];
                int col = current[1];

                for (int[] direction : directions) {

                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow<0 || newRow >= rows || newCol <0 || newCol >= cols || grid[newRow][newCol]!=1){
                        continue;
                    }

                    grid[newRow][newCol] =2;
                    freshCount--;
                    rottingThisMinute = true;
                    queue.add(new int[] {newRow, newCol});

                }

            }

            if (rottingThisMinute) minutes++;
            
        }
        if(freshCount >0) return -1;

        return minutes;
        
    }
}
