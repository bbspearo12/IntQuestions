package main.java;

import java.util.Random;

public class MyLinkedList {
		
	public static void main (String args[]) {
		MyLinkedList nll = new MyLinkedList();
		Node head = nll.generateLL(5);
		nll.printLL(head);
		Node newHead = nll.cinsertNode(head, 12, 0);
		nll.printLL(newHead);
	}

	public Node insertNth(Node head, int data, int position) {
		Node n = new Node();
		n.data = data;
		
		if (head == null) {
			n.next = null;
			return n;
		}
		if (position == 0) {
			n.next = head;
			return n;
		}
		Node temp = head;
		
		while (--position != 0 && head.next != null) {
			head = head.next;
		}
		n.next=head.next;
		head.next = n;
		return temp;
	}
	
	public Node cinsertNode(Node head, int data, int position) {
		
		Node n = new Node();
		n.data = data;
		Node pnode = head;
		Node onode = head;
		int count = 0;
		  if (position == 0) {
				n.next = head;
				return n;
	  }
		while(head != null && count != position) {
			count++;
			pnode = head;
			head = head.next;
		}
		  if(count == position) {
			  n.next = pnode.next;
			  pnode.next = n;
		  }
		 
		  
		  return onode;
		
	}
	
	public Node generateLL(int size) {
		Random ran = new Random();
		if (size == 0) {
			return null;
		}
		Node head = new Node();
		head.data = ran.nextInt(10);
		head.next = null;
		Node temp = head;
		while (--size != 0) {
			Node n = new Node();
			n.data = ran.nextInt(10);
			n.next = null;
			temp.next = n;
			temp = n;
		}
		return head;
	}
	
	public void printLL(Node head) {
		while (head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print("null\n");
	}
}



