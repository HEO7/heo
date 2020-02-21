package com.heo.sportclub.project.ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Personel extends JFrame {
	private JTable pertable;
	
	public Personel() {
		
		initialize();
	}

	private void initialize() {
		setTitle("Personeller");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(700, 250, 500, 400);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 464, 300);
		getContentPane().add(scrollPane);
		
		pertable = new JTable();
		scrollPane.setViewportView(pertable);
		
	}
}
