package P4;

public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList list1 = new StrukturList();
		StrukturList list2 = new StrukturList();
	      list1.addTail(2.1);
	      list1.addTail(3.4);
	      list1.addTail(4.5);
	      System.out.println("a:");
	      list1.displayElement(); 
	      
	      list2.addHead(3.4);
	      list2.addHead(2.1);
	      list2.addTail(4.5);
	      list2.addMid(1.1, 2);
	      list2.addTail(5.5);
	      System.out.println("b:");
	      list2.displayElement(); 
	}
}