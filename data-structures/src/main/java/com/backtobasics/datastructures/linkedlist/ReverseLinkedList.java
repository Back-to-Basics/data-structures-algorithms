package com.backtobasics.datastructures.linkedlist;

public class ReverseLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static Node reverseList(Node head) {
		if (head != null) {
			return reverse(head, null);
		}
		return head;
	}

	private static Node reverse(Node currNode, Node prevNode) {
		if (currNode.next == null) {
			head = currNode;
			currNode.next = prevNode;
			return null;
		}
		Node nextNode = currNode.next;
		currNode.next = prevNode;
		reverse(nextNode, currNode);
		return head;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(7);
		list.head.next.next.next.next.next.next.next = new Node(8);

		System.out.print("Linked List : \n ");
		list.printList(head);

		System.out.println("");
		System.out.print("Reversed Linked List : \n ");
		list.printList(reverseList(head));
	}
}
