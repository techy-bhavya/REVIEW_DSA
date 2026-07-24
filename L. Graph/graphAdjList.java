import java.util.ArrayList;

public class graphAdjList {

    static class Edge {
        int u;
        int v;
        int wt;

        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }

        @Override
        public String toString() {
            return "(" + u + "," + v + "," + wt + ")";
        }
    }

    public static void addEdge(
            ArrayList<Edge>[] graph,
            int u,
            int v,
            int wt
    ) {
        graph[u].add(new Edge(u, v, wt));
        graph[v].add(new Edge(v, u, wt));
    }

    public static void displayGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {

            System.out.print("Edges coming out of " + i + " -> ");

            for (Edge e : graph[i]) {
                System.out.print(e + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 7;

        ArrayList<Edge>[] graph = new ArrayList[N];

        // Create an empty list for every vertex
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        addEdge(graph, 0, 1, 2);
        addEdge(graph, 1, 2, 5);
        addEdge(graph, 1, 4, 3);
        addEdge(graph, 3, 4, 4);
        addEdge(graph, 3, 5, 7);
        addEdge(graph, 3, 6, 9);
        addEdge(graph, 5, 6, 8);

        displayGraph(graph);
    }
}

