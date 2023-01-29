package in.linked;

public class CircularLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createNode(int nodeValue) {
		head = new Node();
		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = newNode;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

//Insert Node
	public void insertNode(int nodeValue, int location) {
		Node newNode = new Node();
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
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;

			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
		size++;
	}

	// traversing the linked list
	public void traverseLinkedList() {
		if (head == null) {
			System.out.println("Linked List does not exist!");
		} else {
			Node tempNode = head;
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
				Node tempNode = head;
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
		
		// deleting the node
		
		public void deleteNode(int location) {
			if(head == null) {
				System.out.println("the linked list is empty!");
				return;
			}
			else if(location == 0) {
				head = head.next;
				tail.next=head;
				size--;
				if(size == 0) {
					tail = null;
					head.next=null;
					head=null;
				}
			}
			else if(location >= size) {
				Node tempNode = head;
				for (int i = 0; i < size-1; i++) {
					tempNode = tempNode.next;
				}
				if(tempNode == head) {
					head.next=null;
					tail = head = null;
					size--;
					return;
				}
				tempNode.next = null;
				tail = tempNode;
				size--;	
			}
		
			else {
				Node tempNode = head;
				for(int i = 0; i < location-1; i++) {
					tempNode = tempNode.next;
				}
				tempNode.next = tempNode.next.next;
				size--;
			}
		}
		// delete all the nodes 
		public void deleteAllNodes() {
			head = null;
			tail = null;
			tail.next=null;
			size = 0;
			System.out.println("the linked list deleted successfully");
		}
		
}
