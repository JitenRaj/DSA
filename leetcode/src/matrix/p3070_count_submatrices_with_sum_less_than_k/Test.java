package matrix.p3070_count_submatrices_with_sum_less_than_k;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int[][] grid, int k, int expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard LeetCode example
                new TestCase(new int[][]{{7, 6, 3}, {6, 6, 1}}, 18, 4),

                // Case 2: Standard larger grid example
                new TestCase(new int[][]{{7, 2, 9}, {1, 5, 0}, {2, 6, 6}}, 20, 6),

                // Case 3: Edge case - single element strictly greater than k
                new TestCase(new int[][]{{10}}, 5, 0),

                // Case 4: Edge case - all elements 0, should include all submatrices
                new TestCase(new int[][]{{0, 0}, {0, 0}}, 0, 4)
        );
    }
}
