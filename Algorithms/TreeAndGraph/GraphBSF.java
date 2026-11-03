package Algorithms.TreeAndGraph;

import java.util.*;

public class GraphBSF {
    int V; // Number of vertices
    LinkedList<Integer>[] adj; // Adjacency Lists

    // 1. Constructor to setup the graph
    public GraphBSF(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>(); // Initialize empty list for each node
        }
    }

    // 2. Add an edge (Undirected graph example)
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // 3. The BFS Algorithm
    public void BFS(int startNode) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            // Remove front node and print
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Explore all unvisited neighbours
            for (int neighbor : adj[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark visited immediately
                    queue.add(neighbor);      // Add to queue
                }
            }
        }
    }

    // 4. Main method to test
    public static void main(String[] args) {
        GraphBSF g = new GraphBSF(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.print("BFS Traversal: ");
        g.BFS(0);
    }
}