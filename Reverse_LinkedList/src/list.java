public class list {
    static Node head;

    public static void main(String[] args){
        list linkedList = new list();
        linkedList.head = new Node(10);
        linkedList.head.next = new Node(20);
        linkedList.head.next.next = new Node(30);
        linkedList.head.next.next.next = new Node(40);

        //print the original linkedList values
        linkedList.printList(head);

        head = linkedList.reverse(head);
        //print the reversed linkedList values
        linkedList.printList(head);


    }

    public Node reverse(Node node){
        Node prevNode = null;
        //set the current node to head node
        Node currentNode = node;
        Node nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        //set the last node as head
        node = prevNode;
        return node;
    }

    public void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }
}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
