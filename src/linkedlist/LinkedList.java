package linkedlist;

public class LinkedList {

	/**
	 * addNodeLast - this method is created to add data to linedList
	 * printLinkedList-this method display the values of linked list
	 * addAtStart  - this method is used to add no at start of the linked list
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 *
	 */
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
	public Node head = null;  
	public Node tail = null;  
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
		System.out.println("Adding nodes to the Start of the list: ");  

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

}