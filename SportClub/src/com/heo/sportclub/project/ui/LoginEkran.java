package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginEkran extends JFrame {
	private JTextField txtusername;
	private JTextField txtpassword;
	private ImageIcon giris;
	
	public LoginEkran() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginEkran.class.getResource("/images/sport-club-logo.jpg")));
		
		initialize();
		
		
	}

	private void initialize() {
		
		setTitle("Spor Salonu Otomasyonu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 381);
		setBounds(700, 250, 300, 350);
		getContentPane().setLayout(null);
		
		JLabel lblkullaniciadi = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblkullaniciadi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblkullaniciadi.setBackground(new Color(255, 255, 255));
		lblkullaniciadi.setForeground(new Color(255, 255, 255));
		lblkullaniciadi.setBounds(10, 57, 89, 14);
		getContentPane().add(lblkullaniciadi);
		
		JLabel lblifre = new JLabel("\u015Eifre");
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblifre.setForeground(new Color(255, 255, 255));
		lblifre.setBounds(10, 105, 46, 14);
		getContentPane().add(lblifre);
		
		txtusername = new JTextField();
		txtusername.setBounds(113, 54, 86, 20);
		getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(113, 102, 86, 20);
		getContentPane().add(txtpassword);
		txtpassword.setColumns(10);
		
		
		
		JButton btnGiri = new JButton("Giri\u015F");
		
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen ms = new MainScreen();
				ms.setVisible(true);
			}
		});
		btnGiri.setBounds(10, 264, 89, 23);
		getContentPane().add(btnGiri);
		
		JButton btnk = new JButton("\u00C7\u0131k\u0131\u015F");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnk.setBounds(185, 264, 89, 23);
		getContentPane().add(btnk);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/sport-club.jpg")));
		lblNewLabel.setBounds(0, 0, 295, 323);
		getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
	}
}
