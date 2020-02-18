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
import javax.swing.JTextField;

public class MainScreen extends JFrame {
	private JTable tableuye;
	private JTextField textField;
	
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
		
		JMenuItem mnýtmuyekayit = new JMenuItem("\u00DCYE KAYIT");
		mnMenu.add(mnýtmuyekayit);
		
		JMenuItem mnýtmPersonelKayt = new JMenuItem("PERSONEL KAYIT");
		mnMenu.add(mnýtmPersonelKayt);
		
		JMenuItem mnýtmAntrenmanProgram = new JMenuItem("ANTRENMAN PROGRAMI");
		mnMenu.add(mnýtmAntrenmanProgram);
		
		JMenuItem mnýtmk = new JMenuItem("\u00C7IKI\u015E");
		mnMenu.add(mnýtmk);
		
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
		
		JButton btncýkýs = new JButton("\u00C7IKI\u015E");
		btncýkýs.setBounds(456, 486, 89, 23);
		getContentPane().add(btncýkýs);
		
		JLabel lbluyeAra = new JLabel("\u00DCye Ara");
		lbluyeAra.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbluyeAra.setForeground(new Color(255, 255, 255));
		lbluyeAra.setBounds(461, 11, 46, 14);
		getContentPane().add(lbluyeAra);
		
		textField = new JTextField();
		textField.setBounds(408, 31, 166, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAra = new JButton("Ara");
		btnAra.setBounds(441, 62, 89, 23);
		getContentPane().add(btnAra);
		
	}
}
