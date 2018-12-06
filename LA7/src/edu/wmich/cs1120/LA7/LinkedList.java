package edu.wmich.cs1120.LA7;

public class LinkedList<T> {
	
	Node<T> head;
	Node<T> tail;
	int length;
	
	LinkedList(T... data) {
		
		head = new Node<T>(data[0]);
		head = tail;
		
		Node<T> currNode = head;
		for(int i = 1; i < data.length; i++) {
			currNode.next = new Node<T>(data[i]);
			currNode = currNode.next;
			tail = currNode;
		}
		
	}
	
	public void addNode(T data) {
		tail.next = new Node<T>(data);
		tail = tail.next;
	}
	
	public void addNode(T data, int index) {
		tail.next = new Node<T>(data);
		tail = tail.next;
	}
	
	public T getData(int index) {
		return getNode(index).data;
	}
	
	private Node<T> getNode(int index) {
		
		Node<T> currNode = head;
		for(int i = 0; i < index; i++) {
		currNode = currNode.next;
		}
		
		return currNode;
	}
	
	

}
