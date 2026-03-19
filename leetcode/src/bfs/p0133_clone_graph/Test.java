package bfs.p0133_clone_graph;

import java.util.*;

public class Test {

    public record TestCase(int[][] adjList, String expectedStr) {}

    public static List<TestCase> getCases() {
        return Arrays.asList(
                // Case 1: Standard square graph
                new TestCase(new int[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}}, "[[2, 4], [1, 3], [2, 4], [1, 3]]"),

                // Case 2: Edge case - single node, no neighbors
                new TestCase(new int[][]{{}}, "[[]]"),

                // Case 3: Edge case - empty graph
                new TestCase(new int[][]{}, "[]")
        );
    }

    // Utility to build a graph from an adjacency list
    public static Node buildGraph(int[][] adjList) {
        if (adjList == null || adjList.length == 0) return null;
        if (adjList.length == 1 && adjList[0].length == 0) return new Node(1);

        Map<Integer, Node> map = new HashMap<>();
        for (int i = 1; i <= adjList.length; i++) {
            map.put(i, new Node(i));
        }
        for (int i = 0; i < adjList.length; i++) {
            for (int neighbor : adjList[i]) {
                map.get(i + 1).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(1);
    }

    // Utility to serialize graph for clean "Expected vs Actual" console output
    public static String serialize(Node node) {
        if (node == null) return "[]";
        if (node.neighbors.isEmpty()) return "[[]]";

        Map<Integer, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.put(node.val, node);

        int maxVal = node.val;
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            maxVal = Math.max(maxVal, curr.val);
            for (Node neighbor : curr.neighbors) {
                if (!visited.containsKey(neighbor.val)) {
                    visited.put(neighbor.val, neighbor);
                    queue.add(neighbor);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= maxVal; i++) {
            List<Integer> neighbors = new ArrayList<>();
            if (visited.containsKey(i)) {
                for (Node n : visited.get(i).neighbors) {
                    neighbors.add(n.val);
                }
            }
            result.add(neighbors);
        }
        return result.toString();
    }

    // Validates structural equality and distinct memory references
    public static boolean isDeepCopy(Node original, Node clone) {
        if (original == null && clone == null) return true;
        if (original == null || clone == null) return false;
        if (original == clone) return false; // Fail if it's the exact same object in memory

        return serialize(original).equals(serialize(clone));
    }
}
