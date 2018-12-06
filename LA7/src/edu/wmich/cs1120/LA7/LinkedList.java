package edu.wmich.cs1120.LA7;

public class LinkedList<T> {

	Node<T> head;
	Node<T> tail;
	int length = 0;

	LinkedList(T... data) {

		head = new Node<T>(data[0]);
		tail = head;

		Node<T> currNode = head;
		for (int i = 1; i < data.length; i++) {
			currNode.next = new Node<T>(data[i]);
			currNode = currNode.next;
			tail = currNode;
		}

	}

	LinkedList() {

		head = null;
		tail = null;
		length = 0;

	}

	public void addNode(T data) {
		
		if (length != 0) {
		tail.next = new Node<T>(data);
		tail = tail.next;
		} else {
			head = new Node<T>(data);
			tail = head;
		}
		length++;
	}

	public void addNode(T data, int index) {
		if (index < length-1 && index >= 0) {
			
			Node<T> currNode = getNode(index);
			currNode.next = new Node<T>(data,currNode.next);
			length++;
		} else if(index == -1) {
			head = new Node<T>(data,head);
			length++;
		} else if (index == length-1) {
			addNode(data);
		} else {
			throw new IndexOutOfBoundsException("Index [" + index + "] is not in list");
		}
	}

	public void removeNode(int index) {
		
		length--;
		
		if (index < length-1 && index > 0) {
			
			Node<T> currNode = getNode(index - 1);
			currNode.next = currNode.next.next;
			
		} else if (index == 0) {
			head = head.next;
		} else if (index == length-1) {
			getNode(length-2).next = null;
		} else {
			length++;
			throw new IndexOutOfBoundsException("Node at Index [" + index + "] is not in list");
		}
	}

	public T getData(int index) {
		return getNode(index).data;
	}

	private Node<T> getNode(int index) throws IndexOutOfBoundsException {

		if (index < length && index >= 0) {
			Node<T> currNode = head;
			for (int i = 0; i < index; i++) {
				currNode = currNode.next;
			}
			return currNode;
		} else if (index == length) {
			return tail;
		} else {
			throw new IndexOutOfBoundsException("Index [" + index + "] is not in list");
		}

	}

}
