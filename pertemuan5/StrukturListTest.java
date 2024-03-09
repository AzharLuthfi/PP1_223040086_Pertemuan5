package pertemuan5;



public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList mylist = new StrukturList();
		
		//add nilai list:
		mylist.addTail(2);
		mylist.addTail(6);
		mylist.addTail(3);
		mylist.addTail(5);
		mylist.addTail(1);
		System.out.println("add list");
		mylist.displayElement();
		
		//remove tail
		mylist.removeTail();
		System.out.println();
		System.out.println("Remove nilai akhir");
		mylist.displayElement();
		
		// remove middle
		mylist.removeMid(2);
		System.out.println();
		System.out.println("Remove nilai di tengah");
		mylist.displayElement();
		
		// remove head
		mylist.removeHead();
		System.out.println();
		System.out.println("Remove nilai awal");
		mylist.displayElement();
		
		
	}
	
	
	
	
}
