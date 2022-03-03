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
		 */

		/*
		 * 1. Creating Lined list
		 */
		LinkedList list = new LinkedList();

		/*
		 * 2. Adding nodes to linkedList
		 */
		Node head = list.addNode(null,56);
		list.addNode(head, 30);
		list.addNode(head, 70);
		/*
		 * 3. Printing linedList after adding nodes
		 */
		list.printLinkedList(head);
		System.out.println();



	}

}


