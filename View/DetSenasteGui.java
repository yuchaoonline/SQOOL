AddFirstNameTextField.setText("First Name");
		AddFirstNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AddFirstNameTextFieldMouseClicked(evt);
			}
		});
private void AddFirstNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		//CLEARS FIRST NAME FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddFirstNameTextField.setText("");		
		
AddCourseCodeTextField.setText("Course Code");
AddCourseCodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
ddCourseCodeTextFieldMouseClicked(evt);
			}
		});
		
private void AddCourseCodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		//CLEARS COURSE CODE FIELD IN ADD COURSE WHEN FOCUSED
		AddCourseCodeTextField.setText("");		

private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		String firstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 0);
		String lastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);

		if (controller.registerStudentOnCourseCheckIfTaken(socNmbr, courseCode) == true){
			JOptionPane.showMessageDialog(null,
				    "Student: "  +firstName+ " " +lastName+ " has already taken course: " +courseName,
				    "Something went wrong",
				    JOptionPane.PLAIN_MESSAGE);
		}
		else if (controller.registerStudentOnCourseCheckIfTaking(socNmbr, courseCode) == true) {
			JOptionPane.showMessageDialog(null,
				    "Student: "  +firstName+ " " +lastName+ " is already taking course: " +courseName,
				    "Something went wrong",
				    JOptionPane.PLAIN_MESSAGE);
		}
		else if(controller.registerStudentOnCourseCheck(socNmbr, courseCode) == false){
			JOptionPane.showMessageDialog(null,
				    "Total student credit is too high to register on course: " +courseName,
				    "Something went wrong",
				    JOptionPane.PLAIN_MESSAGE);
		}
		else {
			controller.registerStudentOnCourse(socNmbr, courseCode);
			JOptionPane.showMessageDialog(null,
				    "Student: "  +firstName+ " " +lastName+ " is now registered on course: " +courseName,
				    "Success",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
		
		/*controller.registerStudentOnCourseCheck(socNmbr, courseCode);
		JOptionPane.showMessageDialog(null,
			    "Check console",
			    "Success",
			    JOptionPane.PLAIN_MESSAGE); */
			    

	}

private void GradeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		// IMPLEMENT GRADE STUDENT METHOD!
		String studentFirstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 0);
		String studentLastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String studentSocNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		
		Object[] possibilities = {"---Please Select Grade---", "A", "B", "C", "D", "E", "U"};
		String grade = (String)JOptionPane.showInputDialog(null,
		                    "Grade Student: \n" + studentFirstName+ " " +studentLastName+ " on course: " + courseName
		                      + " with Grade:",
		                    "Grade Student", JOptionPane.PLAIN_MESSAGE, null, possibilities, null);
		
		if(grade.equals("---Please Select Grade---")){
			JOptionPane.showMessageDialog(null,
				    "That is not a valid grade. Please try again.",
				    "Something went wrong.",
				    JOptionPane.PLAIN_MESSAGE);
					}

		else if(controller.gradeStudentOnCourseCheckIfTaking(socNmbr, courseCode) == true){
			controller.gradeStudentOnCourseTest(socNmbr, courseCode, grade);
			JOptionPane.showMessageDialog(null,
				    "Student: " + studentFirstName+ " "+ studentLastName +" has been graded." ,
				    "Success.",
				    JOptionPane.PLAIN_MESSAGE);
			CourseModel.setRowCount(0); // REFRESH STUDENTS CURRENT COURSES AFTER GRADE BUTTON IS PRESSED
			CourseTable.setModel(controller.getActiveCourses(socNmbr, CourseModel));
					}
		else if(controller.gradeStudentOnCourseCheckIfTaking(socNmbr, courseCode) == false & controller.gradeStudentOnCourseCheckIfGradeIsU(socNmbr, courseCode, grade) == false){
			JOptionPane.showMessageDialog(null,
				    "Students can not be graded on courses they are currently not taking, and only be regraded if they previously got a U."  ,
				    "Something went wrong.",
				    JOptionPane.PLAIN_MESSAGE);
		}
		
		else if(controller.gradeStudentOnCourseCheckIfGradeIsU(socNmbr, courseCode, grade) == true){
			controller.reGradeStudentOnCourse(socNmbr, courseCode, grade);
			JOptionPane.showMessageDialog(null,
				    "Student grade has been updated." ,
				    "Success",
				    JOptionPane.PLAIN_MESSAGE);
			CourseModel.setRowCount(0); // REFRESH STUDENTS CURRENT COURSES AFTER GRADE BUTTON IS PRESSED
			CourseTable.setModel(controller.getActiveCourses(socNmbr, CourseModel));
		}
		
		else if (controller.gradeStudentOnCourseCheckIfGradeIsU(socNmbr, courseCode, grade) == false ){
			JOptionPane.showMessageDialog(null,
				    "Students can only be regraded if they previously got a U" ,
				    "Something went wrong.",
				    JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{

	//ADDS STUDENT TO STUDENT DATABASE W/ PHONE AND EMAIL
		
		String firstName = AddFirstNameTextField.getText();
		String lastName = AddLastNameTextField.getText();
		String socNmbr = AddSocNmbrTextField.getText();
		String adress = AddAddressTextField.getText();
		String city = AddCityTextField.getText();
		String zipCode = AddZipTextField.getText();
		String telNmbr = AddPhoneNmbrTextField.getText();
		String eMail = AddEmailTextField.getText();
		
		if(	AddFirstNameTextField.getText().equals("") || AddFirstNameTextField.getText().equals("First Name") ||
			AddLastNameTextField.getText().equals("") || AddLastNameTextField.getText().equals("Last Name") ||
			AddSocNmbrTextField.getText().equals("") || AddSocNmbrTextField.getText().equals("Social Security Number") ||
			AddAddressTextField.getText().equals("") || AddAddressTextField.getText().equals("Address") ||
			AddCityTextField.getText().equals("") || AddCityTextField.getText().equals("City") ||
			AddZipTextField.getText().equals("") || AddZipTextField.getText().equals("Zip Code") ||
			AddPhoneNmbrTextField.getText().equals("") || AddPhoneNmbrTextField.getText().equals("Telephone Number") ||
			AddEmailTextField.getText().equals("") || AddEmailTextField.getText().equals("Email") ){
			
			JOptionPane.showMessageDialog(null, "Make sure You filled out the form correctly.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}
	
	
		else if(controller.registerStudentCheckSocNmbr(socNmbr) == true){
			System.out.println("halo");
			JOptionPane.showMessageDialog(null, "There is already a student with this soc nmbr in the system.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}
		
		
		else if (controller.registerStudentCheckPhone(socNmbr, telNmbr) == true){
			System.out.println("hehjehje2");
			JOptionPane.showMessageDialog(null, "There is already a student with this phone nmbr in the system.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}
		
		else if (controller.registerStudentCheckEmail(socNmbr, eMail) == true){
			System.out.println("hejhej");
			JOptionPane.showMessageDialog(null, "There is already a student with this email in the system.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}
			
		
		else {
			System.out.println("det knasar inte längre");
			controller.registerStudent(firstName, lastName, socNmbr, adress, city, zipCode);
			controller.registerStudentPhone(telNmbr, socNmbr);
			controller.registerStudentEmail(eMail, socNmbr);
			JOptionPane.showMessageDialog(null, "Student added to system.","Success", JOptionPane.PLAIN_MESSAGE);
			StudentModel.setRowCount(0);
			controller.getAllStudentsWEmail(StudentModel);
			
			AddFirstNameTextField.setText("First Name");
			AddLastNameTextField.setText("Last Name");
			AddSocNmbrTextField.setText("Social Security Number");
			AddAddressTextField.setText("Address");
			AddCityTextField.setText("City");
			AddZipTextField.setText("Zip Code");
			AddPhoneNmbrTextField.setText("Telephone Number");
			AddEmailTextField.setText("Email"); 
		}
		
	}
	
	private void AddCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{


		
		//ADDS COURSE TO COURSE DATABASE
		String courseName = AddCourseNameTextField.getText();
		String courseCode = AddCourseCodeTextField.getText();
		String courseCredits = AddCourseCreditsTextField.getText();
		int credits = Integer.parseInt(courseCredits);
		
		
		
		if(		AddCourseCodeTextField.getText().equals("") || AddCourseCodeTextField.getText().equals("Course Code") ||
				AddCourseNameTextField.getText().equals("") || AddCourseNameTextField.getText().equals("Course Name") ||
				AddCourseCreditsTextField.getText().equals("") || AddCourseCreditsTextField.getText().equals("Course Credits")) {
				
				JOptionPane.showMessageDialog(null, "Make sure You filled out the form correctly.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
			}

		if(credits >30){
			JOptionPane.showMessageDialog(null, "A course can not be greater than 30 credits.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}
		
		else if(controller.registerCourseCheckCourseCode(courseCode) == true){
			JOptionPane.showMessageDialog(null, "There is already a course with that code in the systen.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}
		else {
		controller.registerCourse(courseName, courseCode, credits);
		CourseModel.setRowCount(0);
		controller.getAllCourses(CourseModel);
		JOptionPane.showMessageDialog(null, "Course: " +courseCode+ " added to system.","Success", JOptionPane.PLAIN_MESSAGE);
		AddCourseCodeTextField.setText("Course Code");
		AddCourseNameTextField.setText("Course Name");
		AddCourseCreditsTextField.setText("Course Credits");
		}
		
		
		
	}
	private void DeleteStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		String firstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(),0);
		String lastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(),2);
		
		controller.removeStudent(socNmbr);
		StudentModel.setRowCount(0);
		controller.getAllStudentsWEmail(StudentModel);
		
		JOptionPane.showMessageDialog(null,
			    "Student: "  +firstName+ " " +lastName+ " removed",
			    "Student removed",
			    JOptionPane.PLAIN_MESSAGE);
		

	}

	private void DeleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{
		
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		
		controller.removeCourse(courseCode);
		CourseModel.setRowCount(0);
		controller.getAllCourses(CourseModel);
		
		JOptionPane.showMessageDialog(null,
			    "Course: "  +courseName+ " with code: " +courseCode+ " has been deleted from the system.",
			    "Course removed",
			    JOptionPane.PLAIN_MESSAGE);

	}
