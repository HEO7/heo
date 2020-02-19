package com.heo.sportclub.project.ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Choice;
import javax.swing.JComboBox;

public class MemberRegister extends JFrame {
	private JTextField txtad;
	private JTextField txtsoyad;
	private JTextField txtdogtar;
	private JTextField txtkimlik;
	private JTextField txtgsm;
	private JTextField txthasta;
	private JTextField txtyas;
	private JTextField txtboy;
	private JTextField txtkilo;
	private JTextField txtad1;
	private JTextField txtsoyad1;
	private JTextField txttel1;
	
	public MemberRegister() {
		
		initialize();
		
	}

	private void initialize() {
		
		setTitle("�YE KAYIT");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(700, 250, 600, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));
		
		JLabel lblyeAd = new JLabel("\u00DCye Ad\u0131");
		lblyeAd.setForeground(new Color(255, 255, 255));
		lblyeAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblyeAd.setBackground(new Color(255, 255, 255));
		lblyeAd.setBounds(21, 33, 46, 14);
		getContentPane().add(lblyeAd);
		
		JLabel lblyeSoyad = new JLabel("\u00DCye Soyad\u0131");
		lblyeSoyad.setForeground(new Color(255, 255, 255));
		lblyeSoyad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblyeSoyad.setBounds(21, 69, 69, 14);
		getContentPane().add(lblyeSoyad);
		
		JLabel lblDoumTarihi = new JLabel("Do\u011Fum Tarihi");
		lblDoumTarihi.setForeground(new Color(255, 255, 255));
		lblDoumTarihi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDoumTarihi.setBounds(21, 106, 86, 14);
		getContentPane().add(lblDoumTarihi);
		
		JLabel lblTckn = new JLabel("TCKN");
		lblTckn.setForeground(new Color(255, 255, 255));
		lblTckn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTckn.setBounds(21, 141, 46, 14);
		getContentPane().add(lblTckn);
		
		JLabel lblGsm = new JLabel("GSM");
		lblGsm.setForeground(new Color(255, 255, 255));
		lblGsm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGsm.setBounds(21, 177, 46, 14);
		getContentPane().add(lblGsm);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setForeground(new Color(255, 255, 255));
		lblAdres.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdres.setBounds(21, 202, 46, 14);
		getContentPane().add(lblAdres);
		
		JLabel lblHastalk = new JLabel("Hastal\u0131k");
		lblHastalk.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHastalk.setForeground(new Color(255, 255, 255));
		lblHastalk.setBounds(21, 254, 46, 14);
		getContentPane().add(lblHastalk);
		
		JLabel lblCinsiyet = new JLabel("Cinsiyet");
		lblCinsiyet.setForeground(Color.WHITE);
		lblCinsiyet.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCinsiyet.setBackground(Color.WHITE);
		lblCinsiyet.setBounds(302, 33, 46, 14);
		getContentPane().add(lblCinsiyet);
		
		JLabel lblYa = new JLabel("Ya\u015F");
		lblYa.setForeground(Color.WHITE);
		lblYa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYa.setBackground(Color.WHITE);
		lblYa.setBounds(302, 69, 46, 14);
		getContentPane().add(lblYa);
		
		JLabel lblBoy = new JLabel("Boy");
		lblBoy.setForeground(Color.WHITE);
		lblBoy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBoy.setBackground(Color.WHITE);
		lblBoy.setBounds(302, 106, 46, 14);
		getContentPane().add(lblBoy);
		
		JLabel lblKilo = new JLabel("Kilo");
		lblKilo.setForeground(Color.WHITE);
		lblKilo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKilo.setBackground(Color.WHITE);
		lblKilo.setBounds(302, 141, 46, 14);
		getContentPane().add(lblKilo);
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setForeground(Color.WHITE);
		lblTarih.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTarih.setBackground(Color.WHITE);
		lblTarih.setBounds(302, 177, 46, 14);
		getContentPane().add(lblTarih);
		
		JLabel lblProgramSe = new JLabel("Program Se\u00E7");
		lblProgramSe.setForeground(Color.WHITE);
		lblProgramSe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProgramSe.setBackground(Color.WHITE);
		lblProgramSe.setBounds(302, 212, 86, 14);
		getContentPane().add(lblProgramSe);
		
		JLabel lblyelikSresi = new JLabel("\u00DCyelik S\u00FCresi");
		lblyelikSresi.setForeground(Color.WHITE);
		lblyelikSresi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblyelikSresi.setBackground(Color.WHITE);
		lblyelikSresi.setBounds(302, 244, 86, 14);
		getContentPane().add(lblyelikSresi);
		
		JLabel lblNewLabel = new JLabel("AC\u0130L DURUMDA ARANACAK K\u0130\u015E\u0130");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setBounds(21, 294, 221, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAd = new JLabel("Ad\u0131");
		lblAd.setForeground(Color.WHITE);
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAd.setBackground(Color.WHITE);
		lblAd.setBounds(21, 341, 46, 14);
		getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad\u0131");
		lblSoyad.setForeground(Color.WHITE);
		lblSoyad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSoyad.setBounds(21, 377, 69, 14);
		getContentPane().add(lblSoyad);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setForeground(Color.WHITE);
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefon.setBounds(21, 409, 46, 14);
		getContentPane().add(lblTelefon);
		
		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.setBounds(38, 504, 89, 23);
		getContentPane().add(btnKaydet);
		
		JButton btnc�k�s = new JButton("\u00C7IKI\u015E");
		btnc�k�s.setBounds(194, 504, 89, 23);
		getContentPane().add(btnc�k�s);
		
		txtad = new JTextField();
		txtad.setBounds(105, 30, 110, 20);
		getContentPane().add(txtad);
		txtad.setColumns(10);
		
		txtsoyad = new JTextField();
		txtsoyad.setBounds(104, 66, 85, 20);
		getContentPane().add(txtsoyad);
		txtsoyad.setColumns(10);
		
		txtdogtar = new JTextField();
		txtdogtar.setBounds(105, 103, 100, 20);
		getContentPane().add(txtdogtar);
		txtdogtar.setColumns(10);
		
		txtkimlik = new JTextField();
		txtkimlik.setBounds(105, 138, 110, 20);
		getContentPane().add(txtkimlik);
		txtkimlik.setColumns(10);
		
		txtgsm = new JTextField();
		txtgsm.setBounds(105, 174, 110, 20);
		getContentPane().add(txtgsm);
		txtgsm.setColumns(10);
		
		JTextArea textAreaadres = new JTextArea();
		textAreaadres.setBounds(105, 202, 110, 36);
		getContentPane().add(textAreaadres);
		
		txthasta = new JTextField();
		txthasta.setToolTipText("varsa hastal\u0131k belirtiniz.");
		txthasta.setBounds(105, 251, 151, 20);
		getContentPane().add(txthasta);
		txthasta.setColumns(10);
		
		JComboBox cmbboxcinsiyet = new JComboBox();
		cmbboxcinsiyet.setBounds(383, 30, 54, 20);
		getContentPane().add(cmbboxcinsiyet);
		
		txtyas = new JTextField();
		txtyas.setBounds(383, 66, 54, 20);
		getContentPane().add(txtyas);
		txtyas.setColumns(10);
		
		txtboy = new JTextField();
		txtboy.setColumns(10);
		txtboy.setBounds(383, 103, 54, 20);
		getContentPane().add(txtboy);
		
		txtkilo = new JTextField();
		txtkilo.setColumns(10);
		txtkilo.setBounds(383, 138, 54, 20);
		getContentPane().add(txtkilo);
		
		JComboBox cmbboxprogramsec = new JComboBox();
		cmbboxprogramsec.setBounds(416, 209, 110, 20);
		getContentPane().add(cmbboxprogramsec);
		
		JComboBox cmbboxuyesure = new JComboBox();
		cmbboxuyesure.setBounds(416, 241, 110, 20);
		getContentPane().add(cmbboxuyesure);
		
		txtad1 = new JTextField();
		txtad1.setBounds(105, 338, 86, 20);
		getContentPane().add(txtad1);
		txtad1.setColumns(10);
		
		txtsoyad1 = new JTextField();
		txtsoyad1.setColumns(10);
		txtsoyad1.setBounds(103, 374, 86, 20);
		getContentPane().add(txtsoyad1);
		
		txttel1 = new JTextField();
		txttel1.setColumns(10);
		txttel1.setBounds(103, 406, 86, 20);
		getContentPane().add(txttel1);
		
	}
}