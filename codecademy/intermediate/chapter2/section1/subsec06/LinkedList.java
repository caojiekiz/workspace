package intermediate.chapter2.section1.subsec06;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }
    public void addToTail(String data) {
        Node tail = this.head;
        if(tail == null) {
            this.head = new Node(data);
        } else {
            while(tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }
    public String removeHead() {
        Node removedHead = this.head;
        if(removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }
    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
    public static void main(String []args) {
        LinkedList seasons = new LinkedList();
        seasons.printList();
        // Node summer = new Node();
        // Node spring = new Node();
        seasons.addToHead("summer");
        seasons.printList();
        seasons.addToHead("spring");
        seasons.addToTail("fall");
        seasons.addToTail("winter");
        seasons.printList();
        seasons.removeHead();
        seasons.printList();
    }

}
