package atcw_20170418;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class GUI {
	School packer;
	private JFrame mainFrame;
	private JButton getButton;
	private JButton removeButton;
	private JButton reserveButton;
	private JTextArea ta;
	
	
	GUI(School _packer) {
		packer = _packer;
		mainFrame = new JFrame("School");
	    mainFrame.setSize(400,360);
	    mainFrame.setLayout(new FlowLayout());
	    
	    getButton = new JButton("Get Rooms");
	    getButton.setActionCommand("get");
	    getButton.addActionListener(new ButtonClickListener());
	    
	    removeButton = new JButton("Remove Random Room");
	    removeButton.setActionCommand("remove");
	    removeButton.addActionListener(new ButtonClickListener());
	    
	    reserveButton = new JButton("Reserve Room");
	    reserveButton.setActionCommand("reserve");
	    reserveButton.addActionListener(new ButtonClickListener());
	    
	    ta = new JTextArea("", 15, 30);
	    
	    mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
	    mainFrame.add(getButton);
	    mainFrame.add(removeButton);
	    mainFrame.add(reserveButton);
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
			} else if(command.equals("reserve")) {
				String roomId = JOptionPane.showInputDialog(mainFrame, "Enter a Room Number").toUpperCase();
				if(packer.getRoomIndex(roomId) != -1) {
					String dateString = JOptionPane.showInputDialog(mainFrame, "What date (mm/dd/yyyy)");
					if(packer.reserveRoom(roomId, dateString)) {
						JOptionPane.showMessageDialog (null, "Room Reserved", "Success", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog (null, "Sorry, that reservation could not be created.", "Failure", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog (null, "Please enter a valid room number.", "Room Not Found", JOptionPane.ERROR_MESSAGE);
				}
			}
		}		
	}
}
