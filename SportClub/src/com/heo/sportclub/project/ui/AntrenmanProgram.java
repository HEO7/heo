package com.heo.sportclub.project.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AntrenmanProgram extends JFrame {

	private JComponent componenet_name;
	

	public AntrenmanProgram() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AntrenmanProgram.class.getResource("/images/sport-club-logo.jpg")));

		
		initialize();

	}

	private void initialize() {

		setTitle("ANTRENMAN PROGRAMLARI");
		setBounds(700, 250, 300, 500);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(0, 153, 153));

		JButton btnProgram = new JButton("Program-1");
		btnProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnProgram.setBounds(0, 0, 89, 23);
		getContentPane().add(btnProgram);

		JButton btnProgram_1 = new JButton("Program-2");
		btnProgram_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AntrenmanProgram2 ap2 = new AntrenmanProgram2();
				ap2.setVisible(true);
				dispose();
		
				
			}
		});
		btnProgram_1.setBounds(93, 0, 89, 23);
		getContentPane().add(btnProgram_1);

		JButton btnProgram_2 = new JButton("Program-3");
		btnProgram_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AntrenmanProgram3 ap3 = new AntrenmanProgram3();
				ap3.setVisible(true);
				dispose();
				
			}
		});
		btnProgram_2.setBounds(186, 0, 89, 23);
		getContentPane().add(btnProgram_2);
		
		JTextPane txtprgm1 = new JTextPane();
		txtprgm1.setText("Squat 3x5\r\nSquat Asistan\u0131 3x8-12\r\nBench Press 3x5\r\nBench Press Asistan\u0131 3x8-12\r\nPendlay Row 3x5\r\nRow Asistan\u0131 3x8-12");
		txtprgm1.setBounds(10, 34, 265, 322);
		getContentPane().add(txtprgm1);
		
		JButton btnYazdr = new JButton("Yazd\u0131r");
		btnYazdr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printle();
			}
		});
		btnYazdr.setBounds(172, 393, 89, 23);
		getContentPane().add(btnYazdr);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AntrenmanProgram.class.getResource("/images/sportclub2.jpg")));
		lblNewLabel.setBounds(0, 0, 284, 461);
		getContentPane().add(lblNewLabel);

	}
	public void printle() {
		
		 

			  PrinterJob pj = PrinterJob.getPrinterJob();
			  pj.setJobName(" Print Component ");

			  pj.setPrintable (new Printable() {    
			    public int print(Graphics pg, PageFormat pf, int pageNum) {
			      if (pageNum > 0) return Printable.NO_SUCH_PAGE;

			      Graphics2D g2 = (Graphics2D) pg;
			      g2.translate(pf.getImageableX(), pf.getImageableY());
			      componenet_name.paint(g2);
			      return Printable.PAGE_EXISTS;
			    }
			  });

			  if (pj.printDialog() == false) return;

			  try {
			    pj.print();
			  } catch (PrinterException ex) {
			    ex.printStackTrace();
			  }
			}
	
}
