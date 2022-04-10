public class Node {
    Node leftNode;  //Node's left child
    Node rightNode; //Node's right child
    String data;  //Node data
    boolean visited = false;

    public Node(String data){
        this.data = data;
    }

    public Node(String data, Node leftNode, Node rightNode){
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public void setVisited(){
        visited = true;
    }
}
