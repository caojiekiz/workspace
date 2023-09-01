package intermediate.chapter7.graphTraverser;


public class Queue {

    public LinkedList queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(Vertex data) {
        this.queue.addToTail(data);
        this.size++;
    }

    public String peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.queue.head.data;
        }
    }

    public String dequeue() {
        if (!this.isEmpty()) {
            String data = this.queue.removeHead();
            this.size--;
            return data;
        } else {
            throw new Error("LinearDataStructures.Queues.Queue is empty!");
        }
    }

}
