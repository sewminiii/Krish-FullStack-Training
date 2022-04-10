import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private boolean visited;
    private List<Node> neighbourList;

    public Node(String name){
        this.name = name;
        this.neighbourList = new ArrayList<>();
    }

    public void addNeighbour(Node node){
        this.neighbourList.add(node);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Node> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Node> neighbourList) {
        this.neighbourList = neighbourList;
    }
}
