package com.heo.sportclub.project.yedek;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Antrenman{
	
	JFrame f;
	private JLabel lblArkaplan;
	
	
	public Antrenman() {
		
		initialize();
		
	}

	private void initialize() {
		
		f=new JFrame();  
		f.setIconImage(Toolkit.getDefaultToolkit().getImage(Antrenman.class.getResource("/images/sport-club-logo.jpg")));
	    JTextArea ta1=new JTextArea(29,80);  
	    ta1.setText("sadadas\r\nasdsadsa\r\nasdasdsad\r\nasdsadasd\r\nsdsadasd\r\nsadas\r\ndsad\r\nasda");
	   
	    JTextArea ta2=new JTextArea(29,80);
	    ta2.setText("123123123\r\nesrf\r\n2342342\r\nfdsdfghfd\r\n4321312\r\n3");
	    JTextArea ta3=new JTextArea(29,80);
	    ta3.setText("sadasdas\r\n21312312\r\nefsfdsdf\r\n54646456\r\nsdfsdf\r\ns");
	    JPanel p1=new JPanel();  
	    p1.add(ta1);  
	    JPanel p2=new JPanel();
	    p2.add(ta2);
	    JPanel p3=new JPanel();
	    p3.add(ta3);
	    JTabbedPane tp=new JTabbedPane();  
	    tp.setBounds(0,0,392,373);  
	    
	    
	    
	    tp.add("Program-1",p1);  
	    tp.add("Program-2",p2);  
	    tp.add("Program-3",p3);    
	    f.getContentPane().add(tp);  
	    f.getContentPane().add(getLblArkaplan());
	    f.setSize(400,400);  
	    f.getContentPane().setLayout(null);  
	    f.setVisible(true);  
	}  
	private JLabel getLblArkaplan() {
		if (lblArkaplan == null) {
			lblArkaplan = new JLabel("arkaplan");
			lblArkaplan.setIcon(new ImageIcon(Antrenman.class.getResource("/images/sportclub2.jpg")));
			lblArkaplan.setBounds(0, 0, 392, 373);
		}
		return lblArkaplan;
	}
	}


