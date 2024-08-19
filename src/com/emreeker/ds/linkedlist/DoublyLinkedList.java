package com.emreeker.ds.linkedlist;

public class DoublyLinkedList<T> {
	DoubleNode<T> first;
	DoubleNode<T> last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	void insertFirst(DoubleNode<T> newNode) {
		if (last == null) {
			last = newNode;
		} else {
			first.previous = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	void insertLast(DoubleNode<T> newNode) {
		if (first == null) {
			first = newNode;
		} else {
			last.next = newNode;
		}
		newNode.previous = last;
		last = newNode;
	}

	void insertMiddle(DoubleNode<T> newNode, DoubleNode<T> previous) {

	}

	void deleteFirst() {

	}

	void deleteMiddle(DoubleNode<T> node) {
		
	}

	void deleteLast() {

	}
}
