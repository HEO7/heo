package com.heo.sportclub.project.ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen extends JFrame {
	private JTable tableuye;
	
	public MainScreen() {
		
		
		initialize();
		
	}

	private void initialize() {
		setTitle("Spor Salonu Otomasyonu");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(700, 250, 600, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 43, 28);
		getContentPane().add(menuBar);
		
		JMenu mnMenu = new JMenu("MEN\u00DC");
		mnMenu.setBackground(new Color(0, 153, 153));
		mnMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnMenu);
		
		JMenuItem mn�tmuyekayit = new JMenuItem("\u00DCYE KAYIT");
		mnMenu.add(mn�tmuyekayit);
		
		JMenuItem mn�tmPersonelKayt = new JMenuItem("PERSONEL KAYIT");
		mnMenu.add(mn�tmPersonelKayt);
		
		JMenuItem mn�tmAntrenmanProgram = new JMenuItem("ANTRENMAN PROGRAMI");
		mnMenu.add(mn�tmAntrenmanProgram);
		
		JMenuItem mn�tmk = new JMenuItem("\u00C7IKI\u015E");
		mnMenu.add(mn�tmk);
		
		JLabel lbluyeler = new JLabel("\u00DCYELER");
		lbluyeler.setForeground(new Color(204, 255, 51));
		lbluyeler.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbluyeler.setBounds(257, 99, 75, 14);
		getContentPane().add(lbluyeler);
		
		JScrollPane scrpuye = new JScrollPane();
		scrpuye.setBounds(10, 124, 564, 340);
		getContentPane().add(scrpuye);
		
		tableuye = new JTable();
		tableuye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrpuye.setViewportView(tableuye);
		
		JButton btnuyesil = new JButton("\u00DCye Sil");
		btnuyesil.setBounds(334, 486, 89, 23);
		getContentPane().add(btnuyesil);
		
		JButton btnc�k�s = new JButton("\u00C7IKI\u015E");
		btnc�k�s.setBounds(456, 486, 89, 23);
		getContentPane().add(btnc�k�s);
		
	}
}
