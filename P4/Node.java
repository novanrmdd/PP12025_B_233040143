package P4;

public class Node {
	private double data;
	private Node Next;
	
	public Node(double data) {
		this.data = data;
	}
	
	public void setData (double data) {
		this.data=data;
	}
	
	public double getData() {
		return data;
	}
	
	public void setNext (Node Next) {
		this.Next = Next;
	}
	
	public Node getNext() {
		return Next;
	}
}