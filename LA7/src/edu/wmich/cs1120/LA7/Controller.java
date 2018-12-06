package edu.wmich.cs1120.LA7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller implements IController {
	public void readCourseFile() throws FileNotFoundException {
		File file = new File("course.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			input.split(",");
			Course course = new Course();
			course(input[0],input[1],input[2]);
			
		}
	}
}
