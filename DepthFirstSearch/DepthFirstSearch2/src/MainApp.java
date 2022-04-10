import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args){
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");

        List<Node> list = new ArrayList<>();

        //adding neighbours of each node
        n1.addNeighbour(n2);
        n1.addNeighbour(n3);
        n3.addNeighbour(n4);
        n4.addNeighbour(n5);

        //adding each node to a list
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);

        //calling traversing method by passing the list of nodes
        DFS dfs = new DFS();
        dfs.traversing(list);

    }
}
