package linkedlist;

public class LinkedList {

	/**
	 * appendNode - this method is created to add data to linedList
	 * printLinkedList-this method display the values of linked list
	 * addAtStart  - this method is used to add no at start of the linked list
	 * addInMid - Method to insert element at middle of the list
	 * deleteNodeFromStart - Delete Node from starting of linked list
	 * deleteNodeFromEnd - Delete Node from End of linked list
	 * searchNode   - Search node at particular position
	 * insertAtsearchNode -  Insert element after search element
	 * deleteAtsearchNode - delete the node at search element position
	 * sortList   - Sort elements of Linked list in ascending order

	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 *
	 */
	public static Node head = null;  
	public Node tail = null;  
	public int size;
	public Node appendNode(Node head, int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}

		return head;
	}

	//addAtStart() will add a new node to the beginning of the list  
	public void addAtStart(int data) {  

		//Create a new node  
		Node newNode = new Node(data);  
		//Checks if the list is empty  
		if(head == null) {  
			//If list is empty, both head and tail will point to new node  
			head = newNode;  
			tail = newNode;  
		}  
		else {  
			//Node temp will point to head  
			Node temp = head;  
			//newNode will become new head of the list  
			head = newNode;  
			//Node temp(previous head) will be added after new head  
			head.next = temp;  
		}  
	}  


	//display() will display all the nodes present in the list  
	public void display() {  

		//Node current will point to head  
		Node current = head;  
		if(head == null) {  
			System.out.println("List is empty");  
			return;  
		}  

		while(current != null) {  
			//Prints each node by incrementing pointer  
			System.out.print(current.data + " ");  
			current = current.next;  
		}  
		System.out.println();  
	}  



	public void printLinkedList(Node head){
		System.out.println("Adding nodes to the End of the list: ");  
		if (head == null) {
			System.out.println("LinkedList is empty"); 
		} 
		else 
		{ 
			Node pointer = head;
			while (pointer != null) 
			{ System.out.print(pointer.data + " "); 
			pointer = pointer.next; 
			}
		} 
	}

	/* Delete Node from starting of linked list*/
	public Node deleteNodeFromStart(Node head) {
		System.out.println("Deleted node from start : " + head.data);
		head = head.next;
		return head;
	}
	/*
	 * delete node from end of the list*/
	public void deleteNodeFromEnd(Node head) {
		Node pointer = head;
		Node prev = null;

		while (pointer.next != null) {
			prev = pointer;
			pointer = pointer.next;
		}
		System.out.println("Deleted node from end : " + pointer.data);
		prev.next = null;
	}
	/*
	 * Search element from linked list*/
	public void searchNode(int data) {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                 //Compares node to be found with each node present in the list  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + i);  
        	
        else  
             System.out.println("Element is not present in the list");  
    }  
	public void insertAtsearchNode(int data) {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                 //Compares node to be found with each node present in the list  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag) {  
        	int data1=40;
             System.out.println("Element is present in the list at the position : " + i);
        	insertNth(head,data1,i);
        }
        else  
             System.out.println("Element is not present in the list");  
    }  
	public void deleteAtsearchNode(int data) {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                 //Compares node to be found with each node present in the list  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag) {  
        	int data1=40;
             System.out.println("Element is present in the list at the position : " + i);
             deleteFromSpecificLocation(head, i);
        }
        else  
             System.out.println("Element is not present in the list");  
    } 
	 // sortList() will sort nodes of the list in ascending
    // order
    public void sortList()
    {
 
        // Node current will point to head
        Node current = head, index = null;
 
        int temp;
 
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
 
	public void insertNth(Node head,int data, int position) {
	    //create new node.
	    Node node = new Node(data);
	    node.data = data;
	    node.next = null;

	    if (head == null) {
	      //if head is null and position is zero then exit.
	      if (position != 0) {
	       return;
	      } else { //node set to the head.
	       head = node;
	      }
	    }

	    if (head != null && position == 0) {
	      node.next = head;
	      head = node;
	      return;
	    }

	    Node current = head;
	    Node previous = null;

	    int i = 0;

	    while (i < position) {
	      previous = current;
	      current = current.next;

	      if (current == null) {
	        break;
	      }

	       i++;
	      }

	      node.next = current;
	      previous.next = node;
	}
	public void addNode(int data) {  
		Node newNode = new Node(data);  

		if(head == null) {  
		head = newNode;  
		tail = newNode;  
		}  
		else {  
		tail.next = newNode;  
		tail = newNode;  
		}  
		size++;  
		}  

		public void addInMid(int data){  
		Node newNode = new Node(data);  

		if(head == null) {  
		head = newNode;  
		tail = newNode;  
		}  
		else {  
		Node temp, current;  
		int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
		temp = head;  
		current = null;  

		for(int i = 0; i < count; i++) {  
		    current = temp;  
		    temp = temp.next;  
		}  

		current.next = newNode;  
		newNode.next = temp;  
		}  
		size++;  
		}  

		public void displayNode() {  
		Node current = head;  
		if(head == null) {  
		System.out.println("List is empty");  
		return;  
		}  

		while(current != null) {  
		System.out.print(current.data + " ");  
		current = current.next;  
		}  
		System.out.println();  
		}  
		public void deleteFromSpecificLocation(Node head, int position) {
			 if(position < 1) {
			      System.out.print("\nposition should be >= 1.");
			    } else if (position == 1 && head != null) {
			      Node nodeToDelete = head;
			      head = head.next;
			      nodeToDelete = null;
			    } else {
			      Node pointer;
			      
			      pointer = head;
			      for(int i = 1; i < position-1; i++) {
			        if(pointer != null) {
			        	pointer = pointer.next;
			        }
			      }
			      if(pointer != null && pointer.next != null) {
			        Node nodeToDelete = pointer.next;
			        pointer.next = pointer.next.next; 
			        nodeToDelete = null; 
			      } else {
			        System.out.print("\nThe node is already null.");
			      }       
			    }
		}
	
}  


