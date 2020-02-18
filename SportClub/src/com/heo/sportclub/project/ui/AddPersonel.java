package com.heo.sportclub.project.ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class AddPersonel extends JFrame {
	private JTextField txtusername;
	private JTextField txtpassword;
	private JTextField txtname;
	private JTextField txtsurname;
	private JTextField txtphone;
	private JTextField txtidentify;
	private JTextField txtbolum;
	
	public AddPersonel() {
		
		initialize();
	}

	private void initialize() {
		setTitle("PERSONEL EKLE");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(700, 250, 300, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblKullancAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKullancAd.setForeground(new Color(255, 255, 255));
		lblKullancAd.setBounds(10, 11, 82, 14);
		getContentPane().add(lblKullancAd);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setForeground(Color.WHITE);
		lblParola.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblParola.setBounds(10, 47, 82, 14);
		getContentPane().add(lblParola);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAd.setForeground(new Color(255, 255, 255));
		lblAd.setBounds(10, 134, 46, 14);
		getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setForeground(Color.WHITE);
		lblSoyad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoyad.setBounds(10, 172, 46, 14);
		getContentPane().add(lblSoyad);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setForeground(Color.WHITE);
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefon.setBounds(10, 214, 46, 14);
		getContentPane().add(lblTelefon);
		
		JLabel lblTckn = new JLabel("TCKN");
		lblTckn.setForeground(Color.WHITE);
		lblTckn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTckn.setBounds(10, 257, 46, 14);
		getContentPane().add(lblTckn);
		
		JLabel lblCinsiyet = new JLabel("Cinsiyet");
		lblCinsiyet.setForeground(Color.WHITE);
		lblCinsiyet.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCinsiyet.setBounds(10, 300, 64, 14);
		getContentPane().add(lblCinsiyet);
		
		JLabel lblEitim = new JLabel("E\u011Fitim");
		lblEitim.setForeground(Color.WHITE);
		lblEitim.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEitim.setBounds(10, 348, 64, 14);
		getContentPane().add(lblEitim);
		
		JLabel lblBlm = new JLabel("B\u00F6l\u00FCm");
		lblBlm.setForeground(Color.WHITE);
		lblBlm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBlm.setBounds(10, 391, 64, 14);
		getContentPane().add(lblBlm);
		
		JLabel lblBalamaTarihi = new JLabel("Ba\u015Flama Tarihi");
		lblBalamaTarihi.setForeground(Color.WHITE);
		lblBalamaTarihi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBalamaTarihi.setBounds(10, 430, 103, 14);
		getContentPane().add(lblBalamaTarihi);
		
		JButton btnNewButton = new JButton("KAYDET");
		btnNewButton.setBounds(173, 494, 89, 23);
		getContentPane().add(btnNewButton);
		
		txtusername = new JTextField();
		txtusername.setBounds(117, 8, 103, 20);
		getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(117, 44, 103, 20);
		getContentPane().add(txtpassword);
		txtpassword.setColumns(10);
		
		txtname = new JTextField();
		txtname.setBounds(117, 131, 103, 20);
		getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtsurname = new JTextField();
		txtsurname.setBounds(117, 169, 103, 20);
		getContentPane().add(txtsurname);
		txtsurname.setColumns(10);
		
		txtphone = new JTextField();
		txtphone.setBounds(117, 211, 103, 20);
		getContentPane().add(txtphone);
		txtphone.setColumns(10);
		
		txtidentify = new JTextField();
		txtidentify.setBounds(117, 254, 103, 20);
		getContentPane().add(txtidentify);
		txtidentify.setColumns(10);
		
		JComboBox cmbboxgender = new JComboBox();
		cmbboxgender.setBounds(117, 297, 74, 20);
		getContentPane().add(cmbboxgender);
		
		JComboBox cmbboxedu = new JComboBox();
		cmbboxedu.setBounds(117, 345, 74, 20);
		getContentPane().add(cmbboxedu);
		
		txtbolum = new JTextField();
		txtbolum.setBounds(117, 388, 86, 20);
		getContentPane().add(txtbolum);
		txtbolum.setColumns(10);
		
	}
}
