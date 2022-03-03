package linkedlist;

import java.util.Scanner;

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
		 * 6.Adding element at midle of linked list
		 * 7.delete node from the start of linked list
		 * 8.delete node from the end of linked list
		 */

		/*
		 * 1. Creating Lined list
		 */
		LinkedList list = new LinkedList();


		int n;
		do {
			System.out.println("Please Enter 1 to add at end position");
			System.out.println("Please Enter 2 to add At start position of linked list");
			System.out.println("Please Enter 3 to add At middle position of linked list");
			System.out.println("Please Enter 4 to delete At starting position of linked list");
			System.out.println("Please Enter 5 to delete At Last element of linked list");

			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			switch(n){

			case 1:
				/*
				 * 2. Adding nodes to linkedList
				 */
				Node head = list.appendNode(null,56);
				list.appendNode(head, 30);
				list.appendNode(head, 70);


				/*
				 * 3. Printing linedList after adding nodes
				 */

				list.printLinkedList(head);
				System.out.println();
				break;
			case 2:
				/*
				 * 4. Adding nodes to start of the linkedList
				 */
				System.out.println("Adding node at start of linked list");

				list.addAtStart(70);
				list.addAtStart(30);
				list.addAtStart(56);

				/*
				 * 5. display linedList after adding nodes
				 */

				list.display();
				System.out.println();
				break;
			case 3:
				/*
				 * 6.Adding element at middle of linked list
				 * */
				LinkedList sList=new LinkedList();
				head = list.appendNode(null,56);
				//sList.appendNode(head,70);  
				sList.addNode(56);  
				sList.addNode(70);  

				System.out.println("Original list: ");  
				sList.display();  

				sList.addInMid(30);  
				System.out.println( "Updated List: ");  
				sList.display();  
				 
				break;
			case 4:
				/*
				* 7. Deleting node from start of the linkedlist
				*/
				head = list.appendNode(null,56);
				list.appendNode(head, 30);
				list.appendNode(head, 70);
				list.printLinkedList(head);
				System.out.println();
				head = list.deleteNodeFromStart(head);

				/*
				* Printing linedList after deleting node from start of the linkedlist
				*/
				
				list.printLinkedList(head);
				System.out.println();
				/*
				* Printing linedList after deleting node from start of the linkedlist
				*/
				System.out.println();
				break;
			case 5:
				/*
				* 8. Deleting node from end of the linkedlist
				*/
				head = list.appendNode(null,56);
				list.appendNode(head, 30);
				list.appendNode(head, 70);
				list.printLinkedList(head);
				System.out.println();
				list.deleteNodeFromEnd(head);

				/*
				*  Printing linedList after deleting node from end of the linkedlist
				*/
				list.printLinkedList(head);
			}

		}while(n!=0);
	}

}
