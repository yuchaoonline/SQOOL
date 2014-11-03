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
		
		
	//Metod för Add Student knapp. + lägg till try/catch 
		private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		//ADDS STUDENT TO STUDENT DATABASE
		
		String firstName = AddFirstNameTextField.getText();
		String lastName = AddLastNameTextField.getText();
		String socNmbr = AddSocNmbrTextField.getText();
		String adress = AddAddressTextField.getText();
		String city = AddCityTextField.getText();
		String zipCode = AddZipTextField.getText();
		
		controller.registerStudent(firstName, lastName, socNmbr, adress, city, zipCode);
		} 
		
		//Metod för Add Course knapp.
		
			private void AddCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		//ADDS COURSE TO COURSE DATABASE
		String courseName = AddCourseNameTextField.getText();
		String courseCode = AddCourseCodeTextField.getText();
		int credits = Integer.parseInt(AddCourseCreditsTextField.getText());

		controller.registerCourse(courseName, courseCode, credits);
	}
