import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void traversal(Node node1){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node1);

        while (!queue.isEmpty()) {
            //remove each element from the queue and assign to a Node object
            Node node = queue.remove();
            System.out.println("Breadth First Search output : ");

            if(node != null) {
                if(node.visited != true) {
                    System.out.print(node.data + " ");
                    //checks whether the current node has any left node
                    if (node.leftNode != null) {
                        queue.add(node.leftNode);
                    }
                    //checks whether the current node has any right node
                    if (node.rightNode != null) {
                        queue.add(node.rightNode);
                    }
                }
            }
        }


    }
}
