package matrix.p3212_count_submatrices_with_equal_frequency;

class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] matrix = new int[m][n];
        matrix[0][0] = value(grid[0][0]);

        boolean[][] hasX = new boolean[m][n];
        hasX[0][0] = isThisX(grid[0][0]);

        // first row
        for (int j = 1; j < n; j++) {
            matrix[0][j] = value(grid[0][j]) + matrix[0][j - 1];

            hasX[0][j] = isThisX(grid[0][j]) || hasX[0][j - 1];
        }

        // first col
        for (int i = 1; i < m; i++) {
            matrix[i][0] = value(grid[i][0]) + matrix[i - 1][0];

            hasX[i][0] = isThisX(grid[i][0]) || hasX[i - 1][0];
        }

        // rest of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = value(grid[i][j])
                        + matrix[i - 1][j] + matrix[i][j - 1]
                        - matrix[i - 1][j - 1];

                hasX[i][j] = isThisX(grid[i][j]) || hasX[i - 1][j] || hasX[i][j - 1];
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0 && hasX[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public int value(char ch) {
        if (ch == 'X') {
            return 1;
        } else if (ch == 'Y') {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isThisX(char ch) {
        return ch == 'X';
    }
}
