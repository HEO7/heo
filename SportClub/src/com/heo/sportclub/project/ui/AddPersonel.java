package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.heo.sportclub.project.dao.DbServicessBase;
import com.heo.sportclub.project.dao.PersonelDAO;
import com.heo.sportclub.project.models.Personel;
import com.toedter.calendar.JDateChooser;

public class AddPersonel extends JFrame {
	private JTextField txtusername;
	private JTextField txtpassword;
	private JTextField txtname;
	private JTextField txtsoyad;
	private JTextField txtphone;
	private JTextField txtidentify;
	private JDateChooser baslamatarihi;
	private Long selecteditemid;
	
	
	private JTable pertable;
	
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
		
		JLabel lblBalamaTarihi = new JLabel("Ba\u015Flama Tarihi");
		lblBalamaTarihi.setForeground(Color.WHITE);
		lblBalamaTarihi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBalamaTarihi.setBounds(10, 430, 103, 14);
		getContentPane().add(lblBalamaTarihi);
		
		JComboBox cmbboxgender = new JComboBox();
		cmbboxgender.setModel(new DefaultComboBoxModel(new String[] {"bay", "bayan"}));
		cmbboxgender.setBounds(117, 297, 74, 20);
		getContentPane().add(cmbboxgender);
		
		JComboBox cmbboxedu = new JComboBox();
		cmbboxedu.setModel(new DefaultComboBoxModel(new String[] {"ilkokul", "ortaokul", "lise", "\u00FCniversite", "y.lisans", "doktora"}));
		cmbboxedu.setBounds(117, 345, 74, 20);
		getContentPane().add(cmbboxedu);
		
		
		JButton btnkaydet = new JButton("KAYDET");
		btnkaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DbServicessBase<Personel> perdao = new DbServicessBase<Personel>();
				Personel kaydet = new Personel();
				
				kaydet.setId(selecteditemid);
				kaydet.setKullaniciadi(txtusername.getText());
				kaydet.setSifre(txtpassword.getText());
				kaydet.setAd(txtname.getText());
				kaydet.setSoyad(txtsoyad.getText());
				kaydet.setKimlikno(txtidentify.getText());
				kaydet.setTelefon(txtphone.getText());
				kaydet.setCinsiyet(cmbboxgender.getSelectedItem().toString());
				kaydet.setEgitim(cmbboxedu.getSelectedItem().toString());
				kaydet.setBaslamatarihi(baslamatarihi.getDate());
				
				if (perdao.save(kaydet)) {
					JOptionPane.showMessageDialog(AddPersonel.this, "Kayýt Baþarýlý.");
				}
				else {
					JOptionPane.showMessageDialog(AddPersonel.this, "Kayýt Baþarýsýz.");
				}
				
				
			}
		});
		btnkaydet.setBounds(173, 494, 89, 23);
		getContentPane().add(btnkaydet);
		
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
		
		txtsoyad = new JTextField();
		txtsoyad.setBounds(117, 169, 103, 20);
		getContentPane().add(txtsoyad);
		txtsoyad.setColumns(10);
		
		txtphone = new JTextField();
		txtphone.setBounds(117, 211, 103, 20);
		getContentPane().add(txtphone);
		txtphone.setColumns(10);
		
		txtidentify = new JTextField();
		txtidentify.setBounds(117, 254, 103, 20);
		getContentPane().add(txtidentify);
		txtidentify.setColumns(10);
		
				
		baslamatarihi = new JDateChooser();
		baslamatarihi.setBounds(134, 427, 86, 20);
		getContentPane().add(baslamatarihi);
		
		JButton btnPersoneller = new JButton("Personeller");
		btnPersoneller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Personels p = new Personels();
				p.setVisible(true);

				
				
			}

			
		});
		btnPersoneller.setBounds(10, 494, 103, 23);
		getContentPane().add(btnPersoneller);
		
		
	}
	private void personeltablo() {
		PersonelDAO perdao = new PersonelDAO();
		List<Personel> liste = perdao.getAllRows(new Personel());
		String[][] data = new String[liste.size()][9];
		String[] columns = { "ID", "Ad", "Soyad", "Baþlama Tar.", "TCKN", "Telefon","Eðitim" };
		for (int i = 0; i < liste.size(); i++) {
			data[i][0] = String.valueOf(liste.get(i).getId());
			data[i][1] = liste.get(i).getAd();
			data[i][2] = liste.get(i).getSoyad();
			data[i][3] = liste.get(i).getBaslamatarihi().toString();
			data[i][4] = String.valueOf(liste.get(i).getKimlikno());
			data[i][5] = String.valueOf(liste.get(i).getTelefon());
			data[i][6] = liste.get(i).getEgitim().toString();
			
		}
		DefaultTableModel model = new DefaultTableModel(data, columns);
		pertable.setModel(model);
		
	}
}
