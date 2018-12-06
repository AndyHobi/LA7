package edu.wmich.cs1120.LA7;

public class Request{
	String studentName;
	String studentDepartment;
	String studentLevel;
	String courseDepartment;
	int courseNumber;
	double[][] GPA_Array;
	
	
	public void request(String studentNameIn, String studentDepIn, String studentLevelIn, String courseDeptIn, int courseNumIn, double[][] GPA_ArrayIn) {
		studentName = studentNameIn;
		studentDepartment = studentDepIn;
		studentLevel = studentLevelIn;
		courseDepartment = courseDeptIn;
		courseNumber = courseNumIn;
		GPA_Array = GPA_ArrayIn;
	}
	
	public int yearsFromGarduation(String level) {
		if(level == "Senior" ) {
			return 0;
		}
		if(level == "Junior") {
			return 1;
		}
		if(level == "Sophomore") {
			return 2;
		}
		if(level == "Freshman") {
			return 3;
		}
		else {
			return 4;
		}
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getStudentDepart() {
		return studentDepartment;
	}
	
	public double GPA_Cal() {
		double gpaTemp;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				gpaTemp = gpaTemp + (GPA_Array[i][i] * GPA Array[]
			}
		}
	}
	
	
	public int compareTo(int other) {
		return 999;
	}
}
