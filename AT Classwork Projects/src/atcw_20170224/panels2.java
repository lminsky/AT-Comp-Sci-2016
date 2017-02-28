package atcw_20170224;
import java.awt.*;
import java.awt.event.*;

public class panels2 extends Frame implements ActionListener{
	private Panel[] panels = new Panel[3];	
	private Button[] buttons = new Button[6];
	private Color[] colors = {Color.red, Color.green, Color.blue};
	
	private panels2() {
		setLayout(null);		
		setResizable(false);	

		for(int i = 0; i < buttons.length; i++) {
			final int targetPanel = ((i/2) + 1 + (i%2)) % 3;
			buttons[i] = new Button("Go to Panel " + targetPanel);
			buttons[i].setBounds(100 + (i%2)*200, 200, 100, 50);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					for(int j = 0; j < 3; j++) {
						panels[j].setVisible(targetPanel == j);
					}
			   }
			});
		}
		
		for(int i = 0; i < panels.length; i++) {
			panels[i] = new Panel();
			panels[i].setBackground(colors[i]);
			panels[i].setBounds(0, 0, 500, 500);
			panels[i].setLayout(null);
			panels[i].add(buttons[i * 2]);
			panels[i].add(buttons[i * 2 + 1]);
			panels[i].setVisible(i == 0);
			add(panels[i]);
		}
		
		setTitle("Panels 2");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args){
		panels2 app = new panels2();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
	}
}