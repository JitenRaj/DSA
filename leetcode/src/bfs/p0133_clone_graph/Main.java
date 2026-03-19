package bfs.p0133_clone_graph;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Test.TestCase> testCases = Test.getCases();

        for (int i = 0; i < testCases.size(); i++) {
            Test.TestCase tc = testCases.get(i);

            Node original = Test.buildGraph(tc.adjList());
            Node cloned = solution.cloneGraph(original);

            String actualStr = Test.serialize(cloned);
            boolean passed = Test.isDeepCopy(original, cloned) && actualStr.equals(tc.expectedStr());

            if (passed) {
                System.out.println("Test " + (i + 1) + ": [PASSED]");
            } else {
                System.out.println("Test " + (i + 1) + ": [FAILED]");
                System.out.println("  Expected: " + tc.expectedStr() + " (with distinct memory references)");
                System.out.println("  Actual:   " + actualStr);
            }
        }
    }
}
