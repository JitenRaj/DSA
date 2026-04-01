package stack.p2751_robot_collisions;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Test {

    public record TestCase(int[] positions, int[] healths, String directions, List<Integer> expected) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard LeetCode example - all moving right, no collisions
                new TestCase(
                        new int[]{5, 4, 3, 2, 1},
                        new int[]{2, 17, 9, 15, 10},
                        "RRRRR",
                        Arrays.asList(2, 17, 9, 15, 10)
                ),

                // Case 2: Standard LeetCode example - selective survivors
                new TestCase(
                        new int[]{3, 5, 2, 6},
                        new int[]{10, 10, 15, 12},
                        "RLRL",
                        Arrays.asList(14)
                ),

                // Case 3: Standard LeetCode example - all robots destroyed
                new TestCase(
                        new int[]{1, 2, 5, 6},
                        new int[]{10, 10, 11, 11},
                        "RLRL",
                        new ArrayList<Integer>()
                ),

                // Case 4: Edge case - moving away from each other, no collisions
                new TestCase(
                        new int[]{1, 2},
                        new int[]{10, 10},
                        "LR",
                        Arrays.asList(10, 10)
                ),

                // Case 5: Chain reaction - one large robot destroys multiple smaller ones
                new TestCase(
                        new int[]{1, 2, 3},
                        new int[]{10, 2, 3},
                        "RLL",
                        Arrays.asList(8)
                ),

                // Case 6: Output ordering validation - must match original array index
                new TestCase(
                        new int[]{8, 2, 12},
                        new int[]{5, 10, 3},
                        "RLL",
                        Arrays.asList(4, 10)
                ),

                // Case 7: Edge case - large health disparity
                new TestCase(
                        new int[]{1, 10},
                        new int[]{1, 100000000},
                        "RL",
                        Arrays.asList(99999999)
                ),

                // Case 8: Edge case - single robot
                new TestCase(
                        new int[]{5},
                        new int[]{10},
                        "R",
                        Arrays.asList(10)
                )
        );
    }
}
