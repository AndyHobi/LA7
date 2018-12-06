package edu.wmich.cs1120.LA7;

import java.io.FileNotFoundException;

public interface IController {
	/**
	 * reads the file defined as the course file in the constructor and stores the courses in a list
	 * @throws FileNotFoundException
	 */
	public void readCourseFile() throws FileNotFoundException ;
	/**
	 * reads the file defined as the request file in the constructor and stores the courses in a queue
	 * @throws FileNotFoundException
	 */
	public void readRequestFile() throws FileNotFoundException ;
	/**
	 * processes all requests stored in the queue 
	 */
	public void processRequests();
	/**
	 * prints the class roster for every class in the class list
	 */
	public void printClassList();
}
