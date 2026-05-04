import java.util.*;

public class GraphBFS {
    private int vertices;
    private LinkedList<Integer>[] adj;

    // Initialize the graph
    public GraphBFS(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Add an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS traversal from a given source 's'
    public void BFS(int s) {
        // Mark all vertices as not visited (default is false)
        boolean[] visited = new boolean[vertices];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            // Dequeue a vertex and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If an adjacent has not been visited, mark it visited and enqueue it
            for (int neighbor : adj[s]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {
        GraphBFS g = new GraphBFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2):");
        g.BFS(2);
    }
}
