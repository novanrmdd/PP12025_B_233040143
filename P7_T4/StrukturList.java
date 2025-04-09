package P7_T4;

// Kelas StrukturList
public class StrukturList {
    Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void removeHead() {
        if (HEAD == null) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if (HEAD == null) {
            System.out.println("List kosong");
            return;
        }

        if (HEAD.getNext() == null) {
            // Hanya satu elemen di list
            dispose(HEAD);
            HEAD = null;
            return;
        }

        Node prev = null;
        Node current = HEAD;

        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }

        prev.setNext(null);
        dispose(current);
    }

    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public void displayList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
