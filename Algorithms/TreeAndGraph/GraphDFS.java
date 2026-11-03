package Algorithms.TreeAndGraph;

import java.util.*;

public class GraphDFS {
    int V; // Number of vertices
    LinkedList<Integer>[] adj; // Adjacency Lists

    // 1. Constructor to setup the graph
    public GraphDFS(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // 2. Add an edge (Undirected graph)
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // Remove this line if the graph is Directed!
    }

    // 3. The Recursive DFS Helper
    // We pass 'visited' so all recursive calls share the same memory
    private void dfsRecursive(int currentNode, boolean[] visited) {
        // Arrive & Mark visited immediately
        visited[currentNode] = true;
        System.out.print(currentNode + " ");

        // Explore all neighbours
        for (int neighbor : adj[currentNode]) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited); // Dive deep!
            }
        }
    }

    // 4. The DFS Starter Method
    public void DFS(int startNode) {
        boolean[] visited = new boolean[V];

        // Start the recursion
        dfsRecursive(startNode, visited);

        // (Optional for Exam) To handle disconnected graphs:
        // for (int i = 0; i < V; i++) {
        //     if (!visited[i]) dfsRecursive(i, visited);
        // }
    }

    // 5. Main method to test
    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.print("DFS Traversal: ");
        g.DFS(0);
    }
}