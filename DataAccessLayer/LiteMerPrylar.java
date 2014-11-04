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
