package P10;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        graph.adjacencyMatrix();
        System.out.println();
    }
}