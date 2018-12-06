package edu.wmich.cs1120.LA7;

public class Course  implements ICourse{
	public String courseDept = "";
	public int courseNumber = 0;
	public int capacity = 0;
	public String[] classRoster;
	
	public void course(String course, int coursenum, int cap) {
		courseDept = course;
		courseNumber = coursenum;
		capacity = cap;
		classRoster = new String[cap];
	}
	
	public void addStudent(String student) {
		for(int i = 0; i < capacity; i++) {
			if(classRoster[i] == null) {
				classRoster[i] = student;
			}
		}
	}
	
	public boolean checkFull() {
		if(classRoster.length >= capacity) {
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
