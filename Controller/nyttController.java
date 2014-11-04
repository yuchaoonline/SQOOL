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
	
	public DefaultTableModel getCourse(String courseCode, DefaultTableModel CourseModel) throws SQLException { // Finds a specific course!
		return dal.getCourse(courseCode, CourseModel);
	}
	
	public DefaultTableModel getCourseByName(String courseDef, DefaultTableModel CourseModel) throws SQLException { // Finds a specific course!
		return dal.getCourseByName(courseDef, CourseModel);
	}
