package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;

public class DAL {
	
	public DAL() {		
	}
	
	public void registerStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) {	// Registers a specific student!

	}
	
	public ArrayList<String> getStudent(String socNmbr) { // Finds a specific student!
		return null;
	}
	
	public ArrayList<String> getStudentResult(String socNmbr, String courseCode) { // Shows a specific students result on a specific course!
		return null; 
	}
	
	public void updateStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) { // Updates a specific student!
	}
	
	public void removeStudent(String socNmbr) { // Removes a specific student!
	}
	
	
	
	
	
	public void registerCourse(String courseName, String courseCode, int credits) {	// Registers a specific course!
	}
	
	public ArrayList<String> getCourse(String courseCode) { // Finds a specific course!
		return null;
	}
	
	public ArrayList<String> getCourseResult(String courseCode) { // Finds students who took the course and their grade!
		return null;
	}
	
	public void updateCourse(String courseName, String courseCode, int credits) { // Updates a specific course!
	}
	
	public void removeCourse(String courseCode) { // Removes a specific course!
	}
	
	public ArrayList<String> getHighGradePercentage(String courseCode) { // Gets the percentage for students who got A on a specific course!
		return null;
	}
	
	public ArrayList<String> getCourseThroughput() { // Ranks all courses by highest throughput (students who has taken a course with at least grade 'E'!
		return null;
	}
	
	
	
	
	public ArrayList<String> getAllStudents() { // Finds all students!
		return null;
	}
	
	public ArrayList<String> getAllCourses() { // Finds all courses!
		return null;
	}
	
	
	
	
	public void addStudentToCourse(String socNmbr, String courseCode) { // Adds a student to a course!
	}
	
	public void removeStudentFromCourse(String socNmbr, String courseCode) { // Removes a student from a course!
	}
	
}
