package matrix.p3070_count_submatrices_with_sum_less_than_k;

class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        if (grid[0][0] > k) return 0;
        else count++;

        // first row
        for (int j = 1; j < cols; j++) {
            grid[0][j] = grid[0][j] + grid[0][j - 1];

            if (grid[0][j] <= k) count++;
        }

        // first col
        for (int i = 1; i < rows; i++) {
            grid[i][0] = grid[i][0] + grid[i - 1][0];

            if (grid[i][0] <= k) count++;
        }

        // rest of the matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                grid[i][j] = grid[i][j]
                        + grid[i - 1][j] + grid[i][j - 1]
                        - grid[i - 1][j - 1];

                if (grid[i][j] <= k) count++;
            }
        }

        return count;
    }
}
