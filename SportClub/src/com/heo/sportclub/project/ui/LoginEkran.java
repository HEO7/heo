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
		lblkullaniciadi.setBounds(45, 57, 89, 14);
		getContentPane().add(lblkullaniciadi);
		
		JLabel lblifre = new JLabel("\u015Eifre");
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblifre.setForeground(new Color(255, 255, 255));
		lblifre.setBounds(45, 105, 46, 14);
		getContentPane().add(lblifre);
		
		txtusername = new JTextField();
		txtusername.setBounds(130, 54, 86, 20);
		getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(130, 102, 86, 20);
		getContentPane().add(txtpassword);
		txtpassword.setColumns(10);
		
		
		
		JButton btnGiri = new JButton("  Giri\u015F");
		btnGiri.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/Login-icon.png")));
		
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen ms = new MainScreen();
				ms.setVisible(true);
			}
		});
		btnGiri.setBounds(10, 264, 98, 36);
		getContentPane().add(btnGiri);
		
		JButton btnk = new JButton("\u00C7\u0131k\u0131\u015F");
		btnk.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/sign-error-icon.png")));
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnk.setBounds(176, 264, 98, 36);
		getContentPane().add(btnk);
		
		JButton btnnodb = new JButton("NoDb");
		btnnodb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NoDbmain nd = new NoDbmain();
				nd.setVisible(true);
				
			}
		});
		btnnodb.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/nodb.png")));
		btnnodb.setBounds(92, 228, 98, 36);
		getContentPane().add(btnnodb);
		
		JLabel lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/user1.png")));
		lblUser.setBounds(10, 44, 36, 40);
		getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/password.png")));
		lblPassword.setBounds(10, 96, 36, 33);
		getContentPane().add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("arkaplan");
		lblNewLabel.setIcon(new ImageIcon(LoginEkran.class.getResource("/images/sport-club.jpg")));
		lblNewLabel.setBounds(0, 0, 284, 311);
		getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
	}
}
