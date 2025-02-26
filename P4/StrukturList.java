package P4;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addTail(double data) {
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

    public void addMid(double data, int position) {
        if (HEAD == null || position <= 0) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = HEAD;
        int index = 0;

        while (curNode.getNext() != null && index < position - 1) {
            curNode = curNode.getNext();
            index++;
        }

        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(10);
        list.addTail(20);
        list.addTail(30);

        System.out.println("Isi Linked List:");
        list.displayElement();

        list.addMid(25, 2);
        System.out.println("Setelah menambahkan 25 di posisi 2:");
        list.displayElement();
    }
}
