package P7_T5;

// Kelas Node
class Node {
    int data;
    private Node next;

    public Node(int data) {
        this.data = data;
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

    public int getNilai() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNilai'");
    }
}