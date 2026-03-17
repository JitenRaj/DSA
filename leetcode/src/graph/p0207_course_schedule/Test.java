package graph.p0207_course_schedule;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int numCourses, int[][] prerequisites, boolean expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard case - no cycles
                new TestCase(2, new int[][]{{1, 0}}, true),

                // Case 2: Standard case - cycle exists
                new TestCase(2, new int[][]{{1, 0}, {0, 1}}, false),

                // Case 3: Edge case - single course, no prerequisites
                new TestCase(1, new int[][]{}, true),

                // Case 4: Edge case - disconnected components, no cycles
                new TestCase(4, new int[][]{{1, 0}, {3, 2}}, true)
        );
    }
}
