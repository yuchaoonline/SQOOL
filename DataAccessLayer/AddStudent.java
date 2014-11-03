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
	/* ---------------------------------------- GET STUDENT BY FIRST NAME -------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getStudentByFirstName(String searchFirstName, DefaultTableModel StudentTable) throws SQLException { // Finds a specific student!
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT * from Student WHERE firstName like ?");
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
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode};
				
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
		PreparedStatement prepStmnt = con.prepareStatement("SELECT * from Student WHERE lastName like ?");
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
				
				Object[] studentData = {firstName, lastName, socNmbr, address, city, zipCode};
				
				StudentTable.addRow(studentData);	
			}
		}
		
		return StudentTable;
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

