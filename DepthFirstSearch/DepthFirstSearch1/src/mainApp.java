public class mainApp {

    public static void main(String[] args){
        Node graph = sampleGraph();
        DFS bfs = new DFS();
        bfs.traversal(graph);
    }

    //giving a sample graph
    public static Node sampleGraph(){
        Node rootNode = new Node("A",
                new Node("B",
                        new Node("C"), new Node("D")),
                new Node("E",
                        new Node("F"), new Node("G",
                        new Node("H"),null)));

        return rootNode;
    }
}
