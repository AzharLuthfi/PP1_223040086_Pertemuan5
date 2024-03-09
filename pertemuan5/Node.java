package pertemuan5;

public class Node {
	private double data;
	private Node next;

	//LATIHAN 1
	/* inisialisasi atribut node */
	public Node (double data) {
		this.data = data;
	}
	/* setter & getter */
	/* getter Data */
	public double getData() {
		return data;
	}
	/* setter data */
	public void setData(double data) {
		this.data = data;
	}
	/* getter next */
	public Node getNext() {
		return next;
	}
	/* setter next */
	public void setNext(Node next) {
		this.next = next;
	}
}
