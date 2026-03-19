package bfs.p0133_clone_graph;

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

        bfs(node, map);

        return map.get(node);
    }

    public void bfs(Node originalNode, Map<Node, Node> map) {
        Queue<Node> queue = new LinkedList<>();

        Node cloneNode = new Node(originalNode.val);
        map.put(originalNode, cloneNode);

        queue.offer(originalNode);

        while(!queue.isEmpty()) {
            Node currNode = queue.poll();

            for (Node neighbor : currNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    queue.offer(neighbor);
                    map.put(neighbor, new Node(neighbor.val));
                }
                map.get(currNode).neighbors.add(neighbor);
            }
        }
    }
}