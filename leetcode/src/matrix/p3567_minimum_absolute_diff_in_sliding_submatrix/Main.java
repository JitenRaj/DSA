package matrix.p3567_minimum_absolute_diff_in_sliding_submatrix;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Test.TestCase> testCases = Test.getCases();

        for (int i = 0; i < testCases.size(); i++) {
            Test.TestCase tc = testCases.get(i);

            int[][] actual = solution.minAbsDiff(tc.grid(), tc.k());

            if (Arrays.deepEquals(actual, tc.expected())) {
                System.out.println("Test " + (i + 1) + ": [PASSED]");
            } else {
                System.out.println("Test " + (i + 1) + ": [FAILED]");
                System.out.println("  Expected: " + Arrays.deepToString(tc.expected()));
                System.out.println("  Actual:   " + Arrays.deepToString(actual));
            }
        }
    }
}
