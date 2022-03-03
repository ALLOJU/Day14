package linkedlist;

public class LinkedList {

	/**
	 * appendNode - this method is created to add data to linedList
	 * printLinkedList-this method display the values of linked list
	 * addAtStart  - this method is used to add no at start of the linked list
	 * addInMid - Method to insert element at middle of the list
	 * deleteNodeFromStart - Delete Node from starting of linked list
	 * deleteNodeFromEnd - Delete Node from End of linked list

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
	
}  


