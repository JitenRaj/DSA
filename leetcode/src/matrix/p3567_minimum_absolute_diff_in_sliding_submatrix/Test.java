package matrix.p3567_minimum_absolute_diff_in_sliding_submatrix;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int[][] grid, int k, int[][] expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard grid with varied elements
                new TestCase(
                        new int[][]{
                                {1, 3, 6},
                                {2, 5, 8},
                                {4, 7, 9}
                        },
                        2,
                        new int[][]{
                                {1, 1},
                                {1, 1}
                        }
                ),

                // Case 2: Edge case - all elements are identical, resulting in 0s
                new TestCase(
                        new int[][]{
                                {5, 5, 5},
                                {5, 5, 5}
                        },
                        2,
                        new int[][]{
                                {0, 0}
                        }
                ),

                // Case 3: Smaller grid producing a 1x1 submatrix result
                new TestCase(
                        new int[][]{
                                {10, 20},
                                {15, 30}
                        },
                        2,
                        new int[][]{
                                {5} // Sorted distincts: 10, 15, 20, 30 -> min diff is |15-10| = 5
                        }
                ),

                // Case 4: Smaller grid producing a 1x1 submatrix result
                new TestCase(
                        new int[][] {
                                {1, 8},
                                {3, -2}
                        },
                        2,
                        new int[][] {
                                {2}
                        }
                ),

                // Case 5: Value of K = 1
                new TestCase(
                        new int[][] {
                                {1, -3}
                        },
                        1,
                        new int[][] {
                                {0, 0}
                        }
                ),

                // Case 6: Value of K = 1
                new TestCase(
                        new int[][] {
                                {2},
                                {5}
                        },
                        1,
                        new int[][] {
                                {0},
                                {0}
                        }

                )


        );
    }
}
