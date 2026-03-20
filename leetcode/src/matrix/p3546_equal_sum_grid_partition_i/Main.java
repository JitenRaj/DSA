package matrix.p3546_equal_sum_grid_partition_i;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Test.TestCase> testCases = Test.getCases();

        for (int i = 0; i < testCases.size(); i++) {
            Test.TestCase tc = testCases.get(i);

            // Note: Adjust the method name here if LeetCode's exact signature differs
            boolean actual = solution.canPartitionGrid(tc.grid());

            if (actual == tc.expected()) {
                System.out.println("Test " + (i + 1) + ": [PASSED]");
            } else {
                System.out.println("Test " + (i + 1) + ": [FAILED]");
                System.out.println("  Input:    " + Arrays.deepToString(tc.grid()));
                System.out.println("  Expected: " + tc.expected());
                System.out.println("  Actual:   " + actual);
            }
        }
    }
}
