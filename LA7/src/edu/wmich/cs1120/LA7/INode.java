package edu.wmich.cs1120.LA7;

public interface INode<E> {

	
	/**
	 * returns the data stored in the node
	 * @return
	 */
	E getData();

	
	/**
	 * returns the next node
	 * @return
	 */
	Node<E> getNext();

	
	/**
	 * Sets node received as the next node to this node.
	 * @param next
	 */
	void setNext(Node<E> next);

}
