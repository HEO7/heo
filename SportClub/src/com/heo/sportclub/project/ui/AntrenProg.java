package com.heo.sportclub.project.ui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AntrenProg extends JFrame  {
	
	
	private JTextArea ta1,ta2,ta3;
	
	
	public AntrenProg () {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AntrenProg.class.getResource("/images/sport-club-logo.jpg")));
		
	
		    
		   ta1 = new JTextArea();
		   ta1.setText("Inchline Bench Press \r\nInchline Dumbell Fly \r\nDumbell Bench Press\r\nDumbell Curl\r\nConcentration Culr");
		   ta1.setFont(new Font("Tahoma", Font.BOLD, 10));
		   ta1.setLocation(10, 11);
		    ta1.setSize(339, 300);
		     ta2 = new JTextArea();
		     ta2.setText("Wide Grid Front Lat Pull Down\r\nStraight Arm Pulldown\r\nOne Arm Dumbell Rowing\r\nDumbell Press \r\nBent Over Dumbbell Lateral Raise \r\nFront Dumbell Raise");
		     ta2.setFont(new Font("Tahoma", Font.BOLD, 10));
		     ta2.setBounds(10, 11, 339, 300);
		     ta3 = new JTextArea();
		     ta3.setText("Triceps Pushdowns(Rope Attachment)\r\nDumbell French\r\nLeg Press\r\nHamstring Curl\r\nLeg Extension");
		     ta3.setFont(new Font("Tahoma", Font.BOLD, 10));
		     ta3.setBounds(10, 11, 339, 300);
		    
		    JPanel p1=new JPanel();
		    JPanel p2=new JPanel();
		    JPanel p3=new JPanel();
		    p1.setLayout(null);
		    p1.add(ta1);
		    p2.setLayout(null);
		    p2.add(ta2);
		    p3.setLayout(null);
		    p3.add(ta3);
		    
		    JTabbedPane tp=new JTabbedPane();
		    tp.setBounds(10,0,364,350);  
		    tp.add("Program-1",p1);  
		    tp.add("Program-2",p2);  
		    tp.add("Program-3",p3);    
		    getContentPane().add(tp);  
		    setBounds(700, 250, 400, 400);
		    getContentPane().setLayout(null);  
		    
		    JLabel lblbackground = new JLabel("Arkaplan");
		    lblbackground.setIcon(new ImageIcon(AntrenProg.class.getResource("/images/sportclub2.jpg")));
		    lblbackground.setBounds(0, 0, 384, 361);
		    getContentPane().add(lblbackground);
		    setVisible(true);  
		
	}
}
