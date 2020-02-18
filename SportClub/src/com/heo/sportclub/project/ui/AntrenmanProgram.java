package com.heo.sportclub.project.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AntrenmanProgram extends JFrame {

	

	public AntrenmanProgram() {

		
		initialize();

	}

	private void initialize() {

		setTitle("ANTRENMAN PROGRAMLARI");
		setBounds(700, 250, 600, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));

		JButton btnProgram = new JButton("Program-1");
		btnProgram.setBounds(0, 0, 89, 23);
		getContentPane().add(btnProgram);

		JButton btnProgram_1 = new JButton("Program-2");
		btnProgram_1.setBounds(93, 0, 89, 23);
		getContentPane().add(btnProgram_1);

		JButton btnProgram_2 = new JButton("Program-3");
		btnProgram_2.setBounds(186, 0, 89, 23);
		getContentPane().add(btnProgram_2);

	}
}
