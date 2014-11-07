/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- GET ACTIVE STUDENTS! ---------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getActiveStudents(String courseCode, DefaultTableModel StudentTable) throws SQLException { // Gets students who aren't finishied! 

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT S.*, E.Email, T.TelNmbr FROM Student S inner join Email E on S.socNmbr = E.SocNMbr inner join Telephone T on e.SocNmbr = t.Socnmbr WHERE S.socNmbr IN (SELECT socNmbr FROM Studies WHERE courseCode = ?) OR S.socNmbr IN (SELECT socNmbr FROM Studied WHERE courseCode = ? AND grade = ?)"); 
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
				String telNmbr = resSet.getString(i++);
				String eMail = resSet.getString(i++);
				
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode, telNmbr, eMail};
				
				StudentTable.addRow(studentData);
				
			}
		}
		
		return StudentTable;
	}
	
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* -------------------------------------------- GET COURSE HISTORY! ---------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getCourseHistory(String courseCode, DefaultTableModel StudentTable) throws SQLException { // Finds students who took the course and their grade!
		
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT S.*, T.TelNmbr, E.Email FROM Student S INNER JOIN Studied U ON S.socNmbr = U.socNmbr INNER JOIN Telephone T ON U.SocNmbr = T.SocNmbr INNER JOIN Email E on T.SocNmbr = E.SocNmbr WHERE U.courseCode = ?");
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
				String telNmbr = resSet.getString(i++);
				String eMail = resSet.getString(i++);
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode, telNmbr, eMail };
				
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
		
		return StudentTable;
	}
