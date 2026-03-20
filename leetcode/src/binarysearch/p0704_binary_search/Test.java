package binarysearch.p0704_binary_search;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int[] nums, int target, int expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: target exists
                new TestCase(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),

                // Case 2: target does not exist
                new TestCase(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),

                // Case 3: single element array, target matches
                new TestCase(new int[]{5}, 5, 0),

                // Case 4: single element array, target is smaller than all elements
                new TestCase(new int[]{5}, -2, -1),

                // Case 5: two elements, target at the end
                new TestCase(new int[]{2, 5}, 5, 1)
        );
    }
}
