package P6;

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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
            return;
        }

        Node current = HEAD;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }
        }

        return ketemu;
    }
    
    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah += 1;
            curNode = curNode.getNext();
        }

        return jumlah;
    }
    
    public void removeAll() {
        HEAD = null;
    }
}