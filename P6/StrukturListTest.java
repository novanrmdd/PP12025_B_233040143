package P6;	

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addLast(4);
        list.addLast(3);
        list.addLast(7);
        list.addLast(8);
        list.addLast(1);
        list.addLast(9);

        System.out.print("");
        list.printList();

        list.removeAll();

        System.out.print("List Kosong");
        list.printList();
    }
}