package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.heo.sportclub.project.dao.DbServicessBase;
import com.heo.sportclub.project.dao.MembersDAO;
import com.heo.sportclub.project.models.Members;

public class MainScreen extends JFrame {
	private JTextField txtarama;
	private JTable table;
	private Long selecteditemid;

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
		mnýtmuyekayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MemberRegister mr = new MemberRegister();
				mr.setVisible(true);

			}
		});
		mnMenu.add(mnýtmuyekayit);

		JMenuItem mnýtmPersonelKayt = new JMenuItem("PERSONEL KAYIT");
		mnýtmPersonelKayt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddPersonel adpe = new AddPersonel();
				adpe.setVisible(true);
			}
		});
		mnMenu.add(mnýtmPersonelKayt);

		JMenuItem mnýtmAntrenmanProgram = new JMenuItem("ANTRENMAN PROGRAMI");
		mnýtmAntrenmanProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AntrenmanProgram anap = new AntrenmanProgram();
				anap.setVisible(true);
			}
		});
		mnMenu.add(mnýtmAntrenmanProgram);

		JMenuItem mnýtmk = new JMenuItem("\u00C7IKI\u015E");
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
		btncýkýs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncýkýs.setBounds(456, 486, 89, 23);
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

				String ara = txtarama.getText().toString();
				arama(ara);
			}
		});
		txtarama.setBounds(408, 31, 166, 20);
		getContentPane().add(txtarama);
		txtarama.setColumns(10);

		JButton btnAra = new JButton("Ara");
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ara = txtarama.getText().toString();
				arama(ara);
			}
		});
		btnAra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		btnAra.setBounds(441, 62, 89, 23);
		getContentPane().add(btnAra);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 135, 564, 316);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			

			}

		});

		scrollPane.setViewportView(table);
		uyetablosu();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Ad", "Soyad", "Do\u011Fum Tar.",
				"TCKN", "Telefon", "E-mail", "Cinsiyet", "Tarih","Program","Süre" }) {

		});

		JButton btnSil = new JButton("\u00DCye Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DbServicessBase<Members> memdao = new DbServicessBase<Members>();
				Members sil = new Members();
				int row = table.getSelectedRow();
				sil.setId(Long.valueOf(table.getValueAt(row, 0).toString()));
				sil.setUyeadi(table.getValueAt(row, 1).toString());
				sil.setUyesoyad(table.getValueAt(row, 2).toString());
				sil.setKimlikno(table.getValueAt(row, 4).toString());
				sil.setGsm(table.getValueAt(row, 5).toString());
				sil.setEmail(table.getValueAt(row, 6).toString());
				sil.setCinsiyet(table.getValueAt(row, 7).toString());
				
				sil.setProgram(table.getValueAt(row, 9).toString());
				sil.setUyeliksure(table.getValueAt(row, 10).toString());
				if (memdao.delete(sil)) {
					JOptionPane.showMessageDialog(MainScreen.this, "Silindi");
					uyetablosu();

				} else {
					JOptionPane.showMessageDialog(MainScreen.this, "Silme Baþarýz");
				}

			}
		});
		btnSil.setBounds(194, 486, 89, 23);
		getContentPane().add(btnSil);
		
		JButton btnyeleriGster = new JButton("\u00DCyeleri G\u00F6ster");
		btnyeleriGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uyetablosu();
			}
		});
		btnyeleriGster.setBounds(314, 486, 101, 23);
		getContentPane().add(btnyeleriGster);

	}
	DefaultTableModel model=new DefaultTableModel();
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

	public void arama(String ara) {

		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
		table.setRowSorter(tr);

		tr.setRowFilter(RowFilter.regexFilter(ara));

	}
}