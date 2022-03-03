package linkedlist;

public class Main {
	/**
	 * Main method for manipulation linkedList
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * PROCEDURE
		 * 1. Creating Lined list
		 * 2. Adding nodes to linkedList
		 * 3. Printing linedList after adding nodes
		 * 4.Adding nodes  to the list
		 * 5. Printing linedList after adding nodes
		 */

		/*
		 * 1. Creating Lined list
		 */
		LinkedList list = new LinkedList();

		/*
		 * 2. Adding nodes to linkedList
		 */
		Node head = list.addNodeLast(null,56);
		list.addNodeLast(head, 30);
		list.addNodeLast(head, 70);


		/*
		 * 3. Printing linedList after adding nodes
		 */

		list.printLinkedList(head);
		System.out.println();
		/*
		 * 4. Adding nodes to start of the linkedList
		 */
	
		list.addAtStart(70);
		list.addAtStart(30);
		list.addAtStart(56);

		/*
		 * 5. display linedList after adding nodes
		 */

		list.display();
		System.out.println();
		

	}

}
