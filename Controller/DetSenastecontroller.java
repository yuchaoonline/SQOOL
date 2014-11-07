public boolean gradeStudentOnCourseCheckIfTaking(String socNmbr, String courseCode) throws SQLException {
		if(dal.gradeStudentOnCourseCheckIfTaking(socNmbr, courseCode) == true) {
			System.out.println("halloj");
		return true;
		}
		return false;
	}

	public boolean gradeStudentOnCourseCheckIfGradeIsU(String socNmbr, String courseCode, String grade) throws SQLException {
		if (dal.gradeStudentOnCourseCheckIfGradeIsU(socNmbr, courseCode, grade) == true) {
			System.out.println("hala");
			return true; 
			}
		return false;
		}
		

	public void gradeStudentOnCourseTest (String socNmbr, String courseCode, String grade) throws SQLException {
		dal.gradeStudentOnCourseTest(socNmbr, courseCode, grade);
	}
	
	public void reGradeStudentOnCourse (String socNmbr, String courseCode, String grade) throws SQLException {
		dal.reGradeStudentOnCourseTest(socNmbr, courseCode, grade);
	}
	
	public boolean registerCourseCheckCourseCode(String courseCode) throws SQLException {
		if (dal.registerCourseCheckCourseCode(courseCode) == true) {
			return true;
		}
		return false;
	}
	public boolean registerStudentCheckEmail(String socNmbr, String eMail) throws SQLException {
		if (dal.registerStudentEmailCheck(eMail) == true){
			return true;}
		return false;
		}
	
	public boolean registerStudentCheckPhone(String socNmbr, String telNmbr) throws SQLException {	
		if (dal.registerStudentPhoneCheck(telNmbr) == true){
			return true;}
		return false;
		}
	
		
		
	public boolean registerStudentCheckSocNmbr(String socNmbr) throws SQLException {
		if(dal.registerStudentSocNmbrCheck(socNmbr) == true){
			System.out.println("hejhejehje");
			return true; }
		return false;
		}
	
		public boolean registerStudentOnCourseCheckIfTaking (String socNmbr, String courseCode) throws SQLException {
		if(dal.registerStudentOnCourseCheckIfTaking(socNmbr, courseCode) == true) {
			System.out.println("haloj");
			return true;
		}
		return false;
	}
	
	public boolean registerStudentOnCourseCheckIfTaken (String socNmbr, String courseCode) throws SQLException {
		if(dal.registerStudentOnCourseCheckIfTaken(socNmbr, courseCode) == true) {
			System.out.println("hanfnd");
			return true;
		}
		return false;
	}
	
public boolean registerStudentOnCourseCheck(String socNmbr, String courseCode) throws SQLException {
		//Check history
		if ((dal.getTotalStudentCredits(socNmbr) + dal.getCourseCredits(courseCode)) <= 45) {
			return true;
		}
		return false;
		}
		
