package edu.wmich.cs1120.LA7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller implements IController {
	LinkedList<Course> courseList = new LinkedList();
	
	public void readCourseFile() throws FileNotFoundException {
		File file = new File("course.txt");
		Scanner scan = new Scanner(file);
		String[] inputArr = new String[3];
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			inputArr = input.split(",");
			Course course = new Course();
			course.course(inputArr[0],Integer.parseInt(inputArr[1]),Integer.parseInt(inputArr[2]));
			courseList.addNode(course);
		}
		scan.close();
	}
	
	public void readRequestFile() throws FileNotFoundException {
		File file = new File("course.txt");
		Scanner scan = new Scanner(file);
		String[] inputArr = new String[13];
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			inputArr = input.split(",");
			//insert que code here
			
		}
		scan.close();
	}
	
	public void printClassList() {
		for(int i = 0; i < courseList.length; i++) {
			courseList.getData(i).printClassList();
		}
	}
	
	public void processRequests() {
		
	}
}