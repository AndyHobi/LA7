package edu.wmich.cs1120.LA7;

public class PriorityQueue<T extends Comparable<T>> extends LinkedList<T> {

	public boolean isEmpty() {
		if (length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(T data) {

		Node<T> currNode = head;
		for (int i = 0; i < length; i++) {

			int comparison = currNode.data.compareTo(data);
			if (comparison > 0) {
				addNode(data, i - 1);
				return;
			} else if (comparison == 0) {
				addNode(data, i);
				return;
			}
			currNode = currNode.next;
		}
		addNode(data);
	}
	
	public void enqueueIgnorePriority(T data) {
		addNode(data);
	}

	public T dequeue() {
		T tempData = head.data;
		removeNode(0);
		return tempData;
	}

	public void Qprint() {
		System.out.println("<<<<<<<<<<<< Beginning of Queue Contents >>>>>>>>>>>>>>>>>");

		Node<T> currNode = head;
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.println("Request@" + currNode);
				currNode = currNode.next;
			}
		} else {
			System.out.println("The Queue is empty");
		}
		System.out.println("<<<<<<<<<<<< End of Queue Contents >>>>>>>>>>>>>>>>>");
	}

}
