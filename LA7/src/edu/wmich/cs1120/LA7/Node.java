package edu.wmich.cs1120.LA7;

public class Node<T> implements INode<T>{

	T data;
	Node<T> next = null;
	
	Node(T dataValue) {
		data = dataValue;
	}				
	
	Node(T dataValue, Node<T> nextNode) {
		data = dataValue; 
		next = nextNode;
	} 	
	
	@Override
	public T getData() {
		return data;
	}

	@Override
	public Node<T> getNext() {
		return next;
	}

	@Override
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
