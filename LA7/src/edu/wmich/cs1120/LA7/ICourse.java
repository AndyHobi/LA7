package edu.wmich.cs1120.LA7;

public interface ICourse {
	
	/**
	 * checks if the course is full. 
	 * @return true if course if full. false otherwise
	 */
	public boolean checkFull();
	
	/**
	 * adds The student to this coure
	 * @param student 
	 */
	public void addStudent(String student);
	
	/**
	 * prints the list of all students in the class
	 */
	public void printClassList();
	
	/**
	 * compares course sample to course current and sees if they are identical. if not, returns false
	 * @param sample
	 * @param current
	 * @return true if courses are identical, false otherwise
	 */
	public boolean checkClass(Course sample, Course current);
	
}
