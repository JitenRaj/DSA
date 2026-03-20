package matrix.p3546_equal_sum_grid_partition_i;

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[][] matrix = new long[m][n];

        // fill prefix sum matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    matrix[0][0] = grid[0][0];

                } else if (i == 0) {
                    matrix[i][j] = grid[i][j] + matrix[i][j - 1];

                } else if (j == 0) {
                    matrix[i][j] = grid[i][j] + matrix[i - 1][j];

                } else {
                    matrix[i][j] = grid[i][j]
                            + matrix[i][j - 1] + matrix[i - 1][j]
                            - matrix[i - 1][j - 1];
                }
            }
        }

        long totalSum = matrix[m - 1][n - 1];

        if (totalSum % 2 != 0) return false;

        long target = totalSum / 2;

        // check rows up to second last row
        for (int i = 0; i < m - 1; i++) {
            if (matrix[i][n - 1] == target) {
                return true;
            }
        }

        // check cols up to second last col
        for (int j = 0; j < n - 1; j++) {
            if (matrix[m - 1][j] == target) {
                return true;
            }
        }

        return false;
    }
}
