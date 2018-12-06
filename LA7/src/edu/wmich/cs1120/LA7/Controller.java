package edu.wmich.cs1120.LA7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller implements IController {
	public void readCourseFile() throws FileNotFoundException {
		File file = new File("course.txt");
		Scanner scan = new Scanner(file);
		String[] inputArr = new String[3];
		LinkedList linkList = new LinkedList();
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			inputArr = input.split(",");
			Course course = new Course();
			course.course(inputArr[0],Integer.parseInt(inputArr[1]),Integer.parseInt(inputArr[2]));
			linkList.addNode(course);
		}
	}
}
