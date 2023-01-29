package in.linked;



public class DoublyLinkedList {
	BinaryLinked_Node head;
	BinaryLinked_Node tail;
	int size;
	
	public BinaryLinked_Node createNode(int nodeValue) {
		head = new BinaryLinked_Node(nodeValue);
		BinaryLinked_Node newNode = new BinaryLinked_Node(nodeValue);
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode;
		size = 1;
	    return head;
	}
	//Insert Node
		public void insertNode(int nodeValue, int location) {
			head = new BinaryLinked_Node(nodeValue); 
			BinaryLinked_Node newNode = new BinaryLinked_Node(nodeValue);
			newNode.value = nodeValue;
			if (head == null) {
				createNode(nodeValue);
			} else if (location == 0) {
				newNode.next = head;
				head = newNode;
				tail.next = head;
			} else if (location >= size) {
				tail.next = newNode;
				tail = newNode;
				tail.next = head;

			} else {
				BinaryLinked_Node tempNode = head;
				int index = 0;
				while (index < location - 1) {
					tempNode = tempNode.next;
					index++;

				}
				newNode.next = tempNode.next;
				tempNode.next = newNode;
				tempNode.next= newNode;
				newNode.next.prev=newNode;
			}
			size++;
		}
		// traversing the linked list
		public void traverseLinkedList() {
			if (head == null) {
				System.out.println("Linked List does not exist!");
			} else {
				BinaryLinked_Node tempNode = head;
				for (int i = 0; i < size; i++) {
					
					System.out.print(tempNode.value + " --> ");
					tempNode = tempNode.next;
				}
				System.out.println("");

			}
		}
		
		// searching the node
		
			boolean searchNode(int nodeValue) {
				if(head != null) {
					BinaryLinked_Node tempNode = head;
					for(int i = 0; i<size; i++) {
						if(tempNode.value == nodeValue) {
							System.out.println("Node found at the location: "+ i);
							return true;
						}
						tempNode = tempNode.next;
					}
				}
				System.out.println("Node not found!");
				return false;
			}
			public void deleteNodeDLL(int location) {
				if (head == null) {
					System.out.println("The DLL does not exist!");
					return;
				} else if (location == 0) {
					if (size == 1) {
						head = null;
						tail = null;
						size--;
						return;
					} else {
						head = head.next;
						head.prev = null;
						size--;
					}
				} else if (location >= size) {
					BinaryLinked_Node tempNode = tail.prev;
					if (size == 1) {
						head = null;
						tail = null;
						size--;
						return;
					} else {
						tempNode.next = null;
						tail = tempNode;
						size--;
					}
				} else {
					BinaryLinked_Node tempNode = head;
					for (int i = 0; i < location - 1; i++) {
						tempNode = tempNode.next;
					}
					tempNode.next = tempNode.next.next;
					tempNode.next.prev = tempNode;
					size--;
				}
			}
	  
	
}