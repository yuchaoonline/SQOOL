package Controller;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import DataAccessLayer.DAL;

public class Controller {

	DAL dal;
	
	public Controller() throws SQLException {
		dal = new DAL();
	}
	
	public void registerStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) throws SQLException {	// Registers a specific student!
		dal.registerStudent(firstName, lastName, socNmbr, adress, city, zipCode);
	}
	
	public DefaultTableModel getStudent(String socNmbr, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student!
		return dal.getStudent(socNmbr, StudentModel);
	}
	
	public Integer getCourseCredtis(String courseCode, DefaultTableModel StudentModel) throws SQLException {
		return dal.getCourseCredits(courseCode, StudentModel);
	}
	
	public String getStudentResult(String socNmbr, String courseCode, DefaultTableModel StudentModel) throws SQLException { // Shows a specific students result on a specific course!
		return dal.getStudentResult(socNmbr, courseCode, StudentModel);
	}
	
	public void updateStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) throws SQLException { // Updates a specific student!
		dal.updateStudent(firstName, lastName, socNmbr, adress, city, zipCode);
	}
	
	public void removeStudent(String socNmbr) throws SQLException { // Removes a specific student!
		dal.removeStudent(socNmbr);
	}
	
	public void registerCourse(String courseName, String courseCode, int credits) throws SQLException {	// Registers a specific course!
		dal.registerCourse(courseName, courseCode, credits);
	}
	
	public DefaultTableModel getCourse(String courseCode, DefaultTableModel CourseModel) throws SQLException { // Finds a specific course!
		return dal.getCourse(courseCode, CourseModel);
	}
	
	public DefaultTableModel getStudied(String courseCode, DefaultTableModel CourseModel) throws SQLException { // Finds students who took the course and their grade!
		return dal.getStudied(courseCode, CourseModel);
	}
	
	public void updateCourse(String courseName, String courseCode, int credits) throws SQLException { // Updates a specific course!
		dal.updateCourse(courseName, courseCode, credits);
	}
	
	public void removeCourse(String courseCode) throws SQLException { // Removes a specific course!
		dal.removeCourse(courseCode);
	}
	
	public Integer getHighGradePercentage(String courseCode, DefaultTableModel CourseModel) throws SQLException { // Gets the percentage for students who got A on a specific course!
		return dal.getHighGradePercentage(courseCode, CourseModel);
	}
	
	public Integer getCourseThroughput(String courseCode, DefaultTableModel CourseModel) throws SQLException { // Ranks all courses by highest throughput (students who has taken a course with at least grade 'E'!
		return dal.getCourseThroughput(courseCode, CourseModel);
	}
	
	public DefaultTableModel getAllStudents(DefaultTableModel StudentModel) throws SQLException {
		return dal.getAllStudents(StudentModel);
	}
	
	public DefaultTableModel getAllCourses(DefaultTableModel CourseModel) throws SQLException { // Finds all courses!
		return dal.getAllCourses(CourseModel);
	}
	
	public void addStudentToCourse(String socNmbr, String courseCode) throws SQLException { // Adds a student to a course!
		dal.addStudentToCourse(socNmbr, courseCode);
	}
	
	public void removeStudentFromCourse(String socNmbr, String courseCode, String grade) throws SQLException { // Removes a student from a course!
		dal.removeStudentFromCourse(socNmbr, courseCode, grade);
	}

	public DefaultTableModel getFailedStudents(String courseCode, DefaultTableModel StudentTable) throws SQLException {
		return dal.getFailedStudents(courseCode, StudentTable);
	}	
}
