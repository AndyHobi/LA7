package edu.wmich.cs1120.LA7;

public class course  implements ICourse{
	String courseDept = "";
	int courseNumber = 0;
	int capacity = 0;
	String[] classRoster = new String[capacity];
	
	public void course(String course, int coursenum, int cap) {
		courseDept = course;
		courseNumber = coursenum;
		capacity = cap;
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
	
	public boolean checkClass() {
		return true;
	}
	
}
