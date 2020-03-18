package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.heo.sportclub.project.dao.DbServicessBase;
import com.heo.sportclub.project.models.Members;
import com.heo.sportclub.project.models.ProgramEnum;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MemberRegister extends JFrame {
	private Long selecteditemid;
	private JTextField txtad;
	private JTextField txtsoyad;
	private JDateChooser dogumtarihi;
	private JDateChooser kayittarihi;
	private JTextField txtkimlik;
	private JTextField txtgsm;
	private JTextField txtmail;
	private JTextField txtyas;
	private JTextField txtboy;
	private JTextField txtkilo;
	private JTextField txtad1;
	private JTextField txtsoyad1;
	private JTextField txttel1;
	private JTextField txtadr;
	
	
	public MemberRegister() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MemberRegister.class.getResource("/images/sport-club-logo.jpg")));
		
		initialize();
		
	}

	private void initialize() {
		
		setTitle("ÜYE KAYIT");
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
		
		JLabel lblemail = new JLabel("E-mail");
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblemail.setForeground(new Color(255, 255, 255));
		lblemail.setBounds(21, 254, 46, 14);
		getContentPane().add(lblemail);
		
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
		
		JLabel lblregdate = new JLabel("Tarih");
		lblregdate.setForeground(Color.WHITE);
		lblregdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblregdate.setBackground(Color.WHITE);
		lblregdate.setBounds(302, 177, 46, 14);
		getContentPane().add(lblregdate);
		
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
		
		JComboBox cmbboxuyesure = new JComboBox();
		cmbboxuyesure.setModel(new DefaultComboBoxModel(new String[] {"1_aylýk", "3_aylýk","6_aylýk","1_yýllýk"}));
		cmbboxuyesure.setBounds(403, 241, 80, 20);
		getContentPane().add(cmbboxuyesure);
		
		JComboBox cmbboxprogramsec = new JComboBox();
		cmbboxprogramsec.setBounds(393, 208, 147, 23);
		getContentPane().add(cmbboxprogramsec);
		cmbboxprogramsec.setModel(new DefaultComboBoxModel(new String[] {"Program-1", "Program-2","Program-3"}));
		getContentPane().add(cmbboxprogramsec);
		
		JComboBox cmbboxcinsiyet = new JComboBox();
		cmbboxcinsiyet.setModel(new DefaultComboBoxModel(new String[] {"bay", "bayan"}));
		cmbboxcinsiyet.setBounds(383, 30, 54, 20);
		getContentPane().add(cmbboxcinsiyet);
		
		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.setIcon(new ImageIcon(MemberRegister.class.getResource("/images/save.png")));
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DbServicessBase<Members> memdao = new DbServicessBase<Members>();
				Members kaydet = new Members();
				
				kaydet.setId(selecteditemid);
				kaydet.setUyeadi(txtad.getText());
				kaydet.setUyesoyad(txtsoyad.getText());
			    kaydet.setDogumtarihi(dogumtarihi.getDate());
			    kaydet.setKimlikno(txtkimlik.getText());
			    kaydet.setGsm(txtgsm.getText());
			    kaydet.setAdres(txtadr.getText());
			    kaydet.setEmail(txtmail.getText());
			    kaydet.setCinsiyet(cmbboxcinsiyet.getSelectedItem().toString());
			    kaydet.setYas(new Integer(txtyas.getText().toString()));
			    kaydet.setBoy(new Integer(txtboy.getText().toString()));
			    kaydet.setKilo(new Integer(txtkilo.getText().toString()));
			    kaydet.setKayittarihi(kayittarihi.getDate());
			    kaydet.setAcilad(txtad1.getText());
			    kaydet.setAcilsoyad(txtsoyad1.getText());
			    kaydet.setAciltel(txttel1.getText());
			    kaydet.setProgram(cmbboxprogramsec.getSelectedItem().toString());
			    kaydet.setUyeliksure(cmbboxuyesure.getSelectedItem().toString());
			    			    
			    if (memdao.save(kaydet)) {
					JOptionPane.showMessageDialog(MemberRegister.this, "Kayýt Baþarýlý");
			    	
				}
			    else {
			    	JOptionPane.showMessageDialog(MemberRegister.this, "Kayýt Baþarýsýz.");
				}
			    
				
			}
		});
		btnKaydet.setBounds(38, 504, 110, 33);
		getContentPane().add(btnKaydet);
		
		JButton btncýkýs = new JButton("\u00C7IKI\u015E");
		btncýkýs.setIcon(new ImageIcon(MemberRegister.class.getResource("/images/sign-error-icon.png")));
		btncýkýs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncýkýs.setBounds(173, 504, 110, 33);
		getContentPane().add(btncýkýs);
		
		txtad = new JTextField();
		txtad.setBounds(105, 30, 110, 20);
		getContentPane().add(txtad);
		txtad.setColumns(10);
		
		txtsoyad = new JTextField();
		txtsoyad.setBounds(104, 66, 85, 20);
		getContentPane().add(txtsoyad);
		txtsoyad.setColumns(10);
		
		dogumtarihi = new JDateChooser();
		dogumtarihi.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		dogumtarihi.setBounds(105, 103, 100, 20);
		getContentPane().add(dogumtarihi);
					
		
		txtkimlik = new JTextField();
		txtkimlik.setBounds(105, 138, 110, 20);
		getContentPane().add(txtkimlik);
		txtkimlik.setColumns(10);
		
		txtgsm = new JTextField();
		txtgsm.setBounds(105, 174, 110, 20);
		getContentPane().add(txtgsm);
		txtgsm.setColumns(10);
		
		txtmail = new JTextField();
		txtmail.setToolTipText("");
		txtmail.setBounds(105, 251, 151, 20);
		getContentPane().add(txtmail);
		txtmail.setColumns(10);
		
		
		
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
		
		kayittarihi = new JDateChooser();
		kayittarihi.setBounds(383, 174, 86, 20);
		getContentPane().add(kayittarihi);
		getContentPane().add(getTxtadr());
		
		JLabel lblbackground = new JLabel("New label");
		lblbackground.setIcon(new ImageIcon(MemberRegister.class.getResource("/images/sportclub1.jpg")));
		lblbackground.setBounds(0, 0, 584, 572);
		getContentPane().add(lblbackground);
		
		
		
		
	}
	private JTextField getTxtadr() {
		if (txtadr == null) {
			txtadr = new JTextField();
			txtadr.setBounds(105, 199, 110, 41);
			txtadr.setColumns(10);
		}
		return txtadr;
	}
}
