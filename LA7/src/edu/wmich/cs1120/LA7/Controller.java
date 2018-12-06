package edu.wmich.cs1120.LA7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The controller controls the process of reading the course and request files.
 * It can also print the class list for all classes and processes the queue.
 * 
 * @author Andy & Lucas
 *
 */
public class Controller implements IController {
	LinkedList<Course> courseList = new LinkedList();
	PriorityQueue<Request> queue;

	BufferedReader courseFile;
	BufferedReader requestFile;

	/**
	 * Standard constructor
	 * @param requestQueue
	 * @param courses
	 * @param fileIn
	 * @param fileIn1
	 */
	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses, BufferedReader fileIn,
			BufferedReader fileIn1) {

		queue = requestQueue;
		courseList = courses;

		courseFile = fileIn;
		requestFile = fileIn1;

	}

	public void readCourseFile() throws FileNotFoundException {
		File file = new File("course.txt");
		Scanner scan = new Scanner(file);
		String[] inputArr = new String[3];
		while (scan.hasNextLine()) {
			String input = scan.nextLine();
			inputArr = input.split(",");
			Course course = new Course();
			course.course(inputArr[0], Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
			courseList.addNode(course);
		}
		scan.close();
	}

	public void readRequestFile() throws FileNotFoundException {
		File file = new File("request.txt");
		Scanner scan = new Scanner(file);
		String[] inputArr = new String[13];
		while (scan.hasNextLine()) {
			String input = scan.nextLine();
			inputArr = input.split(",");

			double[][] grades = new double[4][2];
			for (int i = 5; i < inputArr.length; i += 2) {
				grades[(i - 5) / 2][0] = Double.parseDouble(inputArr[i]);
				grades[(i - 5) / 2][1] = Integer.parseInt(inputArr[i + 1]);
			}

			queue.enqueue(new Request(inputArr[0], inputArr[1], inputArr[2], inputArr[3], Integer.parseInt(inputArr[4]),
					grades));

		}
		scan.close();
	}

	public void printClassList() {
		for (int i = 0; i < courseList.length; i++) {
			courseList.getData(i).printClassList();
		}
	}

	public void processRequests() {

		queue.Qprint();

		System.out.println();

		for (int i = 0; i < courseList.length; i++) {
			int initLength = queue.length;
			int requestNum = 0;
			Course currCourse = courseList.getData(i);
			Request currReq;
			while (!queue.isEmpty() && requestNum <= initLength + queue.length) {

				currReq = queue.dequeue();

				if ((currReq.courseNumber == currCourse.courseNumber
						&& (currReq.courseDepartment.compareTo(currCourse.courseDept)) == 0)) {

					if (currReq.studentDepartment.compareTo(currCourse.courseDept) == 0 || requestNum >= initLength) {

						currCourse.addStudent(currReq.studentName);

					} else {
						queue.enqueueIgnorePriority(currReq);
					}
				} else {
					queue.enqueueIgnorePriority(currReq);
				}
				requestNum++;
			}
		}

		System.out.println();
		queue.Qprint();
		System.out.println("\n");

	}
}