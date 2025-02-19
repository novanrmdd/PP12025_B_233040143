package P3;

public class StrukturList {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Menambahkan elemen di akhir (tail)
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Menambahkan elemen di awal (head)
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // Menampilkan elemen dalam linked list
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Menambahkan elemen di head
        list.addHead(10);
        list.addHead(20);
        list.addHead(30);

        // Menambahkan elemen di tail
        list.addTail(40);
        list.addTail(50);

        System.out.println("Isi Linked List:");
        list.displayElement();
    }
}
