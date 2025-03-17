import java.util.*;

class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }

    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];

        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;
                for (int neighbor : adjList.get(node)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.dfs(0); // Output: 0 2 4 1 3
    }
}
