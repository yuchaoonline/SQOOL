package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Controller.*;

public class MainGUI {

	Controller controller;
	
	public MainGUI() {
	
	Controller controller = new Controller();
		
	initiateGUI();
	
	}
	
	public void initiateGUI() {
		
		JFrame window = new JFrame("SQOOL Management System");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.pack();
		window.setExtendedState( window.getExtendedState()|JFrame.MAXIMIZED_BOTH );
		window.setVisible(true);
		
	}
	
	
}
