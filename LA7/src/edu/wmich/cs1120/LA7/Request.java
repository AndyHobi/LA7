package edu.wmich.cs1120.LA7;

/**
 * @author Lucas
 *
 */
public class Request implements Comparable<Request>{
	String studentName;
	String studentDepartment;
	String studentLevel;
	String courseDepartment;
	int courseNumber;
	double[][] GPA_Array;
	
	
	/**
	 * Standard constructor
	 * @param studentNameIn
	 * @param studentLevelIn
	 * @param studentDepIn
	 * @param courseDeptIn
	 * @param courseNumIn
	 * @param GPA_ArrayIn
	 */
	public Request(String studentNameIn, String studentLevelIn, String studentDepIn, String courseDeptIn, int courseNumIn, double[][] GPA_ArrayIn) {
		studentName = studentNameIn;
		studentDepartment = studentDepIn;
		studentLevel = studentLevelIn;
		courseDepartment = courseDeptIn;
		courseNumber = courseNumIn;
		GPA_Array = GPA_ArrayIn;
	}
	
	/**
	 * calculates and returns the years until the student graduates; returns 4 years if no match can be found
	 * @return
	 */
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
	
	/**
	 * returns the name of the student
	 * @return
	 */
	public String getStudentName() {
		return studentName;
	}
	
	/**
	 * returns the department of the student
	 * @return
	 */
	public String getStudentDepart() {
		return studentDepartment;
	}
	
	/**
	 * Calculates and returns the GPA of the student
	 * @return
	 */
	public double GPA_Cal() {
		double gpaTemp = 0;
		int totCredit = 0;
		for(int i = 0; i < 4; i++) {
			
				gpaTemp += (GPA_Array[i][0] * GPA_Array[i][1]);
				totCredit += GPA_Array[i][1];
			
		}
		gpaTemp = gpaTemp / (totCredit);
		
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
