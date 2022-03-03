package linkedlist;

public class LinkedList {

	/**
	 * addNode - this method is created to add data to linedList
	 * printLinkedList-thid method display the values of linked list
	 * deleteNodeFromStart - delete nodes from the start
	 * deleteNodeFromEnd-delete nodes from the end
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 *
	 */
	public Node addNode(Node head, int data) {
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

	public void printLinkedList(Node head){
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
		}
	}
}