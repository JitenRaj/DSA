package graph.p0210_course_schedule_ii;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int numCourses, int[][] prerequisites, int[] expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard case - linear dependency
                new TestCase(2, new int[][]{{1, 0}}, new int[]{0, 1}),

                // Case 2: Standard case - multiple valid orders, locking to [0, 2, 1, 3]
                new TestCase(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}, new int[]{0, 1, 2, 3}),

                // Case 3: Edge case - cycle exists, impossible to finish
                new TestCase(2, new int[][]{{1, 0}, {0, 1}}, new int[]{}),

                // Case 4: Edge case - single course, no prerequisites
                new TestCase(1, new int[][]{}, new int[]{0})
        );
    }
}
