package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.heo.sportclub.project.dao.DbServicessBase;
import com.heo.sportclub.project.dao.MembersDAO;
import com.heo.sportclub.project.models.Members;

import Database.Baglanti;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NoDbmain extends JFrame {
	private JTextField txtarama;
	private JTable table;
	private Long selecteditemid;
	
	DefaultTableModel modelim = new DefaultTableModel();

	Object[] kolonlar = { "ID", "Ad", "Soyad", "Do\u011Fum Tar.", "TCKN", "Telefon", "E-mail", "Cinsiyet", "Tarih",
			"Program", "Süre" };
	Object[] satirlar = new Object[12];

	
	public NoDbmain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NoDbmain.class.getResource("/images/sportclub1.jpg")));

		initialize();

	}

	private void initialize() {
		setTitle("Spor Salonu Otomasyonu");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(700, 250, 600, 600);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 73, 25);
		getContentPane().add(menuBar);

		JMenu mnMenu = new JMenu("MEN\u00DC");
		mnMenu.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/Menu.png")));
		mnMenu.setBackground(new Color(0, 153, 153));
		mnMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnMenu);

		JMenuItem mnýtmuyekayit = new JMenuItem("\u00DCYE KAYIT");
		mnýtmuyekayit.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/AddUser.png")));
		mnýtmuyekayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				NoDbMemReg mr = new NoDbMemReg();
				mr.setVisible(true);

			}
		});
		mnMenu.add(mnýtmuyekayit);

		JMenuItem mnýtmPersonelKayt = new JMenuItem("PERSONEL KAYIT");
		mnýtmPersonelKayt.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/personel.png")));
		mnýtmPersonelKayt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				NoDbPersonel np = new NoDbPersonel();
				np.setVisible(true);
			}
		});
		mnMenu.add(mnýtmPersonelKayt);

		JMenuItem mnýtmAntrenmanProgram = new JMenuItem("ANTRENMAN PROGRAMI");
		mnýtmAntrenmanProgram.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/program.png")));
		mnýtmAntrenmanProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NoDbAntProg ap = new NoDbAntProg();
				ap.setVisible(true);

			//	AntrenProg ap = new AntrenProg();
			//	ap.setVisible(true);

			}
		});
		mnMenu.add(mnýtmAntrenmanProgram);

		JMenuItem mnýtmk = new JMenuItem("\u00C7IKI\u015E");
		mnýtmk.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/sign-error-icon.png")));
		mnýtmk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		mnMenu.add(mnýtmk);

		JLabel lbluyeler = new JLabel("\u00DCYELER");
		lbluyeler.setForeground(new Color(204, 255, 51));
		lbluyeler.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbluyeler.setBounds(257, 99, 75, 14);
		getContentPane().add(lbluyeler);

		JButton btncýkýs = new JButton("\u00C7IKI\u015E");
		btncýkýs.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/sign-error-icon.png")));
		btncýkýs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncýkýs.setBounds(456, 486, 118, 33);
		getContentPane().add(btncýkýs);

		JLabel lbluyeAra = new JLabel("\u00DCye Ara");
		lbluyeAra.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbluyeAra.setForeground(new Color(255, 255, 255));
		lbluyeAra.setBounds(461, 11, 46, 14);
		getContentPane().add(lbluyeAra);

		txtarama = new JTextField();
		txtarama.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

			}
		});
		txtarama.setBounds(408, 31, 166, 20);
		getContentPane().add(txtarama);
		txtarama.setColumns(10);

		JButton btnAra = new JButton("Ara");
		btnAra.setEnabled(false);
		btnAra.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/ara.png")));
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				

			}

		});
		btnAra.setBounds(441, 62, 89, 33);
		getContentPane().add(btnAra);

		JButton btnSil = new JButton("\u00DCye Sil");
		btnSil.setEnabled(false);
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnSil.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/sil.png")));
		btnSil.setBounds(174, 486, 130, 33);
		getContentPane().add(btnSil);

		JButton btnyeleriGster = new JButton("\u00DCyeleri G\u00F6ster");
		btnyeleriGster.setEnabled(false);
		btnyeleriGster.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/goster.png")));
		btnyeleriGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				

			}
		});
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 135, 564, 316);
		getContentPane().add(scrollPane);

		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		table.setModel(modelim);

		scrollPane.setViewportView(table);

		btnyeleriGster.setBounds(314, 486, 132, 33);
		getContentPane().add(btnyeleriGster);

		JLabel lblbackground = new JLabel("New label");
		lblbackground.setIcon(new ImageIcon(NoDbmain.class.getResource("/images/sportclub1.jpg")));
		lblbackground.setBounds(0, 0, 584, 561);
		getContentPane().add(lblbackground);

	}

	DefaultTableModel model = new DefaultTableModel();

	private void uyetablosu() {
		
		MembersDAO memdao = new MembersDAO();
		List<Members> liste = memdao.getAllRows(new Members());
		String[][] data = new String[liste.size()][12];
		String[] columns = { "ID", "Ad", "Soyad", "Do\u011Fum Tar.", "TCKN", "Telefon", "E-mail", "Cinsiyet", "Tarih","Program","Süre" };
		for (int i = 0; i < liste.size(); i++) {
			data[i][0] = String.valueOf(liste.get(i).getId());
			data[i][1] = liste.get(i).getUyeadi();
			data[i][2] = liste.get(i).getUyesoyad();
			data[i][3] = liste.get(i).getDogumtarihi().toString();
			data[i][4] = String.valueOf(liste.get(i).getKimlikno());
			data[i][5] = String.valueOf(liste.get(i).getGsm());
			data[i][6] = liste.get(i).getEmail();
			data[i][7] = liste.get(i).getCinsiyet();
			data[i][8] = liste.get(i).getKayittarihi().toString();
			data[i][9] = liste.get(i).getProgram().toString();
			data[i][10] = liste.get(i).getUyeliksure().toString();
		}
		DefaultTableModel model = new DefaultTableModel(data, columns);
		table.setModel(model);
		
	}

}
