import java.awt.event.MouseAdapter;


public class FiskRensAvKodis extends javax.swing.JFrame {

	public FiskRensAvKodis() {

    	initComponents();
        
    }

    private void initComponents() {//GEN-BEGIN:initComponents

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
        StudentTable = new javax.swing.JTable();
        CourseTableScrollPane = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
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
        
        
        
        
        //BUTTONS//
        SearchStudentButton.setText("Search For Students");
        SearchStudentButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		SearchStudentButtonActionPerformed(evt);
        	}
        };

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		UpdateButtonActionPerformed(evt);
        	}
        };

        RegisterButton.setText("Register Student On Course");
        RegisterButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		RegisterButtonActionPerformed(evt);
        	}
        };
        
        AddStudentButton.setText("Add Student");
        AddStudentButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		AddStudentButtonActionPerformed(evt);
        	}
        };
        
        AddCourseButton.setText("Add Course");
        AddCourseButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		AddCourseButtonActionPerformed(evt);
        	}
        };

        SearchCourseButton.setText("Search For Courses");
        SearchCourseButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		SearchCourseButtonActionPerformed(evt);
        	}
        };

        DeleteStudentButton.setText("Delete Student");
        DeleteStudentButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		DeleteStudentButtonActionPerformed(evt);
        	}
        };

        DeleteCourseButton.setText("Delete Course");
        DeleteCourseButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		DeleteCourseButtonActionPerformed(evt);
        	}
        };

        GradeStudentButton.setText("Grade Student");
        GradeStudentButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		GradeStudentButtonActionPerformed(evt);
        	}
        };

        StudentHistoryButton.setText("Student History");
        StudentHistoryButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		StudentHistoryButtonActionPerformed(evt);
        	}
        };
        CurrentCoursesButton.setText("Current Courses");
        CurrentCoursesButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		CurrentCoursesButtonActionPerformed(evt);
        	}
        };

        CourseHistoryButton.setText("Course History");
        CourseHistoryButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		CourseHistoryButtonActionPerformed(evt);
        	}
        };

        CurrentStudentsButton.setText("Current Students");
        CurrentStudentsButton.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt){
        		CurrentStudentsButtonActionPerformed(evt);
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
        
        AddButton.setText("Add Student or Course");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        
        //END BUTTONS//

        //TEXT FIELDS//
        AddFirstNameTextField.setText("First Name");
        AddFirstNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFirstNameTextFieldMouseClicked(evt);
            }
        });

        AddLastNameTextField.setText("Last Name");
        AddLastNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLastNameTextFieldMouseClicked(evt);
            }
        });

        AddSocNmbrTextField.setText("Social Security Number");
        AddSocNmbrTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSocNmbrTextFieldMouseClicked(evt);
            }
        });
        AddSocNmbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSocNmbrTextFieldActionPerformed(evt);
            }
        });

        AddAddressTextField.setText("Address");
        AddAddressTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAddressTextFieldMouseClicked(evt);
            }
        });

        AddCityTextField.setText("City");
        AddCityTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCityTextFieldMouseClicked(evt);
            }
        });

        AddZipTextField.setText("Zip Code");
        AddZipTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddZipTextFieldMouseClicked(evt);
            }
        });

        AddPhoneNmbrTextField.setText("Phone Number");
        AddPhoneNmbrTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPhoneNmbrTextFieldMouseClicked(evt);
            }
        });

        AddEmailTextField.setText("Email");
        AddEmailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmailTextFieldMouseClicked(evt);
            }
        });

        AddCourseCodeTextField.setText("Course Code");
        AddCourseCodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCourseCodeTextFieldMouseClicked(evt);
            }
        });

        AddCourseNameTextField.setText("Course Name");
        AddCourseNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCourseNameTextFieldMouseClicked(evt);
            }
        });

        AddCourseCreditsTextField.setText("Course Credits");
        AddCourseCreditsTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCourseCreditsTextFieldMouseClicked(evt);
            }
        });
        

        FNameTextField.setText("First Name");
        FNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        FNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FNameTextFieldMouseClicked(evt);
            }
        });
        FNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTextFieldActionPerformed(evt);
            }
        });

        LNameTextField.setText("Last Name");
        LNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LNameTextFieldFocusGained(evt);
            }
        });
        LNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LNameTextFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LNameTextFieldMouseEntered(evt);
            }
        });

        SocNmbrTextField.setText("Soc. Nmbr");
        SocNmbrTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        SocNmbrTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SocNmbrTextFieldMouseClicked(evt);
            }
        });

        CourseNameTextField.setText("Course Name");
        CourseNameTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CourseNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseNameTextFieldMouseClicked(evt);
            }
        });

        CourseCodeTextField.setText("Code");
        CourseCodeTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CourseCodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseCodeTextFieldMouseClicked(evt);
            }
        });
        
        //END TEXT FIELDS//
        
        //PANES//
        
        AddTabbedPane.addTab("Student", StudentsPanel);
        AddTabbedPane.addTab("Course", CoursesPanel);
        
        // END PANES//
        
        //LABELS//
        StudentLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        StudentLabel.setText("STUDENTS");

        CoursesLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CoursesLabel.setText("COURSES");
        
        SeachByStudentLabel.setText("Search by:");

        SearchByCourseLabel.setText("Search by:");

        //END LABELS//
        
        //INFO BOX//
        InfoBox.setViewportView(jTextArea1);
        
        //END INFO BOX//
        
        //PANELS//
     


        //END PANELS//
        
        //TABLES//

        StudentTable.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Soc. Number", "Address", "City", "Zip", "Telephone Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
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
            },
            new String [] {
                "Name", "Code", "Credits"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CourseTableScrollPane.setViewportView(CourseTable);
        CourseTable.getColumnModel().getColumn(0).setHeaderValue("Name");
        CourseTable.getColumnModel().getColumn(1).setHeaderValue("Code");
        CourseTable.getColumnModel().getColumn(2).setHeaderValue("Credits");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        
        //END TABLES//
        // PANELS//
        
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

        
        //END STUDENTS PANEL//
        
        //COURSES PANEL//
        
       
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
        
        //END COURSES PANEL//
        

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
                                        .addComponent(CourseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-END:initComponents

    
    
    private void FNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTextFieldActionPerformed

    private void AddSocNmbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSocNmbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddSocNmbrTextFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        AddDialog.setVisible(true);
        AddDialog.setSize(350,350);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CloseWindow1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseWindow1ButtonActionPerformed
        // TODO add your handling code here:
        AddDialog.setVisible(false);
    }//GEN-LAST:event_CloseWindow1ButtonActionPerformed

    private void CloseWindow2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseWindow2ButtonActionPerformed
        // TODO add your handling code here:
        AddDialog.setVisible(false);
    }//GEN-LAST:event_CloseWindow2ButtonActionPerformed

    private void ClearStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearStudentButtonActionPerformed
        // TODO add your handling code here:
        AddFirstNameTextField.setText("First Name");
        AddLastNameTextField.setText("Last Name");
        AddSocNmbrTextField.setText("Social Security Number");
        AddAddressTextField.setText("Address");
        AddCityTextField.setText("City");
        AddZipTextField.setText("Zip Code");
        AddPhoneNmbrTextField.setText("Telephone Number");
        AddEmailTextField.setText("Email");
    }//GEN-LAST:event_ClearStudentButtonActionPerformed

    private void ClearCourseFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCourseFieldsButtonActionPerformed
        // TODO add your handling code here:
        AddCourseCodeTextField.setText("Course Code");
        AddCourseNameTextField.setText("Course Name");
        AddCourseCreditsTextField.setText("Course Credits");
    }//GEN-LAST:event_ClearCourseFieldsButtonActionPerformed

    private void AddFirstNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFirstNameTextFieldMouseClicked
        // TODO add your handling code here:
        
            AddFirstNameTextField.setText("");
          
    
    }//GEN-LAST:event_AddFirstNameTextFieldMouseClicked

    private void AddLastNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLastNameTextFieldMouseClicked
        // TODO add your handling code here:
            AddLastNameTextField.setText("");
    }//GEN-LAST:event_AddLastNameTextFieldMouseClicked

    private void AddSocNmbrTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSocNmbrTextFieldMouseClicked
            AddSocNmbrTextField.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_AddSocNmbrTextFieldMouseClicked

    private void AddAddressTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAddressTextFieldMouseClicked
        // TODO add your handling code here:
            AddAddressTextField.setText("");
    }//GEN-LAST:event_AddAddressTextFieldMouseClicked

    private void AddCityTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCityTextFieldMouseClicked
        // TODO add your handling code here:
            AddCityTextField.setText("");
    }//GEN-LAST:event_AddCityTextFieldMouseClicked

    private void AddZipTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddZipTextFieldMouseClicked
        // TODO add your handling code here:
            AddZipTextField.setText("");
    }//GEN-LAST:event_AddZipTextFieldMouseClicked

    private void AddPhoneNmbrTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPhoneNmbrTextFieldMouseClicked
        // TODO add your handling code here:
            AddPhoneNmbrTextField.setText("");
    }//GEN-LAST:event_AddPhoneNmbrTextFieldMouseClicked

    private void AddEmailTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmailTextFieldMouseClicked
        // TODO add your handling code here:
            AddEmailTextField.setText("");
    }//GEN-LAST:event_AddEmailTextFieldMouseClicked

    private void AddCourseCodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCourseCodeTextFieldMouseClicked
        // TODO add your handling code here:
            AddCourseCodeTextField.setText("");
    }//GEN-LAST:event_AddCourseCodeTextFieldMouseClicked

    private void AddCourseNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCourseNameTextFieldMouseClicked
        // TODO add your handling code here:
            AddCourseNameTextField.setText("");
    }//GEN-LAST:event_AddCourseNameTextFieldMouseClicked

    private void AddCourseCreditsTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCourseCreditsTextFieldMouseClicked
        // TODO add your handling code here:
            AddCourseCreditsTextField.setText("");
    }//GEN-LAST:event_AddCourseCreditsTextFieldMouseClicked

    private void FNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FNameTextFieldMouseClicked
        // TODO add your handling code here:
            FNameTextField.setText("");
    }//GEN-LAST:event_FNameTextFieldMouseClicked

    private void LNameTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LNameTextFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTextFieldMouseEntered

    private void LNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LNameTextFieldMouseClicked
        // TODO add your handling code here:
            
    }//GEN-LAST:event_LNameTextFieldMouseClicked

    private void SocNmbrTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocNmbrTextFieldMouseClicked
        // TODO add your handling code here:
            SocNmbrTextField.setText("");
    }//GEN-LAST:event_SocNmbrTextFieldMouseClicked

    private void CourseNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseNameTextFieldMouseClicked
        // TODO add your handling code here:
            CourseNameTextField.setText("");
    }//GEN-LAST:event_CourseNameTextFieldMouseClicked

    private void CourseCodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseCodeTextFieldMouseClicked
        // TODO add your handling code here:
            CourseCodeTextField.setText("");
    }//GEN-LAST:event_CourseCodeTextFieldMouseClicked

    private void LNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LNameTextFieldFocusGained
        // TODO add your handling code here:
            LNameTextField.setText("");
    }//GEN-LAST:event_LNameTextFieldFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FiskRensAvKodis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiskRensAvKodis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiskRensAvKodis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiskRensAvKodis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiskRensAvKodis().setVisible(true);
            }
            
            
            
        });
   
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    
    
    
}
