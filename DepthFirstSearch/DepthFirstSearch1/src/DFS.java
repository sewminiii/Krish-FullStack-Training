public class DFS {

    public void traversal(Node node){
        if(node == null)
            return;

        if(node.visited == false) {
            System.out.print(node.data + " ");
            node.setVisited();
            traversal(node.leftNode);
            traversal(node.rightNode);
        }

    }
}
