package edu.wmich.cs1120.LA7;

public class Course  implements ICourse{

	String courseDept = "";
	int courseNumber = 0;
	int capacity = 0;
	String[] classRoster;
	int numStudents = 0;

	
	public void course(String course, int coursenum, int cap) {
		courseDept = course;
		courseNumber = coursenum;
		capacity = cap;
		classRoster = new String[cap];
	}
	
	public void addStudent(String student) {
		if(!checkFull()) {
			classRoster[numStudents] = student;
			numStudents++;
			System.out.println(student + " successfully registered " + courseDept + courseNumber);
		} else {
			System.out.println(student + " cannot register for " + courseDept + courseNumber);
		}
	}
	
	public boolean checkFull() {
		if(numStudents == capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printClassList() {
		System.out.println("The class list:");
		for(int i = 0; i < capacity; i++) {
			System.out.print(classRoster[i] + " ");
		}
	}
	
	public boolean checkClass(Course sample, Course current) {
		if(sample.courseDept == current.courseDept) {
			if(sample.courseNumber == current.courseNumber) {
				if(sample.capacity == current.capacity) {
					return true;
				}
			}
		}
		return false;
	}
	
}
