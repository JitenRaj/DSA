package matrix.p3212_count_submatrices_with_equal_frequency;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(char[][] grid, int expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard LeetCode example - valid matches
                new TestCase(new char[][]{
                        {'X', 'Y', '.'},
                        {'Y', '.', '.'}
                }, 3),

                // Case 2: Standard example - unequal frequencies
                new TestCase(new char[][]{
                        {'X', 'X'},
                        {'X', 'Y'}
                }, 0),

                // Case 3: Edge case - equal frequencies (0) but missing required 'X'
                new TestCase(new char[][]{
                        {'.', '.'},
                        {'.', '.'}
                }, 0),

                // Case 4: Edge case - single row matrix
                new TestCase(new char[][]{
                        {'X', 'Y'}
                }, 1)
        );
    }
}
