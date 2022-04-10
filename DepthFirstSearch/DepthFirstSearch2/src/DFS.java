import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Node> stack;

    public DFS(){
        this.stack = new Stack<>();
    }

    public void traversing(List<Node> nodeList){
        //iterate through all the nodes in the node list
        for(Node n : nodeList){
            if(!n.isVisited()){
                n.setVisited(true);
                traverseWithStack(n);
            }
        }
    }

    private void traverseWithStack(Node root) {
        //insert the node into a stack
        this.stack.add(root);
        root.setVisited(true);

        System.out.println("Depth First Search output : ");

        while(!stack.isEmpty()){
            //remove a node from stack as LIFO method
            Node node = this.stack.pop();
            System.out.print(node + " ");

            //iterate through the neighbourList
            //to get all the neighbour nodes for the particular node
            for(Node n : node.getNeighbourList()){
                if(!n.isVisited()){
                    n.setVisited(true);
                    this.stack.push(n);
                }
            }
        }
    }
}
