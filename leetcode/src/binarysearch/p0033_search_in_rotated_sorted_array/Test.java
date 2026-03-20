package binarysearch.p0033_search_in_rotated_sorted_array;

import java.util.Arrays;
import java.util.List;

public class Test {

    public record TestCase(int[] nums, int target, int expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard LeetCode example - target exists in the right sorted portion
                new TestCase(new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4),

                // Case 2: Standard LeetCode example - target does not exist
                new TestCase(new int[]{4, 5, 6, 7, 0, 1, 2}, 3, -1),

                // Case 3: Edge case - single element array, target is missing
                new TestCase(new int[]{1}, 0, -1),

                // Case 4: Edge case - array is not actually rotated (pivot index 0)
                new TestCase(new int[]{1, 2, 3, 4, 5}, 4, 3),

                // Case 5: Edge case - small array, target exists at the pivot point
                new TestCase(new int[]{3, 1}, 1, 1),

                // Case 6: Edge case - target exists in the left sorted portion
                new TestCase(new int[]{5, 1, 2, 3, 4}, 5, 0),

                // Case &: Edge case - target exists at last index
                new TestCase(new int[] {5,1,3}, 3, 2)
        );
    }
}
