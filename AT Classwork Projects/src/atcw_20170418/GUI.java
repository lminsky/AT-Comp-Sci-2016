package atcw_20170418;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
	School packer;
	private JFrame mainFrame;
	private JButton getButton;
	private JButton removeButton;
	private JTextArea ta;
	
	
	GUI(School _packer) {
		packer = _packer;
		mainFrame = new JFrame("School");
	    mainFrame.setSize(400,330);
	    mainFrame.setLayout(new FlowLayout());
	    
	    getButton = new JButton("Get Rooms");
	    getButton.setActionCommand("get");
	    getButton.addActionListener(new ButtonClickListener());
	    
	    removeButton = new JButton("Remove Random Room");
	    removeButton.setActionCommand("remove");
	    removeButton.addActionListener(new ButtonClickListener());
	    
	    ta = new JTextArea("", 15, 30);
	    
	    mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
	    mainFrame.add(getButton);
	    mainFrame.add(removeButton);
	    mainFrame.add(ta);
	    mainFrame.setVisible(true);  
	}
	
	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("get")) {
				ta.setText(packer.toString());
			} else if(command.equals("remove")) {
				if(packer.removeRoom())
					System.out.println("Room removed");
				else
					System.out.println("womp womp");
			}
		}		
	}
}
