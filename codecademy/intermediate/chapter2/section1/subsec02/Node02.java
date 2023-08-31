package intermediate.chapter2.section1.subsec02;

public class Node02 {

    public String data;
    public Node02 next;

    public Node02(String data) {
        this.data = data;
        this.next = null;
    }
    public void setNextNode(Node02 node){
        this.next = node;

    }
    public static void main(String[] args) {
        Node02 firstNode = new Node02("I am a Node!");
        Node02 secondNode = new Node02("I am the second Node!");
        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.next.data);
    }

}