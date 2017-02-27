package atcw_20170216;

import java.awt.Frame;  // Using Frame class in package java.awt
import java.awt.*;
import java.awt.event.*;

// A GUI program is written as a subclass of Frame - the top-level container
// This subclass inherits all properties from Frame, e.g., title, icon, buttons, content-pane
public class gui extends Frame implements ActionListener {
	private Label lblCount;    // Declare a Label component 
	private TextField tfCount; // Declare a TextField component 	
	private Button btnCount;   // Declare a Button component	
	private int count = 0;     // Counter's value
 
   // Constructor to setup the GUI components
   public gui() {
	   setLayout(new FlowLayout());
	   
	   lblCount = new Label("Counter");
	   add(lblCount);
	   
	   tfCount = new TextField("0", 10); // construct the TextField component
	   tfCount.setEditable(false);       // set to read-only
	   add(tfCount);   

	   btnCount = new Button("Count!");   // construct the Button component
	   add(btnCount);  
	   btnCount.addActionListener(this);
	   
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
   
   public void actionPerformed(ActionEvent evt) {
	      count++; // increase the counter value
	      // Display the counter value on the TextField tfCount
	      tfCount.setText(count + ""); // convert int to String
	}
}


















