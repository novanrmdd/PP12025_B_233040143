package P7_T4;

// Kelas Node
class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.setData(data);
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}