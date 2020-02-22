package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.heo.sportclub.project.dao.PersonelDAO;

public class Personels extends JFrame {
	private JTable pertable;
	
	public Personels() {
		
		initialize();
	}

	private void initialize() {
		setTitle("Personeller");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(700, 250, 500, 400);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 464, 300);
		getContentPane().add(scrollPane);
		
		pertable = new JTable();
		pertable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setViewportView(pertable);
		personeltablo();
		pertable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Ad", "Soyad", "TCKN", "Telefon", "BaþlaTar.", "Cinsiyet","Eðitim" }) {

		});
	}

	private void personeltablo() {
		PersonelDAO perdao = new PersonelDAO();
		List<com.heo.sportclub.project.models.Personel> liste = perdao.getAllRows(new com.heo.sportclub.project.models.Personel());
		String[][] data = new String[liste.size()][12];
		String[] columns = { "ID", "Ad", "Soyad", "TCKN", "Telefon", "BaþlaTar.", "Cinsiyet","Eðitim" };
		for (int i = 0; i < liste.size(); i++) {
			data[i][0] = String.valueOf(liste.get(i).getId());
			data[i][1] = liste.get(i).getAd();
			data[i][2] = liste.get(i).getSoyad();
			data[i][3] = String.valueOf(liste.get(i).getKimlikno());
			data[i][4] = String.valueOf(liste.get(i).getTelefon());
			data[i][5] = liste.get(i).getBaslamatarihi().toString();
			data[i][6] = liste.get(i).getCinsiyet();
			data[i][7] = liste.get(i).getEgitim().toString();
			
						
		}
		DefaultTableModel model = new DefaultTableModel(data, columns);
		pertable.setModel(model);
		
	}
}
