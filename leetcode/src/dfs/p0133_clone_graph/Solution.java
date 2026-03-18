package dfs.p0133_clone_graph;

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
import java.util.Map;

class Solution {
    Map<Node, Node> map;

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        map = new HashMap<>();

        dfs(node, map);

        return map.get(node);
    }

    public void dfs(Node originalNode, Map<Node, Node> map) {
        if (map.containsKey(originalNode)) return;

        Node cloneNode = new Node(originalNode.val);
        map.put(originalNode, cloneNode);

        for (Node neighbor : originalNode.neighbors) {
            dfs(neighbor, map);
            cloneNode.neighbors.add(map.get(neighbor));
        }
    }
}