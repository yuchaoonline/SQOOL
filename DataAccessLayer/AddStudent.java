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
