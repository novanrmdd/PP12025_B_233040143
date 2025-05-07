package P7;

public class LinkedList {
    private Node HEAD;

    public LinkedList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    //2
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(Matakuliah data) {
        Node newNode = new Node(data);

        if (isEmpty() || data.getKode().compareTo(HEAD.getData().getKode()) < 0) {
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null &&
                   data.getKode().compareTo(curNode.getNext().getData().getKode()) > 0) {
                curNode = curNode.getNext();
            }
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }
    
    public void addTail(Matakuliah data) {
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
    
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah m = curNode.getData();
                System.out.println(
                    "Kode: " + m.getKode() + 
                    ", Nama: " + m.getNama() + 
                    ", SKS: " + m.getSks()
                );
                curNode = curNode.getNext();
            }
        }
    }
}