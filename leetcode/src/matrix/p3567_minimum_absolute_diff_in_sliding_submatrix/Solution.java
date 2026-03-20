package matrix.p3567_minimum_absolute_diff_in_sliding_submatrix;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] ans = new int[m - k + 1][n - k + 1];

        if (k == 1) return ans;

        for (int i = 0; i < m - k + 1; i++) {
            for (int j = 0; j < m - k + 1; j++) {
                ans[i][j] = minimumAbsoluteDiff(grid, i, j, k);
            }
        }

        return ans;
    }

    private int minimumAbsoluteDiff(int[][] grid, int i, int j, int k) {
        Set<Integer> set = new TreeSet<>();

        for (int row = i; row < i + k; row++) {
            for (int col = j; col < j + k; col++) {
                set.add(grid[row][col]);
            }
        }

        if (set.size() == 1) return 0;

        int minAbsDiffVar = Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<>(set);

        for (int index = 1; index < list.size(); index++) {
            minAbsDiffVar = Math.min(minAbsDiffVar,
                    Math.abs(list.get(index) - list.get(index - 1)));
        }

        return minAbsDiffVar;
    }
}
