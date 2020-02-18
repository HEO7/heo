package com.heo.sportclub.project.ui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class LoginEkran extends JFrame {
	private JTextField txtusername;
	private JTextField txtpassword;
	
	public LoginEkran() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\halil.ozcan\\git\\heo\\SportClub\\img\\icon.jpg"));
	
		
		initialize();
		
		
	}

	private void initialize() {
		
		setTitle("Spor Salonu Otomasyonu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 350);
		setBounds(700, 250, 300, 350);
		getContentPane().setLayout(null);
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		
			
		
	
		getContentPane().setBackground(new Color(0, 153, 153));
		
		JButton btnIptal = new JButton("\u0130ptal");
		btnIptal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnIptal.setBounds(158, 247, 89, 23);
		getContentPane().add(btnIptal);
		
		JButton btnGiris = new JButton("Giri\u015F");
		btnGiris.setBounds(31, 247, 89, 23);
		getContentPane().add(btnGiris);
		
		JLabel lblusername = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblusername.setForeground(UIManager.getColor("ToolBar.highlight"));
		lblusername.setBackground(new Color(204, 51, 0));
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblusername.setBounds(10, 57, 89, 14);
		getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("\u015Eifre");
		lblpassword.setForeground(UIManager.getColor("ToolBar.highlight"));
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblpassword.setBounds(10, 105, 46, 14);
		getContentPane().add(lblpassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(118, 55, 111, 20);
		getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(118, 102, 111, 20);
		getContentPane().add(txtpassword);
		txtpassword.setColumns(10);
		
		
	}
}
