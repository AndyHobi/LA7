package edu.wmich.cs1120.LA7;

import java.io.FileNotFoundException;

public interface IController {
	public void readCourseFile() throws FileNotFoundException ;
	public void readRequestFile() throws FileNotFoundException ;
	public void processRequests();
	public void printClassList();
}
