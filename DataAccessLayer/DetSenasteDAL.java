/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------- REGISTER PHONE CHECK FOR NUMBER ------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */
	
	public boolean registerStudentPhoneCheck(String telNmbr) throws SQLException {
		
	con = connectionTest();
	PreparedStatement prepPreStmnt = con.prepareStatement("SELECT telNmbr FROM Telephone WHERE telNmbr = ?");
	prepPreStmnt.setString(1, telNmbr);
	ResultSet resSet = prepPreStmnt.executeQuery();
	
	 if (resSet.next() ){
			String telNmbrCheck = resSet.getString(1);
		
			
				if (telNmbrCheck.equals(telNmbr)){
				System.out.println("There is already a student with that phone number registered in the system.");
				return true;
				}
	 }
	 return false;
	 }
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------- REGISTER EMAIL CHECK FOR EMAIL  ------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */
	
	public boolean registerStudentEmailCheck(String eMail) throws SQLException {
		
	con = connectionTest();
	PreparedStatement prepPreStmnt = con.prepareStatement("SELECT eMail FROM eMail WHERE eMail = ?");
	prepPreStmnt.setString(1, eMail);
	ResultSet resSet = prepPreStmnt.executeQuery();
	
	 if (resSet.next() ){
			String eMailCheck = resSet.getString(1);
		
			
				if (eMailCheck.equals(eMail)){
				System.out.println("There is already a student with that email registered in the system.");
				return true;
				}
			
	 }
	 return false;
	 }
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------- REGISTER STUDENT CHECK FOR SOCNMBR ---------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */
	
	public boolean registerStudentSocNmbrCheck(String socNmbr) throws SQLException {
		
	con = connectionTest();
	PreparedStatement prepPreStmnt = con.prepareStatement("SELECT socNmbr FROM Student WHERE socNmbr = ?");
	prepPreStmnt.setString(1, socNmbr);
	ResultSet resSet = prepPreStmnt.executeQuery();
	
	 if (resSet.next() ){
			String socNmbrCheck = resSet.getString(1);
		
			
				if (socNmbrCheck.equals(socNmbr)){
				System.out.println("There is already a student with that social security number registered in the system.");
				return true;
				}
	 }
	 return false;
	 }
	 
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------- REGISTER COURSE CHECK FOR COURSE CODE ------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */
	 public boolean registerCourseCheckCourseCode(String courseCode) throws SQLException {
		 
		 con = connectionTest();
		 PreparedStatement prepStmnt = con.prepareStatement("SELECT courseCode FROM Course WHERE courseCode = ?");
		 prepStmnt.setString(1, courseCode);
		 ResultSet resSet = prepStmnt.executeQuery();
		 
		 if (resSet.next() ){
			 String courseCodeCheck = resSet.getString(1);
			 
			 if (courseCodeCheck.equals(courseCode)){
				 System.out.println("there is already a course with that code in the system.");
				 return true;
			 }	 
		 }
		 return false;
	 }
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ----------------------------------------------- GRADE STUDENT CHECK ------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */	

	
	public boolean gradeStudentOnCourseCheckIfTaking (String socNmbr, String courseCode) throws SQLException {
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT socNmbr FROM Studies WHERE socNmbr = ? AND courseCode = ?");
		prepStmnt.setString(1, socNmbr);
		prepStmnt.setString(2, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();
		
		if (resSet.next()){
			String socNmbrCheck = resSet.getString(1);
				
				if(socNmbrCheck.equals(socNmbr)){
					return true;
				}
		}
		return false;
	}
	
	public boolean gradeStudentOnCourseCheckIfGradeIsU (String socNmbr, String courseCode, String grade) throws SQLException {
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT socNmbr, grade FROM Studied WHERE socNmbr = ? and courseCode = ?");
		prepStmnt.setString(1, socNmbr);
		prepStmnt.setString(2, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();
		
		if(resSet.next()){
			String gradeCheck = resSet.getString(2);
			if (gradeCheck.equals("U")){
				return true;
			}
		}
		return false;
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------REGRADE STUDENT ON COURSE! ------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */
	
	public void reGradeStudentOnCourseTest (String socNmbr, String courseCode, String grade) throws SQLException {
		 con = connectionTest();
			PreparedStatement prepStmnt3 = con.prepareStatement("UPDATE Studied SET grade = ? WHERE socNmbr = ? AND courseCode = ?");
			prepStmnt3.setString(1, grade);  
			prepStmnt3.setString(2, socNmbr);
			prepStmnt3.setString(3, courseCode);
			prepStmnt3.executeUpdate();	
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------GRADE STUDENT ON COURSE TEST! --------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */
	public void gradeStudentOnCourseTest (String socNmbr, String courseCode, String grade) throws SQLException {
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("INSERT INTO Studied VALUES(?,?,?)");
		prepStmnt.setString(1, socNmbr);  
		prepStmnt.setString(2, courseCode);
		prepStmnt.setString(3, grade);
		prepStmnt.executeUpdate();
		
		con = connectionTest();
		PreparedStatement prepStmnt2 = con.prepareStatement("DELETE FROM Studies WHERE SocNmbr = ? AND CourseCode = ?");
		prepStmnt2.setString(1,socNmbr);
		prepStmnt2.setString(2, courseCode);
		prepStmnt2.executeUpdate();
	}
	
	/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------- ADD STUDENT TO COURSE CHECK METHODS ------------------------------------------- */
	/* --------------------------------------------------------------------------------------------------------------- */	

	
	public boolean registerStudentOnCourseCheckIfTaking (String socNmbr, String courseCode) throws SQLException {
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT socNmbr FROM Studies WHERE socNmbr = ? AND courseCode = ?");
		prepStmnt.setString(1, socNmbr);
		prepStmnt.setString(2, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();
		
		if (resSet.next()){
			String socNmbrCheck = resSet.getString(1);
				
				if(socNmbrCheck.equals(socNmbr)){
					return true;
				}
		}
		return false;
	}
	
public boolean registerStudentOnCourseCheckIfTaken (String socNmbr, String courseCode) throws SQLException {
		
		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT socNmbr FROM Studied WHERE socNmbr = ? AND courseCode = ?");
		prepStmnt.setString(1, socNmbr);
		prepStmnt.setString(2, courseCode);
		ResultSet resSet = prepStmnt.executeQuery();
		
		if (resSet.next()){
			String socNmbrCheck = resSet.getString(1);
				
				if(socNmbrCheck.equals(socNmbr)){
					return true;
				}
		}
		return false;
	}
/* --------------------------------------------------------------------------------------------------------------- */
	/* ------------------------------------------- ADD STUDENT TO COURSE! -------------------------------------------- */
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
	/* --------------------------------------------- GET ALL COURSES! ------------------------------------------------ */
	/* --------------------------------------------------------------------------------------------------------------- */

	public DefaultTableModel getAllCourses(DefaultTableModel CourseTable) throws SQLException { // Finds all courses!

		con = connectionTest();
		PreparedStatement prepStmnt = con.prepareStatement("SELECT * FROM Course ORDER BY courseName");
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
