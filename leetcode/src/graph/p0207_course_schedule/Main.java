package graph.p0207_course_schedule;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Test.TestCase> testCases = Test.getCases();

        for (int i = 0; i < testCases.size(); i++) {
            Test.TestCase tc = testCases.get(i);

            boolean actual = solution.canFinish(tc.numCourses(), tc.prerequisites());

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
