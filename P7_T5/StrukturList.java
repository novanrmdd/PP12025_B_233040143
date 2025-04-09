package P7_T5;

// Kelas StrukturList
public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Menambahkan elemen di akhir list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Menampilkan seluruh elemen list
    public void displayList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " "); // Ganti getNilai() dengan akses langsung ke data
            current = current.getNext();
        }
        System.out.println();
    }

    // Menghapus elemen tertentu di tengah list
    public void removeMid(int e) {
        Node tempNode = new Node(0);
        Node preNode;
        int i = 1;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            preNode = HEAD;

            while (preNode.getNext() != null && !ketemu) {
                if (preNode.getNext().data == e) { // Ganti getNilai() dengan akses langsung
                    ketemu = true;
                } else {
                    tempNode = preNode;
                    preNode = preNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    tempNode.setNext(tempNode.getNext().getNext());
                }
            }
        }
    }
}
