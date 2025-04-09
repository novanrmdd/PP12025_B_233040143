package P7_T4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen di awal list
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);

        // List sekarang: 2 6 3 5 1
        System.out.print("List awal: ");
        list.displayList();

        // Hapus elemen terakhir
        list.removeTail(); // Hapus 1 → 2 6 3 5
        System.out.print("Setelah removeTail: ");
        list.displayList();

        // Hapus elemen pertama
        list.removeHead(); // Hapus 2 → 6 3 5
        System.out.print("Setelah removeHead: ");
        list.displayList();

        // Hapus elemen terakhir
        list.removeTail(); // Hapus 5 → 6 3
        System.out.print("Setelah removeTail lagi: ");
        list.displayList(); // Output akhir: 6 3
    }
}