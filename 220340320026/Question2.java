import java.util.Scanner;

class ReverseLL{
	public class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value = value;
		}
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	public Node getHead(){
		return head;
	}
	
	public void addLast(int value){
		Node node = new Node(value);
		if (head == null){
			head = tail = node;
			count++;
			return;
		}
		tail.next = node;
		tail = node;
		count++;
	}
	
	public void addFirst(int value){
		Node node = new Node(value);
		if (head == null){
			head = tail = node;
			count++;
			return;
		}
		node.next = head;
		head = node;
		count++;
	}
	
	public Node reverse(Node node){
		if (node == null){
			return null;
		}
		Node previous = node;
		Node current = node.next;
		while (current != null){
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		tail = node;
		tail.next = null;
		head = previous;
		return node;
	}
	
	/*
	public void reverse(){
		if (head == null){
			return;
		}
		Node previous = head;
		Node current = head.next;
		while (current != null){
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		tail = head;
		tail.next = null;
		head = previous;
	}
	*/
	
	public void print(){
		Node current = head;
		while (current != null){
			System.out.print(current.value+" ");
			current = current.next;
		}
		System.out.println();
	}
	
}

public class Question2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		ReverseLL ll = new ReverseLL();
		System.out.println("Enter number of test case: ");
		int testCase = sc.nextInt();
		System.out.println("Enter number of elements in linked list: ");
		int numberOfElements = sc.nextInt();
		System.out.println("Enter values");
		for (int i = 0; i < numberOfElements; i++){
			int value = sc.nextInt();
			ll.addLast(value);
		}
		ReverseLL.Node head = ll.getHead();
		ll.reverse(head);
		System.out.println("Display reversed linked list: ");
		ll.print();
	}
}




/*

		ReverseLL ll = new ReverseLL();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		System.out.println("Input LL: ");
		ll.print();
		
		System.out.println("Output LL: ");
		ReverseLL.Node head = ll.getHead();
		// System.out.println(head);
		ll.reverse(head);
		ll.print();
		
		
*/