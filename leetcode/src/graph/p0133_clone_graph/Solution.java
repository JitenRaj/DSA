package graph.p0133_clone_graph;

/* **
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    Map<Node, Node> map;
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        map = new HashMap<>();

        dfs(node, map);
        bfs(node, map);

        return map.get(node);
    }

    // Depth First Search
    public void dfs(Node originalNode, Map<Node, Node> map) {
        if (map.containsKey(originalNode)) return;

        Node newNode = new Node(originalNode.val);

        map.put(originalNode, newNode);

        for (Node neighbor : originalNode.neighbors) {
            dfs(neighbor, map);
            newNode.neighbors.add(map.get(neighbor));
        }
    }

    // Breadth First Search
    public void bfs(Node originalNode, Map<Node, Node> map) {
        Queue<Node> queue = new LinkedList<>();

        Node newNode = new Node(originalNode.val);
        map.put(originalNode, newNode);

        queue.offer(originalNode);

        while (!queue.isEmpty()) {
            Node currNode = queue.poll();

            for (Node neighbor : currNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }

                map.get(currNode).neighbors.add(map.get(neighbor));
            }
        }
    }
}
