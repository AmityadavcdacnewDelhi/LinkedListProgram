package in.linked;

public class SingleLinkedList {
	class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	
	
	public void insertatthebegening(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			newNode.next = this.head;
			this.head = newNode;
		}
	}
	
	public void insertattheLast(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			Node current = this.head;
			while(current.next !=null) {
				current = current.next;
			}
			
			current.next = newNode;
		}
	}
	
	
	public void insertinbetween(int position, int data) {
		Node newNode = new Node(data);
		Node current = this.head;
		Node previous = this.head;
		
		if(position == 1) {
			newNode.next = head;
			this.head = newNode;
			return;
		}
		while(current.next !=null && position > 0) {
			previous = current;
			current = current.next;
		}
		
		previous.next = newNode;
		newNode.next = current;
	}
	
	public void deletionfrombeginning() {
		if(this.head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			head = head.next;
			
		}
	}
	
	public void deletionfromend() {
		if(this.head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			Node current = this.head;
			while(current.next.next != null ) {
				current = current.next;
			}
			current.next = null;
		}
	}
	
	
	public void deletionfrombetween(int position) {
		if(this.head == null) {
			System.out.println("Linked List is empty");
		}
		else if(position == 0) {
			head = head.next;
		}
		else {
			Node current = head;
			for(int i = 0; current !=null && i<position-1 ; i++) {
				current = current.next;
				
			if(current == null || current.next == null) {
				System.out.println("The Element is not present at the position");
			}
			
			Node temp = current.next.next;
			current.next = temp;
			}
		}
	}
	
	public void Display() {
		if(this.head == null ) {
			System.out.println("Empty list");
		}
		
		else {
			Node current = this.head;
			while(current != null) {
				System.out.print(current.data + " -->");
				current = current.next;
			}
			
			System.out.print("NULL");
		}
	}


	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		//sll.Display();
		sll.insertatthebegening(1);
		sll.insertattheLast(3);
		sll.insertinbetween(0, 10);
		sll.deletionfrombetween(1);
		sll.Display();
}
}