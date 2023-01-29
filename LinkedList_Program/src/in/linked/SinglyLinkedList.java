package in.linked;

import in.linked.SingleLinkedList.Node;

public class SinglyLinkedList {
	class Node{
		private int value;
		private Node next;
		
		public Node(int data) {
			this.value = value;
			this.next = next;
		}
	}
	
	      public Node head;
	      public Node tail;
	      public int size;
	      
	      
	      public Node createSinglyLL(int nodeValue) {
	    	  head=new Node(nodeValue);
	    	  Node newNode=new Node(nodeValue); 
	    	 
	    	  newNode.next=null;
	    	  
	    	  newNode.value=nodeValue;
	    	  head=newNode;
	    	  tail=newNode;
	    	  size=1;
	    	  return head;
	    	  
	    	
	      }
	      
	      public void insertLinkedList(int nodeValue ,int location) {
	    	  Node newNode=new Node(location);
	    	  newNode.value=nodeValue;
	    	  if(head==null) {
	    		  createSinglyLL(nodeValue) ;
	    	  }
	    	  else if(location ==0) {
	    		  newNode.next=head;
	    		  head=newNode;
	    	  }else if(location >=size) {
	    		  newNode.next=null;
	    		  tail.next=newNode;
	    		  tail=newNode;
	    	  } else {
	    		  Node tempNode =head;
	    		  int index=0;
	    		  while(index < location-1) {
	    			  tempNode =tempNode.next;
	    			  index++ ;
	    			  
	    		  }
	    		  Node nextNode =tempNode.next;
	    		  tempNode.next=nextNode;
	    	  }
	    	  
	    	 size ++; 
	      }
	      
	     // traversing the linked list 
	      public void traverseLinkedList() {
	    	  if(head==null) {
	    		  System.out.println("List does not exits");
	    	  }   else {
	    		  Node tempNode=head;
	    		  for (int i = 0; i < size; i++) {
	    			  System.out.print(tempNode.value);
					if(i !=size -1) {
						System.out.print("--->");
					}
					tempNode =tempNode.next;
				}
	    	  }
	      }
	      
	      // serching of Node
	      boolean searchNode(int nodeValue) {
	    	  if(head  !=null) {
	    		  Node tempNode=head ;
	    		  for (int i = 0; i < size; i++) {
	    			  if(tempNode.value ==nodeValue) {
	    				  System.out.println("Node  Found At the location ="+ i);
	    				  return true;
	    			  }
	    			  tempNode =tempNode.next;
				}
	    	  }   
	    	  System.out.println("Node not found");
	    	  return false;
	      }
	      
	    // delete thenode 
	      public void deleteNode(int location) {
	    	  if(head==null) {
	    		  System.out.println(" List is emplty");
	    		  return ;
	    	  } else if(location ==0) {
	    		  head=head.next ;
	    		  size--;
	    		  if(size==0) {
	    			  tail=null;
	    			  System.out.println("List is empty");
	    		  }
	    	  }   
	    	  else if(location >=size) {
	    		  Node tempNode =head ;
	    		  for (int i = 0; i < size -1; i++) {
	    			  tempNode =tempNode.next;
					
				}  if(tempNode ==head) {
					tail=head=null;
					size--;
					return ;
				} 
				tempNode.next =null;
				tail =tempNode;
				size--;
	    	  }else {
					Node tempNode =head ;
					for (int i = 0; i < location -1; i++) {
						tempNode=tempNode.next;
						
					}
					tempNode.next=tempNode.next;
					size--;
				}
	    	  }  
	      
	      // delete all the node 
	      public void  deleteAllNode() {
	    	  head=null;
	    	  tail=null;
	    	  size=0;
	    	  System.out.println("Delete node Sucessfully");
	    	  
	      }
	      
	      
	      }


