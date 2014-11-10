
package view;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.Controller;

@SuppressWarnings("serial")
public class MainGUI extends javax.swing.JFrame {

	Controller controller;
	DefaultTableModel StudentModel;
	DefaultTableModel CourseModel;
	boolean isStudentRowSelected;
	boolean isCourseRowSelected;

	public MainGUI() throws SQLException {
		initializeComponents();

		controller = new Controller();

		isStudentRowSelected = false;
		isCourseRowSelected = false;
		JTextArea infoBox;

	}

	private void initializeComponents() {

		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------------- DECLARE OBJECTS! -------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/


		AddDialog = new javax.swing.JDialog();
		AddTabbedPane = new javax.swing.JTabbedPane();
		StudentsPanel = new javax.swing.JPanel();
		AddFirstNameTextField = new javax.swing.JFormattedTextField();
		AddLastNameTextField = new javax.swing.JFormattedTextField();
		AddSocNmbrTextField = new javax.swing.JFormattedTextField();
		AddAddressTextField = new javax.swing.JFormattedTextField();
		AddCityTextField = new javax.swing.JFormattedTextField();
		AddZipTextField = new javax.swing.JFormattedTextField();
		AddPhoneNmbrTextField = new javax.swing.JFormattedTextField();
		AddEmailTextField = new javax.swing.JFormattedTextField();
		AddStudentButton = new javax.swing.JButton();
		ClearStudentButton = new javax.swing.JButton();
		CloseWindow1Button = new javax.swing.JButton();
		CoursesPanel = new javax.swing.JPanel();
		AddCourseCodeTextField = new javax.swing.JFormattedTextField();
		AddCourseNameTextField = new javax.swing.JFormattedTextField();
		AddCourseCreditsTextField = new javax.swing.JFormattedTextField();
		AddCourseButton = new javax.swing.JButton();
		ClearCourseFieldsButton = new javax.swing.JButton();
		CloseWindow2Button = new javax.swing.JButton();
		FNameTextField = new javax.swing.JFormattedTextField();
		LNameTextField = new javax.swing.JFormattedTextField();
		SocNmbrTextField = new javax.swing.JFormattedTextField();
		CourseNameTextField = new javax.swing.JFormattedTextField();
		CourseCodeTextField = new javax.swing.JFormattedTextField();
		StudentLabel = new javax.swing.JLabel();
		CoursesLabel = new javax.swing.JLabel();
		StudentTableScrollPane = new javax.swing.JScrollPane();	
		CourseTableScrollPane = new javax.swing.JScrollPane();
		CourseTable = new javax.swing.JTable();
		StudentTable = new javax.swing.JTable();
		StudentModel = new javax.swing.table.DefaultTableModel();
		CourseModel = new javax.swing.table.DefaultTableModel();
		InfoBox = new javax.swing.JScrollPane();
		infoBox = new javax.swing.JTextArea();
		SearchStudentButton = new javax.swing.JButton();
		AddButton = new javax.swing.JButton();
		RegisterButton = new javax.swing.JButton();
		SeachByStudentLabel = new javax.swing.JLabel();
		SearchByCourseLabel = new javax.swing.JLabel();
		HelpButton = new javax.swing.JButton();
		SearchCourseButton = new javax.swing.JButton();
		DeleteStudentButton = new javax.swing.JButton();
		DeleteCourseButton = new javax.swing.JButton();
		GradeStudentButton = new javax.swing.JButton();
		StudentHistoryButton = new javax.swing.JButton();
		CurrentCoursesButton = new javax.swing.JButton();
		CourseHistoryButton = new javax.swing.JButton();
		CurrentStudentsButton = new javax.swing.JButton();

		/*----------------------------------------------------------------------------------------------------------*/
		/*-------------------------------------------------- BUTTONS! ----------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		SearchStudentButton.setText("Search For Students");
		SearchStudentButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try {
					SearchStudentButtonActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		HelpButton.setText("Help!");
		HelpButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				HelpButtonActionPerformed(evt);
			}
		});

		RegisterButton.setText("Register Student On Course");
		RegisterButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				if(StudentTable.getSelectedRow() > -1 && CourseTable.getSelectedRow() > -1) {
					try {
						RegisterButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a student and a course in order to register it!");
				}
			}
		});

		SearchCourseButton.setText("Search For Courses");
		SearchCourseButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try {
					SearchCourseButtonActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		DeleteStudentButton.setText("Delete Student");
		DeleteStudentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(StudentTable.getSelectedRow() > -1) {
					try {
						DeleteStudentButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a student in order to delete it!");
				}
			}
		});
		DeleteCourseButton.setText("Delete Course");
		DeleteCourseButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				if(CourseTable.getSelectedRow() > -1) {
					try {
						DeleteCourseButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a course in order to delete it!");
				}
			}
		});

		GradeStudentButton.setText("Grade Student");
		GradeStudentButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				if(StudentTable.getSelectedRow() > -1 && CourseTable.getSelectedRow() > -1) {
					try {
						GradeStudentButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a student and a course in order to grade it!");
				}
			}
		});

		StudentHistoryButton.setText("Student History");
		StudentHistoryButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				if(StudentTable.getSelectedRow() > -1) {
					try {
						StudentHistoryButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a student in order to show its course history!");
				}
			}
		});

		CurrentCoursesButton.setText("Current Courses");
		CurrentCoursesButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				if(StudentTable.getSelectedRow() > -1) {
					try {
						CurrentCoursesButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a student in order to show its current courses!");
				}
			}
		});

		CourseHistoryButton.setText("Course History");
		CourseHistoryButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				if(CourseTable.getSelectedRow() > -1) {
					try {
						CourseHistoryButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a course in order to show its student history!");
				}
			}
		});

		CurrentStudentsButton.setText("Current Students");
		CurrentStudentsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(CourseTable.getSelectedRow() > -1) {
					try {
						CurrentStudentsButtonActionPerformed(evt);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You need to select a course in order to show its current students!");
				}
			}
		});

		AddButton.setText("Add Student or Course");
		AddButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AddButtonActionPerformed(evt);
			}
		});

		AddStudentButton.setText("Add Student");
		AddStudentButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try {
					AddStudentButtonActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		ClearStudentButton.setText("Clear Fields");
		ClearStudentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ClearStudentButtonActionPerformed(evt);
			}
		});

		CloseWindow1Button.setText("Close ");
		CloseWindow1Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CloseWindow1ButtonActionPerformed(evt);
			}
		});

		AddCourseButton.setText("Add Course");
		AddCourseButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try {
					AddCourseButtonActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		ClearCourseFieldsButton.setText("Clear Fields");
		ClearCourseFieldsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ClearCourseFieldsButtonActionPerformed(evt);
			}
		});

		CloseWindow2Button.setText("Close");
		CloseWindow2Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CloseWindow2ButtonActionPerformed(evt);
			}
		});

		/*----------------------------------------------------------------------------------------------------------*/
		/*-----------------------------------------------  TEXT FIELDS!  -------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		FNameTextField.setText("First Name");
		FNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		FNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				FNameTextFieldMouseClicked(evt);
			}
		});

		LNameTextField.setText("Last Name");
		LNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		LNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				LNameTextFieldFocusGained(evt);
			}
		});
		SocNmbrTextField.setText("Soc. Nmbr");
		SocNmbrTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		SocNmbrTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt){
				SocNmbrTextFieldFocusGained(evt);
			}
		});

		CourseNameTextField.setText("Course Name");
		CourseNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		CourseNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt){
				CourseNameTextFieldFocusGained(evt);
			}
		});

		CourseCodeTextField.setText("Course Code");
		CourseCodeTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		CourseCodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt){
				CourseCodeTextFieldFocusGained(evt);
			}
		});


		//TEXT FIELDS IN ADD STUDENT WINDOW
		AddFirstNameTextField.setText("First Name");
		AddFirstNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AddFirstNameTextFieldMouseClicked(evt);
			}
		});

		AddLastNameTextField.setText("Last Name");
		AddLastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddLastNameTextFieldFocusGained(evt);
			}
		});

		AddSocNmbrTextField.setText("Social Security Number");
		AddSocNmbrTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddSocNmbrTextFieldFocusGained(evt);
			}
		});

		AddAddressTextField.setText("Address");
		AddAddressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddAddressTextFieldFocusGained(evt);
			}
		});

		AddCityTextField.setText("City");
		AddCityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddCityTextFieldFocusGained(evt);
			}
		});

		AddZipTextField.setText("Zip Code");
		AddZipTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddZipTextFieldFocusGained(evt);
			}
		});

		AddPhoneNmbrTextField.setText("Phone Number");
		AddPhoneNmbrTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddPhoneNmbrTextFieldFocusGained(evt);
			}
		});

		AddEmailTextField.setText("Email");
		AddEmailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddEmailTextFieldFocusGained(evt);
			}
		});

		AddCourseCodeTextField.setText("Course Code");
		AddCourseCodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AddCourseCodeTextFieldMouseClicked(evt);
			}
		});

		AddCourseNameTextField.setText("Course Name");
		AddCourseNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddCourseNameTextFieldFocusGained(evt);
			}
		});

		AddCourseCreditsTextField.setText("Course Credits");
		AddCourseCreditsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddCourseCreditsTextFieldFocusGained(evt);
			}
		});

		/*----------------------------------------------------------------------------------------------------------*/
		/*------------------------------------------------ PANES! --------------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		AddTabbedPane.addTab("Student", StudentsPanel);
		AddTabbedPane.addTab("Course", CoursesPanel);

		/*----------------------------------------------------------------------------------------------------------*/
		/*------------------------------------------------ LABELS! -------------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		StudentLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		StudentLabel.setText("STUDENTS");
		CoursesLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		CoursesLabel.setText("COURSES");
		SeachByStudentLabel.setText("Search by:");
		SearchByCourseLabel.setText("Search by:");

		/*----------------------------------------------------------------------------------------------------------*/
		/*----------------------------------------------- INFO BOX! ------------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		InfoBox.setViewportView(infoBox);

		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------------- STUDENT TABLE! ---------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		StudentTable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
		StudentTable.setModel(StudentModel = new DefaultTableModel(new Object [][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null}},
				new String [] {
				"First Name", "Last Name", "Soc. Number", "Address", "City", "Zip", "Telephone Number", "Email"
		}) { Class[] types = new Class [] {
				java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, 
				java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
		};

		public Class getColumnClass(int columnIndex) {
			return types [columnIndex];
		}});

		StudentTable.getTableHeader().setReorderingAllowed(false);
		StudentTableScrollPane.setViewportView(StudentTable);
		StudentTable.getColumnModel().getColumn(0).setHeaderValue("First Name");
		StudentTable.getColumnModel().getColumn(1).setHeaderValue("Last Name");
		StudentTable.getColumnModel().getColumn(2).setHeaderValue("Soc. Number");
		StudentTable.getColumnModel().getColumn(3).setHeaderValue("Address");
		StudentTable.getColumnModel().getColumn(4).setHeaderValue("City");
		StudentTable.getColumnModel().getColumn(5).setHeaderValue("Zip");
		StudentTable.getColumnModel().getColumn(6).setHeaderValue("Telephone Number");
		StudentTable.getColumnModel().getColumn(7).setHeaderValue("Email");

		StudentTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent evt) {
				isStudentRowSelected = true;
				if(StudentTable.getSelectedRow() > -1 && CourseTable.getSelectedRow() > -1) {	
					try {
						StudentRowSelected(evt);
					} catch (SQLException e) {
						infoBox.setText("Data does not exist,\nno one has taken this course!");
					}
				}
			}
		});

		/*----------------------------------------------------------------------------------------------------------*/
		/*---------------------------------------------- COURSE TABLE! ---------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		CourseTable.setFont(new java.awt.Font("Dialog", 0, 10));
		CourseTable.setModel(CourseModel = new DefaultTableModel(
				new Object [][] {
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null}
				}, new String [] {"Name", "Code", "Credits"}) {

			Class[] types = new Class [] {
					java.lang.String.class, java.lang.String.class, java.lang.Integer.class};

			public Class getColumnClass(int columnIndex) {
				return types [columnIndex];}});

		CourseTableScrollPane.setViewportView(CourseTable);
		CourseTable.getColumnModel().getColumn(0).setHeaderValue("Name");
		CourseTable.getColumnModel().getColumn(1).setHeaderValue("Code");
		CourseTable.getColumnModel().getColumn(2).setHeaderValue("Credits");
		infoBox.setEditable(false);
		infoBox.setColumns(20);
		infoBox.setRows(5);

		CourseTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent evt) {
				isCourseRowSelected = true;
				if(CourseTable.getSelectedRow() > -1) {				
					try {
						CourseRowSelected(evt);
					} catch (SQLException e) {
						infoBox.setText("Data does not exist\nno one has taken this course!");
					}
				}
			}
		});

		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------------- LAYOUTS! ---------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/

		javax.swing.GroupLayout StudentsPanelLayout = new javax.swing.GroupLayout(StudentsPanel);
		StudentsPanel.setLayout(StudentsPanelLayout);
		StudentsPanelLayout.setHorizontalGroup(
				StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(StudentsPanelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(AddFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(AddLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(AddSocNmbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(AddAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(StudentsPanelLayout.createSequentialGroup()
										.addGroup(StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(AddCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(AddZipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(AddPhoneNmbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(AddEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(30, 30, 30)
												.addGroup(StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(CloseWindow1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(ClearStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addContainerGap(179, Short.MAX_VALUE))
				);



		StudentsPanelLayout.setVerticalGroup(
				StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(StudentsPanelLayout.createSequentialGroup()
						.addGap(29, 29, 29)
						.addComponent(AddFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(AddLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(AddSocNmbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(AddAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(AddCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(AddZipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(AddStudentButton))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(AddPhoneNmbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(ClearStudentButton))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(StudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(AddEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(CloseWindow1Button))
												.addContainerGap(24, Short.MAX_VALUE))
				);




		javax.swing.GroupLayout CoursesPanelLayout = new javax.swing.GroupLayout(CoursesPanel);
		CoursesPanel.setLayout(CoursesPanelLayout);
		CoursesPanelLayout.setHorizontalGroup(
				CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(CoursesPanelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(AddCourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(AddCourseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(AddCourseCreditsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursesPanelLayout.createSequentialGroup()
										.addContainerGap(202, Short.MAX_VALUE)
										.addGroup(CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(ClearCourseFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(AddCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(CloseWindow2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(179, 179, 179))
				);




		CoursesPanelLayout.setVerticalGroup(
				CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(CoursesPanelLayout.createSequentialGroup()
						.addGap(29, 29, 29)
						.addComponent(AddCourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(AddCourseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(AddCourseCreditsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
						.addComponent(AddCourseButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(ClearCourseFieldsButton)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(CloseWindow2Button)
						.addGap(25, 25, 25))
				);



		javax.swing.GroupLayout AddDialogLayout = new javax.swing.GroupLayout(AddDialog.getContentPane());
		AddDialog.getContentPane().setLayout(AddDialogLayout);
		AddDialogLayout.setHorizontalGroup(
				AddDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(AddTabbedPane)
				);



		AddDialogLayout.setVerticalGroup(
				AddDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(AddTabbedPane)
				);




		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(4, 4, 4)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addGap(187, 187, 187)
										.addComponent(StudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(FNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(36, 36, 36)
																.addComponent(LNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(SeachByStudentLabel))
																.addGap(31, 31, 31)
																.addComponent(SocNmbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(SearchStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(layout.createSequentialGroup()
																		.addComponent(DeleteStudentButton)
																		.addGap(18, 18, 18)
																		.addComponent(StudentHistoryButton)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(CurrentCoursesButton))
																		.addComponent(StudentTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(layout.createSequentialGroup()
																						.addComponent(DeleteCourseButton)
																						.addGap(11, 11, 11)
																						.addComponent(CourseHistoryButton)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(CurrentStudentsButton))
																						.addComponent(SearchByCourseLabel)
																						.addGroup(layout.createSequentialGroup()
																								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
																												.addComponent(CourseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(CoursesLabel)
																														.addGroup(layout.createSequentialGroup()
																																.addComponent(CourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addGap(25, 25, 25)
																																.addComponent(SearchCourseButton))))
																																.addComponent(CourseTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
																																.addGap(18, 18, 18)
																																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																																		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																																				.addComponent(HelpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																																				.addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
																																				.addComponent(InfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
																																				.addComponent(GradeStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																																				.addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
																																				.addContainerGap(62, Short.MAX_VALUE))
				);




		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(CoursesLabel)
								.addComponent(StudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(SeachByStudentLabel)
										.addComponent(SearchByCourseLabel))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(FNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(SocNmbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(CourseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(SearchStudentButton)
												.addComponent(SearchCourseButton)
												.addComponent(CourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(25, 25, 25)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(InfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(13, 13, 13)
																.addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(GradeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(CourseTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(StudentTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18, 18)
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(DeleteStudentButton)
																		.addComponent(DeleteCourseButton)
																		.addComponent(StudentHistoryButton)
																		.addComponent(CurrentCoursesButton)
																		.addComponent(CurrentStudentsButton)
																		.addComponent(CourseHistoryButton))
																		.addContainerGap(84, Short.MAX_VALUE))
				);
		pack();
	}

	/*----------------------------------------------------------------------------------------------------------*/
	/*----------------------------------------------- METHODS! -------------------------------------------------*/
	/*----------------------------------------------------------------------------------------------------------*/

	private void FNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		FNameTextField.setText("");
	}

	private void LNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		LNameTextField.setText("");
	}

	private void SocNmbrTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		SocNmbrTextField.setText("");
	}

	private void CourseNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		CourseNameTextField.setText("");
	}

	private void CourseCodeTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		CourseCodeTextField.setText("");
	}

	private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
		AddDialog.setVisible(true);
		AddDialog.setSize(350,370);
	}

	private void SearchStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		StudentModel.setRowCount(0); // Clear table!
		infoBox.setText(""); // Clear info box!
		isStudentRowSelected = false; // Clear student logical selection!

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

		CourseModel.setRowCount(0); // Clear table!
		infoBox.setText(""); // Clear info box!
		isCourseRowSelected = false; // Clear course logical selection!

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

	private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(null, "Welcome to SQOOL!\n\n Here's a few tips on how to use this software: \n\n" +
				"The tables for student and courses functions as a source for data aswell \n" +
				"as for interacting with objects. Search for a student, click on it, search for a course,\n" +
				"click on it and then finally select an action such as registering, grading or searching \n" +
				"for the selected objects history or current interactors. \n\n" +
				"Got any more questions? Please contact support@sqool.com. \n\n\n\n\n\n\n\n" +
				"Developed by MOND Consulting AB \n\n" +
				"Dennis Olsson, Olof Kindblad, Nima Masroor, Mattias Rasch");
	}

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
				"Course: "  +courseName+ " with code: " + courseCode + " has been deleted from the system.",
				"Course removed",
				JOptionPane.PLAIN_MESSAGE);

	}

	private void GradeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

		// IMPLEMENT GRADE STUDENT METHOD!
		String studentFirstName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 0);
		String studentLastName = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 1);
		String courseName = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);

		Object[] possibilities = {"---Please Select Grade---", "A", "B", "C", "D", "E", "U"};
		String grade = (String)JOptionPane.showInputDialog(null,
				"Grade Student: \n" + studentFirstName+ " " +studentLastName+ " on course: " + courseName
				+ " with Grade:",
				"Grade Student", JOptionPane.PLAIN_MESSAGE, null, possibilities, null);

		if(grade != null) {

			if(grade.equals("---Please Select Grade---") || grade.equals("")){
				JOptionPane.showMessageDialog(null,
						"That is not a valid grade!",
						"Something went wrong!",
						JOptionPane.ERROR_MESSAGE);
			}

			else if(controller.gradeStudentOnCourseCheckIfTaking(socNmbr, courseCode) == true){
				controller.gradeStudentOnCourseTest(socNmbr, courseCode, grade);
				JOptionPane.showMessageDialog(null,
						"Student: " + studentFirstName+ " "+ studentLastName +" has been graded." ,
						"Success.",
						JOptionPane.PLAIN_MESSAGE);
				CourseModel.setRowCount(0); // REFRESH STUDENTS CURRENT COURSES AFTER GRADE BUTTON IS PRESSED
				CourseTable.setModel(controller.getAllCourses(CourseModel));
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
				CourseTable.setModel(controller.getAllCourses(CourseModel));
			}

			else if (controller.gradeStudentOnCourseCheckIfGradeIsU(socNmbr, courseCode, grade) == false ){
				JOptionPane.showMessageDialog(null,
						"Students can only be regraded if they previously got a U" ,
						"Something went wrong.",
						JOptionPane.PLAIN_MESSAGE);
			}
		}
	}


	private void StudentHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		CourseModel.setRowCount(0); // DELETES ALL ROWS!
		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		CourseTable.setModel(controller.getStudentHistory(socNmbr, CourseModel)); 
	}

	private void CurrentCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		CourseModel.setRowCount(0); // DELETES ALL ROWS!
		String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
		CourseTable.setModel(controller.getActiveCourses(socNmbr, CourseModel)); 	
	}

	private void CourseHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		StudentModel.setRowCount(0); // DELETES ALL ROWS!
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		StudentTable.setModel(controller.getCourseHistory(courseCode, StudentModel)); 
	}

	private void CurrentStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{
		StudentModel.setRowCount(0); // DELETES ALL ROWS!
		String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
		StudentTable.setModel(controller.getActiveStudents(courseCode, StudentModel)); 
	}

	private void StudentRowSelected(ListSelectionEvent evt) throws SQLException {

		if(isCourseRowSelected == true) {

			String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
			String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
			Integer gradeAPercentage = controller.getHighGradePercentage(courseCode);
			Integer courseThroughput = controller.getCourseThroughput(courseCode);
			String grade = controller.getStudentResult(socNmbr, courseCode, StudentModel);
			infoBox.setText("Students with grade A: " + gradeAPercentage + "% \n\n" +
					"Course throughput: " + courseThroughput + " % \n\n" +
					"Student (" + socNmbr + ") has grade: \n\n" + grade);
		} 
	}

	private void CourseRowSelected(ListSelectionEvent evt) throws SQLException {
		
		if(isStudentRowSelected == true) {

			String socNmbr = (String)StudentTable.getValueAt(StudentTable.getSelectedRow(), 2);
			String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
			Integer gradeAPercentage = controller.getHighGradePercentage(courseCode);
			Integer courseThroughput = controller.getCourseThroughput(courseCode);
			String grade = controller.getStudentResult(socNmbr, courseCode, StudentModel);
			infoBox.setText("Students with grade A: " + gradeAPercentage + "% \n\n" +
					"Course throughput: " + courseThroughput + " % \n\n" +
					"Student (" + socNmbr + ") has grade: \n\n" + grade);
		}

		else {

			String courseCode = (String)CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
			Integer gradeAPercentage = controller.getHighGradePercentage(courseCode);
			Integer courseThroughput = controller.getCourseThroughput(courseCode);
			infoBox.setText("Students with grade A: " + gradeAPercentage + "%" + "\n\n" +
					"Course throughput: " + courseThroughput + "%"); 
		}
	}

	private void CloseWindow1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//CLOSES ADD STUDENT OR COURSE WINDOW FROM STUDENT TAB
		AddDialog.setVisible(false);
	}

	private void CloseWindow2ButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//CLOSES ADD STUDENT OR COURSE WINDOW FROM COURSE TAB
		AddDialog.setVisible(false);
	}

	private void ClearStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//CLEAR ALL FIELDS IN ADD STUDENT TAB
		AddFirstNameTextField.setText("First Name");
		AddLastNameTextField.setText("Last Name");
		AddSocNmbrTextField.setText("Social Security Number");
		AddAddressTextField.setText("Address");
		AddCityTextField.setText("City");
		AddZipTextField.setText("Zip Code");
		AddPhoneNmbrTextField.setText("Telephone Number");
		AddEmailTextField.setText("Email");
	}

	private void ClearCourseFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//CLEAR ALL FIELDS IN ADD COURSE TAB
		AddCourseCodeTextField.setText("Course Code");
		AddCourseNameTextField.setText("Course Name");
		AddCourseCreditsTextField.setText("Course Credits");
	}

	private void AddFirstNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		//CLEARS FIRST NAME FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddFirstNameTextField.setText("");
	}

	private void AddLastNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS LAST NAME FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddLastNameTextField.setText("");
	}

	private void AddSocNmbrTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS SOCIAL SECURITY NUMBER FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddSocNmbrTextField.setText("");
	}

	private void AddAddressTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS ADDRESS FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddAddressTextField.setText("");
	}

	private void AddCityTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS CITY FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddCityTextField.setText("");
	}

	private void AddZipTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS ZIP CODE FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddZipTextField.setText("");
	}

	private void AddPhoneNmbrTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS PHONE NUMBER FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddPhoneNmbrTextField.setText("");
	}

	private void AddEmailTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS EMAIL FIELD IN ADD STUDENT TAB WHEN FOCUSED
		AddEmailTextField.setText("");
	}

	private void AddCourseCodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
		//CLEARS COURSE CODE FIELD IN ADD COURSE WHEN FOCUSED
		AddCourseCodeTextField.setText("");
	}

	private void AddCourseNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS COURSE NAME FIELD IN ADD COURSE WHEN FOCUSED
		AddCourseNameTextField.setText("");
	}

	private void AddCourseCreditsTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS COURSE CREDITS FIELD IN ADD COURSE WHEN FOCUSED
		AddCourseCreditsTextField.setText("");
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


		try {
			Integer.parseInt(courseCredits);
			System.out.println("An integer");
		}
		catch (NumberFormatException e) {
			System.out.println("inte en int");
		}

		if(		AddCourseCodeTextField.getText().equals("") || AddCourseCodeTextField.getText().equals("Course Code") ||
				AddCourseNameTextField.getText().equals("") || AddCourseNameTextField.getText().equals("Course Name") ||
				AddCourseCreditsTextField.getText().equals("") || AddCourseCreditsTextField.getText().equals("Course Credits")) {

			JOptionPane.showMessageDialog(null, "Make sure You filled out the form correctly.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
		}



		if(credits > 30 || credits < 1){
			JOptionPane.showMessageDialog(null, "A course can not be greater than 30 credits or less than 1.","Something went wrong.", JOptionPane.ERROR_MESSAGE);
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

	/*----------------------------------------------------------------------------------------------------------*/
	/*------------------------------------------- OBJECT CREATION! ---------------------------------------------*/
	/*----------------------------------------------------------------------------------------------------------*/

	private javax.swing.JFormattedTextField AddAddressTextField;
	private javax.swing.JButton AddButton;
	private javax.swing.JFormattedTextField AddCityTextField;
	private javax.swing.JButton AddCourseButton;
	private javax.swing.JFormattedTextField AddCourseCodeTextField;
	private javax.swing.JFormattedTextField AddCourseCreditsTextField;
	private javax.swing.JFormattedTextField AddCourseNameTextField;
	private javax.swing.JDialog AddDialog;
	private javax.swing.JFormattedTextField AddEmailTextField;
	private javax.swing.JFormattedTextField AddFirstNameTextField;
	private javax.swing.JFormattedTextField AddLastNameTextField;
	private javax.swing.JFormattedTextField AddPhoneNmbrTextField;
	private javax.swing.JFormattedTextField AddSocNmbrTextField;
	private javax.swing.JButton AddStudentButton;
	private javax.swing.JTabbedPane AddTabbedPane;
	private javax.swing.JFormattedTextField AddZipTextField;
	private javax.swing.JButton ClearCourseFieldsButton;
	private javax.swing.JButton ClearStudentButton;
	private javax.swing.JButton CloseWindow1Button;
	private javax.swing.JButton CloseWindow2Button;
	private javax.swing.JFormattedTextField CourseCodeTextField;
	private javax.swing.JButton CourseHistoryButton;
	private javax.swing.JFormattedTextField CourseNameTextField;
	private javax.swing.JTable CourseTable;
	private javax.swing.JScrollPane CourseTableScrollPane;
	private javax.swing.JLabel CoursesLabel;
	private javax.swing.JPanel CoursesPanel;
	private javax.swing.JButton CurrentCoursesButton;
	private javax.swing.JButton CurrentStudentsButton;
	private javax.swing.JButton DeleteCourseButton;
	private javax.swing.JButton DeleteStudentButton;
	private javax.swing.JFormattedTextField FNameTextField;
	private javax.swing.JButton GradeStudentButton;
	private javax.swing.JScrollPane InfoBox;
	private javax.swing.JFormattedTextField LNameTextField;
	private javax.swing.JButton RegisterButton;
	private javax.swing.JLabel SeachByStudentLabel;
	private javax.swing.JLabel SearchByCourseLabel;
	private javax.swing.JButton SearchCourseButton;
	private javax.swing.JButton SearchStudentButton;
	private javax.swing.JFormattedTextField SocNmbrTextField;
	private javax.swing.JButton StudentHistoryButton;
	private javax.swing.JLabel StudentLabel;
	private javax.swing.JTable StudentTable;
	private javax.swing.JScrollPane StudentTableScrollPane;
	private javax.swing.JPanel StudentsPanel;
	private javax.swing.JButton HelpButton;
	private javax.swing.JTextArea infoBox;
}
