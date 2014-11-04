package Controller;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import DataAccessLayer.DAL;

public class Controller {

	public DAL dal;
	
	public Controller() throws SQLException {
		dal = new DAL();
	}
	
	public void registerStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) throws SQLException {	// Registers a specific student!
		dal.registerStudent(firstName, lastName, socNmbr, adress, city, zipCode);
	}
	
	public void registerStudentEmail(String eMail, String socNmbr) throws SQLException {
		dal.registerStudentEmail(eMail, socNmbr);
	}
	
	public void registerStudentPhone(String telNmbr, String socNmbr) throws SQLException {
		dal.registerStudentPhone(telNmbr, socNmbr);
	}
	public DefaultTableModel getAllStudentsWEmail(DefaultTableModel StudentModel) throws SQLException {
		return dal.getAllStudentsWEmail(StudentModel);
	}
	public DefaultTableModel getStudentByFirstName(String searchFirstName, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student by first name!
		return dal.getStudentByFirstName(searchFirstName, StudentModel);
	}
	
	public DefaultTableModel getStudentByLastName(String searchLastName, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student by first name!
		return dal.getStudentByLastName(searchLastName, StudentModel);
	}
	
	public DefaultTableModel getStudentWEmail(String searchSocNmbr, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student!
		return dal.getStudentWEmail(searchSocNmbr, StudentModel);
	}
	
	public DefaultTableModel getCourseByName(String courseDef, DefaultTableModel CourseModel) throws SQLException { // Finds a specific course!
		return dal.getCourseByName(courseDef, CourseModel);
	}
	
	public DefaultTableModel getStudent(String socNmbr, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student!
		return dal.getStudent(socNmbr, StudentModel);
	}
	
	public Integer getCourseCredtis(String courseCode) throws SQLException {
		return dal.getCourseCredits(courseCode);
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
	
	public DefaultTableModel getCourse(String courseCode, DefaultTableModel StudentModel) throws SQLException { // Finds a specific course!
		return dal.getCourse(courseCode, StudentModel);
	}
	
	public DefaultTableModel getStudentHistory(String socNmbr, DefaultTableModel CourseModel) throws SQLException { // Finds students who took the course and their grade!
		return dal.getStudentHistory(socNmbr, CourseModel);
	}
	
	public DefaultTableModel getCourseHistory(String courseCode, DefaultTableModel StudentModel) throws SQLException { // Finds students who took the course and their grade!
		return dal.getCourseHistory(courseCode, StudentModel);
	}
	
	public void updateCourse(String courseName, String courseCode, int credits) throws SQLException { // Updates a specific course!
		dal.updateCourse(courseName, courseCode, credits);
	}
	
	public void removeCourse(String courseCode) throws SQLException { // Removes a specific course!
		dal.removeCourse(courseCode);
	}
	
	public Integer getHighGradePercentage(String courseCode) throws SQLException { // Gets the percentage for students who got A on a specific course!
		return dal.getHighGradePercentage(courseCode);
	}
	
	public Integer getCourseThroughput(String courseCode) throws SQLException { // Ranks all courses by highest throughput (students who has taken a course with at least grade 'E'!
		return dal.getCourseThroughput(courseCode);
	}
	
	public DefaultTableModel getAllStudents(DefaultTableModel StudentModel) throws SQLException {
		return dal.getAllStudents(StudentModel);
	}
	
	public DefaultTableModel getAllCourses(DefaultTableModel CourseModel) throws SQLException { // Finds all courses!
		return dal.getAllCourses(CourseModel);
	}
	
	public void registerStudentOnCourse(String socNmbr, String courseCode) throws SQLException { // Adds a student to a course!
		
		if ((dal.getTotalStudentCredits(socNmbr) + dal.getCourseCredits(courseCode)) <= 45) {
			dal.registerStudentOnCourse(socNmbr, courseCode);
			System.out.println("Student registered!");
		}
		else {
			System.out.println("Total student credits is too high!");
		}
	}
	
	public void removeStudentFromCourse(String socNmbr, String courseCode, String grade) throws SQLException { // Removes a student from a course!
		dal.removeStudentFromCourse(socNmbr, courseCode, grade);
	}

	public DefaultTableModel getActiveStudents(String courseCode, DefaultTableModel StudentModel) throws SQLException {
		return dal.getActiveStudents(courseCode, StudentModel);
	}	
	
	public DefaultTableModel getActiveCourses(String socNmbr, DefaultTableModel CourseModel) throws SQLException {
		return dal.getActiveCourses(socNmbr, CourseModel);
	}
}
