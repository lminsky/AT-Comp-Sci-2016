package atcw_20170224;

import java.awt.*;
import java.awt.event.*;

public class gui extends Frame implements ActionListener{
	private Panel panel1;
	private Panel panel2;
	private Panel panel3;
	
	private TextField tf;
	private Label lbl;
	
	private Button plus;
	private Button minus;
	private Button get;
	
	private int count = 0;
	
	private gui() {
		setLayout(null);
		setResizable(false);
		setBackground(new Color(165, 23, 113));
		
		panel1 = new Panel();
		lbl = new Label("Counter:");
		tf = new TextField("0", 10);
		panel1.add(lbl);
		panel1.add(tf);
		add(panel1);
		panel1.setBackground(Color.cyan);
		panel1.setBounds(0, 100, 500, 30); // (Top left x, top left y, width, height)
		
		panel2 = new Panel();
		plus = new Button("+");
		minus = new Button("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				count--;
				tf.setText(count + "");
			}
		});
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				count++;
				tf.setText(count + "");
			}
		});
		panel2.add(plus);
		panel2.add(minus);
		add(panel2);
		panel2.setBackground(Color.yellow);
		panel2.setBounds(100, 300, 300, 40);
		
		panel3 = new Panel();
		get = new Button("GET");
		get.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				lbl.setText(fixCaps(tf.getText()));
			}
		});
		panel3.add(get);
		add(panel3);
		panel3.setBackground(Color.gray);
		panel3.setBounds(150, 400, 200, 50);
		
		
		
		setTitle("Counter");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args){
		gui app = new gui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	String fixCaps(String s) {
		s = s.toLowerCase();
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

}







