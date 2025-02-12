package P1;

public class NodeMain {
	public static void main(String[] args) {
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		
		n1.setNext(n2);
		
		Node p =n1;
		while (p!= null) {
			System.out.printf("%d", p.getNilai());
			p = p.getNext();
		}
	}
}
