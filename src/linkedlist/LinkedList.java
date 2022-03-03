package linkedlist;

public class LinkedList {

	/**
	1.created simple linked list
	 * /
		Node head=new Node(70);
		Node second=new Node(30);
		Node third=new Node(56);
		
		head.next=second;
		second.next=third;
		third.next=null;
		
		System.out.println(head.data+" "+second.data+" "+third.data);
	

}
