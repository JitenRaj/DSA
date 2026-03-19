package matrix.p3212_count_submatrices_with_equal_frequency;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Test.TestCase> testCases = Test.getCases();

        for (int i = 0; i < testCases.size(); i++) {
            Test.TestCase tc = testCases.get(i);

            int actual = solution.numberOfSubmatrices(tc.grid());

            if (actual == tc.expected()) {
                System.out.println("Test " + (i + 1) + ": [PASSED]");
            } else {
                System.out.println("Test " + (i + 1) + ": [FAILED]");
                System.out.println("  Expected: " + tc.expected());
                System.out.println("  Actual:   " + actual);
            }
        }
    }
}