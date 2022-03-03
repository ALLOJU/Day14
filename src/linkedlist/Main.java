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
		 * 9. Search node from  the linkedlist
		 * 10. Search node from the list and insert after that search  element
		 * 11. Search node from the list and delete that search  element
		 * 12. Sorting linked list
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
			System.out.println("Please Enter 6 to Search element of linked list");
			System.out.println("Please Enter 7 to Search element and insert after search of linked list");
			System.out.println("Please Enter 8 to Search element and delete after search of linked list");
			System.out.println("Please Enter 9 to get Sorted linked list");

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
				break;
			case 6:
				/*
				 * 9. Search node from  the linkedlist
				 */
				LinkedList searchList=new LinkedList();

				//sList.appendNode(head,70);  
				searchList.addNode(56);
				searchList.addNode(30);  
				searchList.addNode(70);  

				System.out.println("Original list : ");  
				searchList.display();  
				searchList.searchNode(30); 
				break;
			case 7:
				/*
				 * 10. Search node from the list and insert after that search  element
				 */
				LinkedList s=new LinkedList();

				//sList.appendNode(head,70);  
				s.addNode(56);
				s.addNode(30);  
				s.addNode(70);  

				System.out.println("Original list : ");  
				s.display();  
				s.insertAtsearchNode(30);
				s.display();
				break;
			case 8:
				/*
				 * 11. Search node from the list and delete that search  element
				 */
				LinkedList sl=new LinkedList();

				//sList.appendNode(head,70);  
				sl.addNode(56);
				sl.addNode(30);
				sl.addNode(40);
				sl.addNode(70);  

				System.out.println("Original list : ");  
				sl.display();  
				sl.deleteAtsearchNode(40);
				sl.display();
				break;
			
			case 9:
				/*
				 * 12. Sorting linked list
				 */
				LinkedList sort=new LinkedList();

				//sList.appendNode(head,70);  
				sort.addNode(56);
				sort.addNode(30);
				sort.addNode(40);
				sort.addNode(70);  

				System.out.println("Original list : ");  
				sort.display();  
				System.out.println("Linked list after sorting");
				sort.sortList();
				sort.display();

			}

		}while(n!=0);
	}

}
