package atcw_20170222;

import java.awt.Frame;  // Using Frame class in package java.awt
import java.awt.*;
import java.awt.event.*;

// A GUI program is written as a subclass of Frame - the top-level container
// This subclass inherits all properties from Frame, e.g., title, icon, buttons, content-pane
public class gui extends Frame implements ActionListener {
	private Label lblCount;    // Declare a Label component 
	private TextField tfCount; // Declare a TextField component 	
	private Button btnCount;   // Declare a Button component	
	private Button btnDown;
	private Button btnReset;
	private int count = 0;     // Counter's value
 
   // Constructor to setup the GUI components
   public gui() {
	   setLayout(new FlowLayout());
	   
	   lblCount = new Label("Counter");
	   add(lblCount);
	   
	   tfCount = new TextField("0", 10); // construct the TextField component
	   tfCount.setEditable(false);       // set to read-only
	   add(tfCount);   

	   btnCount = new Button("Count Up");   // construct the Button component
	   
	   btnCount.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent evt) {
			   count++;
			   update();
		   }
	   });
	   
	   btnDown = new Button("Count Down");
	   add(btnDown);
	   btnDown.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent evt) {
			   count--;
			   update();
		   }
	   });
	   

	   btnReset = new Button("Reset");
	   add(btnReset);
	   btnReset.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent evt) {
			   count = 0;
			   update();
		   }
	   });	      
	   
	   setTitle("Counter");  // "super" Frame sets its title
	   setSize(500, 300);        // "super" Frame sets its initial window size
	   
	   setVisible(true);
   }

   // Other methods


   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor (to setup the GUI) by allocating an instance
	   gui app = new gui();
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void update() {
		tfCount.setText(count + "");
	}
}


















