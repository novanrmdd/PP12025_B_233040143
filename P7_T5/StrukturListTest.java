package P7_T5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambahkan elemen: 2, 6, 3, 5, 1
        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(5);
        list.addLast(1);

        // Tampilkan elemen
        System.out.print("List awal: ");
        list.displayList(); // Output: 2 6 3 5 1

        // Hapus elemen 3 (di tengah)
        list.removeMid(5);
        System.out.print("Hapus setelah 6: ");
        list.displayList(); // Output: 2 6 5 1

        // Hapus elemen 5 (di tengah lagi)
        list.removeMid(5);
        System.out.print("Hapus sebelum 5: ");
        list.displayList(); // Output: 2 5 1
    }
}
