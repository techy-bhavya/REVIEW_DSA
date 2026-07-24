public class graphAdjMatrix {
  public static void main(String[] args) {

      int vertices = 7;

      int[][] graph = new int[vertices][vertices];

      addEdge(graph, 0, 1, 2);
      addEdge(graph, 1, 2, 5);
      addEdge(graph, 1, 4, 3);
      addEdge(graph, 3, 4, 4);
      addEdge(graph, 3, 5, 7);
      addEdge(graph, 3, 6, 9);
      addEdge(graph, 5, 6, 8);

      display(graph);
  }

  public static void addEdge(int[][] graph, int u, int v, int weight) {

      graph[u][v] = weight;
      graph[v][u] = weight; // Because graph is undirected
  }

  public static void display(int[][] graph) {

      for (int i = 0; i < graph.length; i++) {
          for (int j = 0; j < graph.length; j++) {
              System.out.print(graph[i][j] + " ");
          }
          System.out.println();
      }
  }
}