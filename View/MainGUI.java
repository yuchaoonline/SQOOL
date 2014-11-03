package View;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controller.Controller;

@SuppressWarnings("serial")
public class MainGUI extends javax.swing.JFrame {
	
	Controller controller;
	DefaultTableModel StudentModel;
	DefaultTableModel CourseModel;
	
	public MainGUI() throws SQLException {
		initializeComponents();
	
		controller = new Controller();
		
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
		jTextArea1 = new javax.swing.JTextArea();
		SearchStudentButton = new javax.swing.JButton();
		AddButton = new javax.swing.JButton();
		RegisterButton = new javax.swing.JButton();
		SeachByStudentLabel = new javax.swing.JLabel();
		SearchByCourseLabel = new javax.swing.JLabel();
		UpdateButton = new javax.swing.JButton();
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
		
		UpdateButton.setText("Update");
		UpdateButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				UpdateButtonActionPerformed(evt);
			}
		});
		
		RegisterButton.setText("Register Student On Course");
		RegisterButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				RegisterButtonActionPerformed(evt);
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
		DeleteStudentButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				DeleteStudentButtonActionPerformed(evt);
			}
		});
		DeleteCourseButton.setText("Delete Course");
		DeleteCourseButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				DeleteCourseButtonActionPerformed(evt);
			}
		});
		
		GradeStudentButton.setText("Grade Student");
		GradeStudentButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				GradeStudentButtonActionPerformed(evt);
			}
		});
		
		StudentHistoryButton.setText("Student History");
		StudentHistoryButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				StudentHistoryButtonActionPerformed(evt);
			}
		});
		
		CurrentCoursesButton.setText("Current Courses");
		CurrentCoursesButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				CurrentCoursesButtonActionPerformed(evt);
			}
		});
		
		CourseHistoryButton.setText("Course History");
		CourseHistoryButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				CourseHistoryButtonActionPerformed(evt);
			}
		});
		
		CurrentStudentsButton.setText("Current Students");
		CurrentStudentsButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				CurrentStudentsButtonActionPerformed(evt);
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
				AddStudentButtonActionPerformed(evt);
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
				AddCourseButtonActionPerformed(evt);
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

		AddFirstNameTextField.setText("First Name");
		AddFirstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddFirstNameTextFieldFocusGained(evt);
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
		AddCourseCodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				AddCourseCodeTextFieldFocusGained(evt);
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
		
		InfoBox.setViewportView(jTextArea1);

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
            }
        });
        
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
		 jTextArea1.setEditable(false);
		 jTextArea1.setColumns(20);
		 jTextArea1.setRows(5);
		
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
																																				.addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
																.addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
		// CLEARS FIRST NAME SEARCH FIELD WHEN CLICKED BC FOCUSED ON START
		FNameTextField.setText("");
	}
	
	private void LNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS LAST NAME SEARCH FIELD IN MAIN WINDOW WHEN FOCUSED
		LNameTextField.setText("");
	}
	
	private void SocNmbrTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS SOCIAL SECURITY NUMBER SEARCH FIELD IN MAIN WINDOW WHEN FOCUSED
		SocNmbrTextField.setText("");
	}
	
	private void CourseNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS COURSE NAME SEARCH FIELD IN MAIN WINDOW WHEN FOCUSED
		CourseNameTextField.setText("");
	}
	
	private void CourseCodeTextFieldFocusGained(java.awt.event.FocusEvent evt) {
		//CLEARS COURSE CODE SEARCH FIELD IN MAIN WINDOW WHEN FOCUSED
		CourseCodeTextField.setText("");
	}
	
	private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//OPENS ADD STUDENT OR COURSE WINDOW
		AddDialog.setVisible(true);
		AddDialog.setSize(350,350);
	}
	
	private void SearchStudentButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		
		StudentModel.setRowCount(0); // DELETES ALL ROWS!
		
		if(SocNmbrTextField.getText().equals("") || SocNmbrTextField.getText().equals("Soc. Nmbr")) {
			StudentTable.setModel(controller.getAllStudents(StudentModel)); 
		}
		
		else {
			String socNmbr = SocNmbrTextField.getText();
			StudentTable.setModel(controller.getStudent(socNmbr, StudentModel)); 
		}
	}
	
	private void SearchCourseButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		
		CourseModel.setRowCount(0); // DELETES ALL ROWS!
		
		if(CourseCodeTextField.getText().equals("") || CourseCodeTextField.getText().equals("Course Code")) {
			CourseTable.setModel(controller.getAllCourses(CourseModel)); 
		}
		
		else {
			String courseCode = CourseCodeTextField.getText();
			CourseTable.setModel(controller.getCourse(courseCode, CourseModel)); 
		}
		
	}
	
	private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// NOT IMPLEMENTED!
	}
	
	private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {
	
		// IMPLEMENT REGISTER STUDENT METHOD!
	
	}
	
	private void DeleteStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {
		
		// IMPLEMENT DELETE STUDENT METHOD!
	
	}
	
	private void DeleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt){

		// IMPLEMENT DELETE STUDENT METHOD!
		
	}
	
	private void GradeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {
		
		// IMPLEMENT GRADE STUDENT METHOD!

	}
	
	private void StudentHistoryButtonActionPerformed(java.awt.event.ActionEvent evt){
		
		// IMPLEMENT STUDENT HISTORY METHOD!
	
	}
	
	private void CurrentCoursesButtonActionPerformed(java.awt.event.ActionEvent evt){
		//INSERT ACTION FOR CURRENT COURSES BUTTON
	}
	
	private void CourseHistoryButtonActionPerformed(java.awt.event.ActionEvent evt){

		
		
		
		
	}
	
	private void CurrentStudentsButtonActionPerformed(java.awt.event.ActionEvent evt){
		//INSERT ACTION FOR CURRENT STUDENTS BUTTON
	}
	
	//METHODS IN ADD STUDENT OR COURSE WINDOW
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
	
	private void AddFirstNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {
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
	
	private void AddCourseCodeTextFieldFocusGained(java.awt.event.FocusEvent evt) {
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
	
	private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt){
		//INSERT ACTION FOR ADD STUDENT BUTTON
	}
	
	private void AddCourseButtonActionPerformed(java.awt.event.ActionEvent evt){
		//INSERT ACTION FOR ADD COURSE BUTTON
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
	private javax.swing.JButton UpdateButton;
	private javax.swing.JTextArea jTextArea1;
	
}
