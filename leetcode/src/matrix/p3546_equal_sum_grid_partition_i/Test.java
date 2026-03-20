package matrix.p3546_equal_sum_grid_partition_i;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int[][] grid, boolean expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard LeetCode example - True (Horizontal cut between row 0 and 1)
                new TestCase(new int[][]{{1, 4}, {2, 3}}, true),

                // Case 2: Standard LeetCode example - False (No cut produces equal sums)
                new TestCase(new int[][]{{1, 2}, {3, 4}}, false),

                // Case 3: Edge case - 1D row matrix, True via vertical cut
                new TestCase(new int[][]{{1, 2, 3}}, true),

                // Case 4: Edge case - 1D column matrix, True via horizontal cut
                new TestCase(new int[][]{{5}, {5}}, true),

                // Case 5: 2D Grid - True via vertical cut (Columns 0,1 vs Column 2)
                new TestCase(new int[][]{{1, 1, 2}, {1, 1, 2}}, true),

                // Case 6: 2D Grid - True via horizontal cut (Rows 0,1 vs Row 2)
                new TestCase(new int[][]{{1, 1}, {1, 1}, {2, 2}}, true),

                // Case 7: Edge case - Total sum is odd, making equal partition mathematically impossible
                new TestCase(new int[][]{{1, 2, 4}}, false),

                // Case 8: Edge case - Total sum is even (10), but no single strict line splits it equally
                new TestCase(new int[][]{{1, 3}, {2, 4}}, false)
        );
    }
}
