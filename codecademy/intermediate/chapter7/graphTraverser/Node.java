package intermediate.chapter7.graphTraverser;

public class Node {

    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node(Vertex data) {
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

}
