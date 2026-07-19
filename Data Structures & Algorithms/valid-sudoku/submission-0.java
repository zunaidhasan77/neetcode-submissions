class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int row =0; row < 9; row++) {

            Set<Character> seen = new HashSet<>();

            for (int i =0; i<9;i++) {

                char currentCell = board[row][i];

                if (currentCell == '.') continue;

                if (seen.contains(currentCell)) return false;

                seen.add(currentCell);
            }
        }

        for (int column =0; column < 9; column++) {

            Set<Character> seen = new HashSet<>();

            for (int i =0; i<9;i++) {

                char currentCell = board[i][column];

                if (currentCell == '.') continue;

                if (seen.contains(currentCell)) return false;

                seen.add(currentCell);
            }
        }

        for (int square =0; square <9; square++){

            Set<Character> seen = new HashSet<>();

            for (int i =0; i<3; i++) {

                for (int j=0; j<3; j++) {

                    int row = (square/3) * 3 + i;

                    int col = (square%3) *3 + j;

                    char currentCell = board[row][col];

                    if (currentCell == '.') continue;

                    if (seen.contains(currentCell)) return false;

                    seen.add(currentCell);
                }
            }
        }

        return true;
        
    }
}
