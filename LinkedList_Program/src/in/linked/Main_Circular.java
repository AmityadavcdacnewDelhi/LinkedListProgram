package in.linked;

public class Main_Circular {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		
		cll.createNode(10);
		// it's proved that it is a circular linked list
		cll.insertNode(20, 1);
		cll.insertNode(30, 2);
		cll.insertNode(40,3);
		cll.insertNode(50, 5);
		cll.traverseLinkedList();
		cll.searchNode(40);
		cll.searchNode(30);
		System.out.println(cll.head.value);
		System.out.println(cll.head.next.value);
		System.out.println(cll.head.next.next.value);
		System.out.println(cll.head.next.next.next.value);
		System.out.println(cll.head.next.next.next.next.value);
		System.out.println(cll.head.next.next.next.next.next.value);
		
		cll.deleteNode(0);
		//cll.deleteNode(1);
		System.out.println();
		cll.traverseLinkedList();
}
}
