package com.heo.sportclub.project.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class NoDbAntProg extends JFrame {
	
	
	JTabbedPane tab;
	public JTextArea t1,t2,t3;
	public JPanel p1,p2,p3;
	public ImageIcon i1,i2,i3;
	public JFrame f;
	private JComponent componenet_name;
	
	public NoDbAntProg() {
		
		f = new JFrame("Antrenman Programý");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage(NoDbAntProg.class.getResource("/images/sport-club-logo.jpg")));
        f.setSize(400, 400);
        f.setLocation(700, 250);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		tab = new JTabbedPane();
		tab.setBounds(10, 11, 364, 241);
		
		
		p1= new JPanel();
		p1.setLayout(null);
		p2= new JPanel();
		p2.setLayout(null);
		p3=new JPanel();
		p3.setLayout(null);
		
		i1= new ImageIcon(this.getClass().getResource("/images/kas.png"));
		tab.addTab("Program-1", i1,p1);
		
		t1= new JTextArea("Inchline Bench Press \r\nInchline Dumbell Fly \r\nDumbell Bench Press\r\nDumbell Curl\r\nConcentration Culr");
		t1.setFont(new Font("Tahoma", Font.BOLD, 10));
		t1.setBounds(0, 0, 359, 195);
        p1.add(t1);
	
        i2= new ImageIcon(this.getClass().getResource("/images/kas.png"));
		tab.addTab("Program-2", i2,p2);
		
		t2= new JTextArea("Wide Grid Front Lat Pull Down\r\nStraight Arm Pulldown\r\nOne Arm Dumbell Rowing\r\nDumbell Press \r\nBent Over Dumbbell Lateral Raise \r\nFront Dumbell Raise");
		t2.setFont(new Font("Tahoma", Font.BOLD, 10));
		t2.setBounds(0, 0, 359, 196);
		p2.add(t2);
        
        i3= new ImageIcon(this.getClass().getResource("/images/kas.png"));
		f.getContentPane().setLayout(null);
		tab.addTab("Program-3", i3,p3);
		
		t3= new JTextArea("Triceps Pushdowns(Rope Attachment)\r\nDumbell French\r\nLeg Press\r\nHamstring Curl\r\nLeg Extension");
		t3.setFont(new Font("Tahoma", Font.BOLD, 10));
		t3.setBounds(0, 0, 359, 196);
		p3.add(t3);
		
		
	        
        f.getContentPane().add(tab);
        
        JButton btnYazdr = new JButton("Yazd\u0131r");
        btnYazdr.setEnabled(false);
        btnYazdr.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		print();
        	}

			private void print() {
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
        });
        btnYazdr.setBounds(285, 278, 89, 23);
        f.getContentPane().add(btnYazdr);
        
        JLabel lblArkaplan = new JLabel("arkaplan");
        lblArkaplan.setIcon(new ImageIcon(Tabmenu.class.getResource("/images/sportclub2.jpg")));
        lblArkaplan.setBounds(0, 0, 384, 361);
        f.getContentPane().add(lblArkaplan);
        f.setVisible(true);
		
	}
}
