package atcw_20170224;

import java.awt.*;
import java.awt.event.*;

public class gui extends Frame implements ActionListener{
	private Panel panel1;		//Create the top panel
	private Panel panel2;		//Create the middle panel
	private Panel panel3;		//Create the bottom panel
	
	private TextField tf;		//Create the text field
	private Label lbl;			//Create the label
	
	private Button plus;			//Create the plus button
	private Button minus;		//Create the minus button
	private Button get;			//Create the get button
	
	private int count = 0;		//Create the variable to track the counter
	
	private gui() {
		setLayout(null);			//Set the frame layout to null (not FlowLayout so we can specify coordinates)
		setResizable(false);		//Don't allow the user to resize the window
		setBackground(new Color(165, 23, 113));	//Set the frame background color
		
		panel1 = new Panel();			//Instantiate the first panel
		lbl = new Label("Counter:");		//Instantiate the label with the text "Counter:"
		lbl.setFont(new Font("aaaiight! fat", Font.PLAIN, 36));	//Set the font of the label (Font name, style, size)
		tf = new TextField("0", 10);		//Instantiate the text field starting with the value "0"
		panel1.add(lbl);					//Add the label to panel1
		panel1.add(tf);					//Add the text field to panel1
		add(panel1);						//Add panel1 to the frame
		panel1.setBackground(Color.cyan);	//Set the background of panel1
		panel1.setBounds(0, 100, 500, 50); // (Top left x, top left y, width, height)
				
		panel2 = new Panel();			//Instantiate the second panel
		plus = new Button("+");			//Instantiate the plus button	
		minus = new Button("-");			//Instantiate the minus button
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







