package edu.wmich.cs1120.LA7;

/**
 * extension of linked list that allows for a queue implementation with priority enqueue
 * @author Andy
 *
 * @param <T> data type to be stored
 */
public class PriorityQueue<T extends Comparable<T>> extends LinkedList<T> {

	/**
	 * returns true if the que is empty. false otherwise
	 * @return
	 */
	public boolean isEmpty() {
		if (length == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * adds data to the queue and uses compareTo to find the appropriate spot in the queue
	 * @param data
	 */
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
	
	/**
	 * adds data to the queue but ignores the priority of the data
	 * @param data
	 */
	public void enqueueIgnorePriority(T data) {
		addNode(data);
	}

	/**
	 * returns the first value in the queue and then deletes it from queue
	 * @return
	 */
	public T dequeue() {
		T tempData = head.data;
		removeNode(0);
		return tempData;
	}

	/**
	 * this prints the contents of the queue
	 */
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
