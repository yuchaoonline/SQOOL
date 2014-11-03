	public void registerStudentEmail(String eMail, String socNmbr) throws SQLException {
		dal.registerStudentEmail(eMail, socNmbr);
	}
	
	public void registerStudentPhone(String telNmbr, String socNmbr) throws SQLException {
		dal.registerStudentPhone(telNmbr, socNmbr);
	}
	
	public DefaultTableModel getStudentByFirstName(String searchFirstName, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student by first name!
		return dal.getStudentByFirstName(searchFirstName, StudentModel);
	}
	
	public DefaultTableModel getStudentByLastName(String searchLastName, DefaultTableModel StudentModel) throws SQLException { // Finds a specific student by first name!
		return dal.getStudentByLastName(searchLastName, StudentModel);
	}

	public DefaultTableModel getCourseByName(String courseDef, DefaultTableModel CourseModel) throws SQLException { // Finds a specific course!
		return dal.getCourseByName(courseDef, CourseModel);
	}
