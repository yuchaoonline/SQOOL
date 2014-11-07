package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DAL {
	
	Connection con;

	public DAL() throws SQLException {

		driverCheck();

	}

	/* -------------------------------------------------------------------- */
	/* -------------------- METHODS FOR SQL QUERYS! ----------------------- */
	/* -------------------------------------------------------------------- */

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- REGISTER STUDENT! ------------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void registerStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) throws SQLException {	// Registers a specific student!	

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Student VALUES(?,?,?,?,?,?)");
		prepStmnt.setString(1, firstName);
		prepStmnt.setString(2, lastName);
		prepStmnt.setString(3, socNmbr);
		prepStmnt.setString(4, adress);
		prepStmnt.setString(5, city);
		prepStmnt.setString(6, zipCode);
		prepStmnt.executeUpdate();
		
		System.out.println("Student added!");
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------------------- GET STUDENT! -------------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getStudent(String searchSocNmbr, DefaultTableModel StudentTable) throws SQLException { // Finds a specific student!
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT * from Student WHERE socNmbr = ?");
		prepStmnt.setString(1, searchSocNmbr);
		ResultSet resSet = prepStmnt.executeQuery();
		
		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode};
				
				StudentTable.addRow(studentData);	
			}
		}
		
		return StudentTable;
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------------- UPDATE STUDENT! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void updateStudent(String firstName, String lastName, String socNmbr, String adress, String city, String zipCode) throws SQLException { // Updates a specific student!
	} // NOT IMPLEMENTED!

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------------- REMOVE STUDENT! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void removeStudent(String socNmbr) throws SQLException { // Removes a specific student!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("DELETE Student from Student WHERE socNmbr = ?");
		prepStmnt.setString(1, socNmbr);
		prepStmnt.executeUpdate();
		
		System.out.println("Student removed!");
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------ GET ALL STUDENTS W/ EMAIL!------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getAllStudentsWEmail(DefaultTableModel StudentModel) throws SQLException  { // Finds all students!

		con = connectionTest();
		
		PreparedStatement prepStmnt = con.prepareStatement("select s.*, t.telNmbr, e.email from student s, telephone t, email e where s.socnmbr = t.socnmbr and s.socnmbr = e.socnmbr order by s.firstName");
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int numberOfColumns = metadata.getColumnCount();

		while (resSet.next()) {              
		
			int i = 1;
			while(i <= numberOfColumns) {
				
				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				String telNmbr = resSet.getString(i++);
				String eMail = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode, telNmbr, eMail};
				
				StudentModel.addRow(studentData);
			}
		}
		return StudentModel;  		
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------- GET STUDENT EMAIL ---------------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getStudentWEmail(String searchSocNmbr, DefaultTableModel StudentTable) throws SQLException { // Finds a specific student!
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("select s.*, t.telNmbr, e.email from student s, telephone t, email e where s.socnmbr = t.socnmbr and s.socnmbr = e.socnmbr and s.socnmbr like ? order by s.socnmbr");
		prepStmnt.setString(1, searchSocNmbr +"%");
		ResultSet resSet = prepStmnt.executeQuery();
		
		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				String telNmbr = resSet.getString(i++);
				String eMail = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode, telNmbr, eMail};
				
				StudentTable.addRow(studentData);	
			}
		}
		
		return StudentTable;
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------- GET STUDENT BY FIRST NAME -------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getStudentByFirstName(String searchFirstName, DefaultTableModel StudentTable) throws SQLException { // Finds a specific student!
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("select s.*, t.telNmbr, e.email from student s, telephone t, email e where s.socnmbr = t.socnmbr and s.socnmbr = e.socnmbr and s.firstName like ? order by s.firstName");
		prepStmnt.setString(1, searchFirstName + "%");
		ResultSet resSet = prepStmnt.executeQuery();
		
		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				String telNmbr = resSet.getString(i++);
				String eMail = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode, telNmbr, eMail};
				
				StudentTable.addRow(studentData);	
			}
		}
		
		return StudentTable;
	}
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------- GET STUDENT BY LAST NAME --------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */
public DefaultTableModel getStudentByLastName(String searchLastName, DefaultTableModel StudentTable) throws SQLException { // Finds a specific student!
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("select s.*, t.telNmbr, e.email from student s, telephone t, email e where s.socnmbr = t.socnmbr and s.socnmbr = e.socnmbr and s.lastName like ?");
		prepStmnt.setString(1, "%" +searchLastName + "%");
		ResultSet resSet = prepStmnt.executeQuery();
		
		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				String telNmbr = resSet.getString(i++);
				String eMail = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode, telNmbr, eMail};
				
				StudentTable.addRow(studentData);	
			}
		}
		
		return StudentTable;
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------------ GET COURSE! -------------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getCourse(String courseCode, DefaultTableModel CourseTable) throws SQLException { // Finds a specific course!

		con = connectionTest();

		PreparedStatement prepStmnt = con.prepareStatement("SELECT * from Course WHERE courseCode = ?");
		prepStmnt.setString(1, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {
				String courseName = resSet.getString(i++);
				String courseNumber = resSet.getString(i++);
				int credits = resSet.getInt(i++);
				
				Object[] courseData = {courseName, courseNumber, credits};
				
				CourseTable.addRow(courseData);
			}
		}
		
		return CourseTable; // MUST RETURN AS AN ARRAYLIST!
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------ GET COURSE BY NAME! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getCourseByName(String courseDef, DefaultTableModel CourseTable) throws SQLException { // Finds a specific course!

		con = connectionTest();

		PreparedStatement prepStmnt = con.prepareStatement("SELECT * from Course WHERE courseName like ?");
		prepStmnt.setString(1, courseDef +"%");
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {
				String courseName = resSet.getString(i++);
				String courseNumber = resSet.getString(i++);
				int credits = resSet.getInt(i++);
				
				Object[] courseData = {courseName, courseNumber, credits};
				
				CourseTable.addRow(courseData);
			}
		}
		
		return CourseTable; // MUST RETURN AS AN ARRAYLIST!
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------------------- REGISTER EMAIL!------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */
	public void registerStudentEmail(String eMail, String socNmbr) throws SQLException {	// Registers a student email!	

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Email VALUES(?,?)");
		prepStmnt.setString(1, eMail);
		prepStmnt.setString(2, socNmbr);
		prepStmnt.executeUpdate();
		
		System.out.println("eMail added!");
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------------------- REGISTER PHONE ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */
	public void registerStudentPhone(String telNmbr, String socNmbr) throws SQLException {	// Registers a student phoneNmbr!	

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Telephone VALUES(?,?)");
		prepStmnt.setString(1, telNmbr);
		prepStmnt.setString(2, socNmbr);
		prepStmnt.executeUpdate();
		
		System.out.println("Telephone added!");
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* -------------------------------------------- GET COURSE HISTORY! ---------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getCourseHistory(String courseCode, DefaultTableModel StudentTable) throws SQLException { // Finds students who took the course and their grade!

		System.out.println("dwas");
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT S.* FROM Student S INNER JOIN Studied U ON S.socNmbr = U.socNmbr WHERE U.courseCode = ?");
		prepStmnt.setString(1, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();
		
		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode};
				
				StudentTable.addRow(studentData);	
			}
		}
		
		return StudentTable;
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET ACTIVE STUDENTS! ---------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getActiveStudents(String courseCode, DefaultTableModel StudentTable) throws SQLException { // Gets students who aren't finishied! 

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT S.* FROM Student S WHERE S.socNmbr IN (SELECT socNmbr FROM Studies WHERE courseCode = ?) OR S.socNmbr IN (SELECT socNmbr FROM Studied WHERE courseCode = ? AND grade = ?)"); 
		prepStmnt.setString(1, courseCode);
		prepStmnt.setString(2, courseCode);
		prepStmnt.setString(3, "U");
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode};
				
				StudentTable.addRow(studentData);
				
			}
		}
		
		return StudentTable;
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET ACTIVE COURSES! ----------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getActiveCourses(String socNmbr, DefaultTableModel CourseTable) throws SQLException { // Gets students who aren't finishied! 

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT C.* FROM Course C WHERE C.courseCode IN (SELECT courseCode FROM Studies WHERE socNmbr = ?) OR C.courseCode IN (SELECT courseCode FROM Studied WHERE socNmbr = ? AND grade = ?)"); 
		prepStmnt.setString(1, socNmbr);
		prepStmnt.setString(2, socNmbr);
		prepStmnt.setString(3, "U");
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String courseName = resSet.getString(i++);
				String courseCode = resSet.getString(i++);
				int credits = resSet.getInt(i++);
				
				Object[] courseData = {courseName, courseCode, credits};
				
				CourseTable.addRow(courseData);
				
			}
		}
		
		return CourseTable;
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET STUDENT RESULT! ----------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public String getStudentResult(String socNmbr, String courseCode, DefaultTableModel StudentTable) throws SQLException { // Shows a specific students result on a specific course!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT Grade FROM Studied WHERE courseCode = ? AND socNmbr = ?");
		prepStmnt.setString(1, courseCode);
		prepStmnt.setString(2, socNmbr);
		ResultSet resSet = prepStmnt.executeQuery();

		String grade = resSet.getString(0);
		
		return grade;
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* --------------------------------------------- REGISTER COURSE! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void registerCourse(String courseName, String courseCode, int credits) throws SQLException {	// Registers a specific course!

		con = connectionTest();

		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Course VALUES(?,?,?)");
		prepStmnt.setString(1, courseName);
		prepStmnt.setString(2, courseCode);
		prepStmnt.setInt(3, credits);

		prepStmnt.executeUpdate();
		
		System.out.println("Course added!");
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------------- UPDATE COURSE! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void updateCourse(String courseName, String courseCode, int credits) throws SQLException { // Updates a specific student!
	} // NOT IMPLEMENTED!

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------------ REMOVE COURSE! ----------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void removeCourse(String courseCode) throws SQLException { // Removes a specific course!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("DELETE Course from Course WHERE courseCode = ?");
		prepStmnt.setString(1, courseCode);
		prepStmnt.executeUpdate();

		System.out.println("Course removed!");
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* -------------------------------------------- GET STUDENT HISTORY! --------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getStudentHistory(String socNmbr, DefaultTableModel CourseTable) throws SQLException { // Finds students who took the course and their grade!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT C.* FROM Course C INNER JOIN Studied S ON C.courseCode = S.courseCode WHERE S.socNmbr = ?");
		prepStmnt.setString(1, socNmbr);
		ResultSet resSet = prepStmnt.executeQuery();
		
		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();
		
		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {

				String courseName = resSet.getString(i++);
				String courseNumber = resSet.getString(i++);
				int credits = resSet.getInt(i++);
				
				Object[] courseData = {courseName, courseNumber, credits};
				
				CourseTable.addRow(courseData);
			}
		}
		
		return CourseTable;
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET COURSE CREDITS! ----------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public Integer getCourseCredits(String courseCode) throws SQLException { // Gets the credits of a specific course!

		con = connectionTest();

		PreparedStatement prepStmnt = con.prepareStatement("SELECT courseCredits FROM Course WHERE courseCode = ?");
		prepStmnt.setString(1, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();

		int totalStudentCredits = 0;
		
		int i = 1;
		while (resSet.next()) {
			totalStudentCredits = totalStudentCredits + resSet.getInt(i);
			i++;
		}
		
		return totalStudentCredits; // MUST RETURN AS AN ARRAYLIST!
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET COURSE CREDITS! ----------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public Integer getTotalStudentCredits(String socNmbr) throws SQLException { // Gets the credits of a specific course!

		con = connectionTest();

		PreparedStatement prepStmnt = con.prepareStatement("SELECT SUM(C.courseCredits) FROM Course C INNER JOIN Studies S ON C.courseCode = S.courseCode WHERE socNmbr = ?");
		prepStmnt.setString(1, socNmbr);
		ResultSet resSet = prepStmnt.executeQuery();

		int totalStudentCredits = 0;
		
		int i = 1;	
		while (resSet.next()) {
			totalStudentCredits = totalStudentCredits + resSet.getInt(i++);
			System.out.println(i);
		}
		
		return totalStudentCredits; // MUST RETURN AS AN ARRAYLIST!
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* -------------------------------------------- GET GRADE PERCENTAGE! -------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public Integer getHighGradePercentage(String courseCode) throws SQLException { // Gets the percentage for students who got A on a specific course!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT 100 * (SELECT COUNT(*) FROM Studied WHERE courseCode = ? AND Grade = 'A') / (SELECT COUNT (*) FROM Studied WHERE courseCode = ?) AS Percentage");
		prepStmnt.setString(1, courseCode);
		prepStmnt.setString(2, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();

		int gradePercentage = resSet.getInt(0);
		
		return gradePercentage;
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET COURSE THROUGHPUT! -------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public Integer getCourseThroughput(String courseCode) throws SQLException { // Ranks all courses by highest throughput (students who has taken a course with at least grade 'E'!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT 100 * (SELECT COUNT(*) FROM Studied WHERE courseCode = ? AND Grade != ?) / (SELECT COUNT (*) FROM Studied WHERE courseCode = ?) AS Percentage");
		prepStmnt.setString(1, courseCode);
		prepStmnt.setString(2, "U");
		prepStmnt.setString(3, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();
		
		int courseThroughput = resSet.getInt(0);
		
		return courseThroughput;
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* -------------------------------------------- ADD STUDEN TO COURSE! -------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void registerStudentOnCourse(String socNmbr, String courseCode) throws SQLException { // Adds a student to a course!
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Studies VALUES(?,?)");
		prepStmnt.setString(1, socNmbr);  
		prepStmnt.setString(2, courseCode);
		prepStmnt.executeUpdate();
		
		System.out.println("Student added to course!");
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------- REMOVE STUDENT FROM COURSE! ------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public void removeStudentFromCourse(String socNmbr, String courseCode, String grade) throws SQLException { // Removes a student from a course!
	
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Studied VALUES(?,?,?) THEN DELETE Student FROM Studies WHERE socNmbr = ?");
		prepStmnt.setString(1, socNmbr);  
		prepStmnt.setString(2, courseCode);
		prepStmnt.setString(3, grade);
		prepStmnt.setString(4, socNmbr);
		prepStmnt.executeQuery();
		
		System.out.println("Student graded and removed from course!");
		
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* ---------------------------------------------- GET ALL STUDENTS! ---------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getAllStudents(DefaultTableModel StudentModel) throws SQLException  { // Finds all students!

		con = connectionTest();
		
		PreparedStatement prepStmnt = con.prepareStatement("SELECT * FROM Student");
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int numberOfColumns = metadata.getColumnCount();

		while (resSet.next()) {              
		
			int i = 1;
			while(i <= numberOfColumns) {
				
				String firstName = resSet.getString(i++);
				String lastName = resSet.getString(i++);
				String socNmbr = resSet.getString(i++);
				String address = resSet.getString(i++);
				String city = resSet.getString(i++);
				String zipCode = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode};
				
				StudentModel.addRow(studentData);
			}
		}
		return StudentModel;  		
	}

	/* --------------------------------------------------------------------------------------------------------------- */
	/* --------------------------------------------- GET ALL COURSES! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getAllCourses(DefaultTableModel CourseTable) throws SQLException { // Finds all courses!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT * FROM Course");
		ResultSet resSet = prepStmnt.executeQuery();

		ResultSetMetaData metadata = resSet.getMetaData();
		int columnNbr = metadata.getColumnCount();

		while (resSet.next()) {              
			int i = 1;
			while(i <= columnNbr) {
				String courseName = resSet.getString(i++);
				String courseNumber = resSet.getString(i++);
				int credits = resSet.getInt(i++);
				
				Object[] courseData = {courseName, courseNumber, credits};
				
				CourseTable.addRow(courseData);
			}
		}

		return CourseTable;
		
		}

	/* ------------------------------------ */
	/* ---- DATABSE CONNECTION TESTING! --- */
	/* ------------------------------------ */

	public void driverCheck() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		}

		catch (ClassNotFoundException cnfe) {
			System.out.println("Driver is not functioning properly! " +
							   "Error message:" + cnfe.getMessage());
		}
	}

	public Connection connectionTest() {

		try { 
			con = DriverManager.getConnection("jdbc:sqlserver://oxeiuqtake.database.windows.net;" + 
					"database = SQOOL_db;" + 
					"user = SQOOL_user;" + 
					"password = Hj34rT11"); 

			System.out.println("Connection successfull!"); 
		}

		catch (Exception e) {

			System.out.println("Error establishing connection! Please try again later...");
			e.printStackTrace();
			System.out.println(e.getMessage()); 
		}

		return con;
	}

}