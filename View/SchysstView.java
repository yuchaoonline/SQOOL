	private void DeleteStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		String firstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(),0);
		String lastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(),2);
		
		controller.removeStudent(socNmbr);
		
		JOptionPane.showMessageDialog(null,
			    "Student: "  +firstName+ " " +lastName+ " removed",
			    "Student removed",
			    JOptionPane.PLAIN_MESSAGE);
		

	}


	private void DeleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{
		
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		
		controller.removeCourse(courseCode);
		
		JOptionPane.showMessageDialog(null,
			    "Course: "  +courseName+ " with code: " +courseCode+ " has been deleted from the system.",
			    "Course removed",
			    JOptionPane.PLAIN_MESSAGE);

	}
	
	private void GradeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		// IMPLEMENT GRADE STUDENT METHOD!
		String studentFirstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 0);
		String studentLastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String studentSocNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		
		Object[] possibilities = {"---Please Select Grade---", "A", "B", "C", "D", "E", "U"};
		String grade = (String)JOptionPane.showInputDialog(null,
		                    "Grade Student: \n" + studentFirstName+ " " +studentLastName+ " on course: " + courseName
		                      + " with Grade:",
		                    "Grade Student", JOptionPane.PLAIN_MESSAGE, null, possibilities, null);
		
		if(grade.equals("---Please Select Grade---")){
			System.out.println("Select grade...");
					
		}
		else{
		controller.gradeStudentOnCourse(studentSocNmbr, courseCode, grade);
		System.out.println(grade);
		
		}
	}
	
		private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		String firstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 0);
		String lastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);

		controller.registerStudentOnCourseCheck(socNmbr, courseCode);
		JOptionPane.showMessageDialog(null,
			    "Student: "  +firstName+ " " +lastName+ " Registered on course: " +courseName,
			    "Success",
			    JOptionPane.PLAIN_MESSAGE);

	}
