package atcw_20170224;

import java.awt.*;
import java.awt.event.*;

public class panels extends Frame implements ActionListener{
	private Panel panel0;	
	private Panel panel1;
	private Panel panel2;
	
	private Button button0a;
	private Button button0b;
	private Button button1a;
	private Button button1b;
	private Button button2a;
	private Button button2b;	
	
	private panels() {
		setLayout(null);		
		setResizable(false);	

		button0a = new Button("Go to Panel 1");
		button0a.setBounds(100, 250, 100, 50);
		button0a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   panel0.setVisible(false);
			   panel1.setVisible(true);
			   panel2.setVisible(false);
		   }
		});
		button0b = new Button("Go to Panel 2");
		button0b.setBounds(300, 250, 100, 50);
		button0b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   panel0.setVisible(false);
			   panel1.setVisible(false);
			   panel2.setVisible(true);
		   }
		});

		button1a = new Button("Go to Panel 0");
		button1a.setBounds(100, 250, 100, 50);
		button1a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   panel0.setVisible(true);
			   panel1.setVisible(false);
			   panel2.setVisible(false);
		   }
		});
		button1b = new Button("Go to Panel 2");
		button1b.setBounds(300, 250, 100, 50);
		button1b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   panel0.setVisible(false);
			   panel1.setVisible(false);
			   panel2.setVisible(true);
		   }
		});

		button2a = new Button("Go to Panel 0");
		button2a.setBounds(100, 250, 100, 50);
		button2a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   panel0.setVisible(true);
			   panel1.setVisible(false);
			   panel2.setVisible(false);
		   }
		});
		button2b = new Button("Go to Panel 1");
		button2b.setBounds(300, 250, 100, 50);
		button2b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			   panel0.setVisible(false);
			   panel1.setVisible(true);
			   panel2.setVisible(false);
		   }
		});
		
		panel0 = new Panel();
		panel0.setBackground(Color.red);
		panel0.setBounds(0, 0, 500, 500);
		panel0.setLayout(null);
		panel0.add(button0a);
		panel0.add(button0b);
		panel0.setVisible(false);

		panel1 = new Panel();
		panel1.setBackground(Color.green);
		panel1.setBounds(0, 0, 500, 500);
		panel1.setLayout(null);
		panel1.add(button1a);
		panel1.add(button1b);
		panel1.setVisible(true);

		panel2 = new Panel();
		panel2.setBackground(Color.blue);
		panel2.setBounds(0, 0, 500, 500);
		panel2.setLayout(null);
		panel2.add(button2a);
		panel2.add(button2b);
		panel2.setVisible(false);

		add(panel0);
		add(panel1);
		add(panel2);
		
		setTitle("Panels");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args){
		panels app = new panels();
	}
	public void actionPerformed(ActionEvent e) {
	}
}