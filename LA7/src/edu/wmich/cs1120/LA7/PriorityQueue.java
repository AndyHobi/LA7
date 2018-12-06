package edu.wmich.cs1120.LA7;

public class PriorityQueue<T extends Comparable<T>> extends LinkedList<T>{
	
	public boolean isEmpty() {
		if (length == 0) {
			return true;
		} else { return false;}
	}
	
	public void enqueue(T data) {
		
		Node<T> currNode = head;
		for (int i = 0; i < length; i++) {
			currNode = currNode.next;
			if(currNode.)
		}
	}

}
