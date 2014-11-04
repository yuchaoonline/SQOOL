private void SearchStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		
		StudentModel.setRowCount(0); // DELETES ALL ROWS!
		
		
		if( (SocNmbrTextField.getText().equals("") || SocNmbrTextField.getText().equals("Soc. Nmbr"))
				& (LNameTextField.getText().equals("") || LNameTextField.getText().equals("Last Name"))
				& (FNameTextField.getText().equals("") || FNameTextField.getText().equals("First Name")))
				{ 
				StudentTable.setModel(controller.getAllStudentsWEmail(StudentModel));
				}
		
		else if( (SocNmbrTextField.getText().equals("") || SocNmbrTextField.getText().equals("Soc. Nmbr"))
				& (FNameTextField.getText().equals("") || FNameTextField.getText().equals("First Name")))
		{	
			String searchLastName = LNameTextField.getText();
			StudentTable.setModel(controller.getStudentByLastName(searchLastName, StudentModel));
		}
		
		else if( (FNameTextField.getText().equals("") || FNameTextField.getText().equals("First Name"))
				& (LNameTextField.getText().equals("") || LNameTextField.getText().equals("Last Name")))
		{
			String searchSocNmbr = SocNmbrTextField.getText();
			StudentTable.setModel(controller.getStudentWEmail(searchSocNmbr, StudentModel));
		}
		
		else {
			String searchFirstName = FNameTextField.getText();
			StudentTable.setModel(controller.getStudentByFirstName(searchFirstName, StudentModel));
			
		}
	}
	
	
	private void SearchCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		
		CourseModel.setRowCount(0); // DELETES ALL ROWS!
		
		if((CourseCodeTextField.getText().equals("") || CourseCodeTextField.getText().equals("Course Code"))
			&& (CourseNameTextField.getText().equals("") || CourseNameTextField.getText().equals("Course Name"))){
			CourseTable.setModel(controller.getAllCourses(CourseModel)); 
		}
		else if( CourseCodeTextField.getText().equals("") || CourseCodeTextField.getText().equals("Course Code")){
				String courseDef = CourseNameTextField.getText();
				CourseTable.setModel(controller.getCourseByName(courseDef, CourseModel));
		}
		
		else {
			String courseCode = CourseCodeTextField.getText();
			CourseTable.setModel(controller.getCourse(courseCode, CourseModel)); 
			
		}
		
	}
	private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
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
		else{
		
		controller.registerStudent(firstName, lastName, socNmbr, adress, city, zipCode);
		controller.registerStudentPhone(telNmbr, socNmbr);
		controller.registerStudentEmail(eMail, socNmbr);
		JOptionPane.showMessageDialog(null, "Student added to system.","Success", JOptionPane.PLAIN_MESSAGE);
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
	
	
	private void AddCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		//ADDS COURSE TO COURSE DATABASE
		String courseName = AddCourseNameTextField.getText();
		String courseCode = AddCourseCodeTextField.getText();
		String courseCredits = AddCourseCreditsTextField.getText();
		
		
		
		
		if(		AddCourseCodeTextField.getText().equals("") || AddCourseCodeTextField.getText().equals("Course Code") ||
				AddCourseNameTextField.getText().equals("") || AddCourseNameTextField.getText().equals("Course Name") ||
				AddCourseCreditsTextField.getText().equals("") || AddCourseCreditsTextField.getText().equals("Course Credits")) {
				
				JOptionPane.showMessageDialog(null, "Make sure You filled out the form correctly.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
			}

		
		
		
		
		
		
		
		else{
		int credits = Integer.parseInt(courseCredits);
		controller.registerCourse(courseName, courseCode, credits);
		JOptionPane.showMessageDialog(null, "Course added to system.","Success", JOptionPane.PLAIN_MESSAGE);
		AddCourseCodeTextField.setText("Course Code");
		AddCourseNameTextField.setText("Course Name");
		AddCourseCreditsTextField.setText("Course Credits");
		}
	}
