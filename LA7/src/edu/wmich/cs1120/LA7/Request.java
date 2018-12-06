package edu.wmich.cs1120.LA7;

public class Request implements Comparable<Request>{
	String studentName;
	String studentDepartment;
	String studentLevel;
	String courseDepartment;
	int courseNumber;
	double[][] GPA_Array;
	
	
	public Request(String studentNameIn, String studentLevelIn, String studentDepIn, String courseDeptIn, int courseNumIn, double[][] GPA_ArrayIn) {
		studentName = studentNameIn;
		studentDepartment = studentDepIn;
		studentLevel = studentLevelIn;
		courseDepartment = courseDeptIn;
		courseNumber = courseNumIn;
		GPA_Array = GPA_ArrayIn;
	}
	
	public int yearsFromGarduation() {
		if(studentLevel.compareTo("Senior") == 0) {
			return 0;
		}
		if(studentLevel.compareTo("Junior") == 0) {
			return 1;
		}
		if(studentLevel.compareTo("Sophmore") == 0 ){
			return 2;
		}
		if(studentLevel.compareTo("Freshman") == 0) {
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
		double gpaTemp = 0;
		int totCredit = 0;
		for(int i = 0; i < 4; i++) {
			
				gpaTemp += (GPA_Array[i][0] * GPA_Array[i][1]);
				totCredit += GPA_Array[i][1];
			
		}
		gpaTemp = gpaTemp / (4 + totCredit);
		
		return gpaTemp;
	}

	@Override
	public int compareTo(Request comp) {
		
		if(comp.yearsFromGarduation() > yearsFromGarduation()) {
			return -1;
		} else if (comp.yearsFromGarduation() < yearsFromGarduation()){ 
			return 1;
		}
		
		if(comp.GPA_Cal() < GPA_Cal()) {
			return -1;
		} else if(comp.GPA_Cal() == GPA_Cal()) {
			return 0;
		}
		return 1;
	}
}
