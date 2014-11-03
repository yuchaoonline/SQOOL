	//Ändrat i dessa två för att de autofokuseras när Add student or course öppnas.
	
	AddFirstNameTextField.setText("First Name");
		AddFirstNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AddFirstNameTextFieldMouseClicked(evt);
			}
		});
		
			AddCourseCodeTextField.setText("Course Code");
		AddCourseCodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AddCourseCodeTextFieldMouseClicked(evt);
			}
		});
		
		//Tagit bort de metoders om finns för de två fälten eftersom focuslistener är borta nu, och ersatt med mouseclicked.
		
	  private void AddFirstNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		//CLEARS FIRST NAME FIELD IN ADD STUDENT TAB WHEN CLICKED BC AUTOFOUCS
		AddFirstNameTextField.setText("");
	}
		private void AddCourseCodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		//CLEARS COURSE CODE FIELD IN ADD COURSE WHEN CLICKED BC AUTOFOCUS
		AddCourseCodeTextField.setText("");
	}
	
	
	//För add Student knapp med try/catch
	
	AddStudentButton.setText("Add Student");
		AddStudentButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try {
					AddStudentButtonActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		//För add Course knapp med try/catch
		
				AddCourseButton.setText("Add Course");
		AddCourseButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try {
					AddCourseButtonActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		
	//Metod för Add Student knapp.
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
		
		
		controller.registerStudent(firstName, lastName, socNmbr, adress, city, zipCode);
		controller.registerStudentPhone(telNmbr, socNmbr);
		controller.registerStudentEmail(eMail, socNmbr);
		} 
	
		
		//Metod för Add Course knapp.
		
			private void AddCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		//ADDS COURSE TO COURSE DATABASE
		String courseName = AddCourseNameTextField.getText();
		String courseCode = AddCourseCodeTextField.getText();
		int credits = Integer.parseInt(AddCourseCreditsTextField.getText());

		controller.registerCourse(courseName, courseCode, credits);
	}


// STUDENT SÖK MED MED ALLA MÖJLIGHETER
	private void SearchStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		
		StudentModel.setRowCount(0); // DELETES ALL ROWS!
		
		
		if( (SocNmbrTextField.getText().equals("") || SocNmbrTextField.getText().equals("Soc. Nmbr"))
				& (LNameTextField.getText().equals("") || LNameTextField.getText().equals("Last Name"))
				& (FNameTextField.getText().equals("") || FNameTextField.getText().equals("First Name")))
				{ 
				StudentTable.setModel(controller.getAllStudents(StudentModel));
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
			String socNmbr = SocNmbrTextField.getText();
			StudentTable.setModel(controller.getStudent(socNmbr, StudentModel));
		}
		
		else {
			String searchFirstName = FNameTextField.getText();
			StudentTable.setModel(controller.getStudentByFirstName(searchFirstName, StudentModel));
			
		}
	}

//KURS SÖK ÄVEN PÅ NAMN
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
