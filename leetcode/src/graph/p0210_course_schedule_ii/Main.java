package graph.p0210_course_schedule_ii;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Test.TestCase> testCases = Test.getCases();

        for (int i = 0; i < testCases.size(); i++) {
            Test.TestCase tc = testCases.get(i);

            int[] actual = solution.findOrder(tc.numCourses(), tc.prerequisites());

            if (Arrays.equals(actual, tc.expected())) {
                System.out.println("Test " + (i + 1) + ": [PASSED]");
            } else {
                System.out.println("Test " + (i + 1) + ": [FAILED]");
                System.out.println("  Expected: " + Arrays.toString(tc.expected()));
                System.out.println("  Actual:   " + Arrays.toString(actual));
            }
        }
    }
}
