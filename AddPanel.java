import java.awt.Component;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JPanel;


public class AddPanel {
	private int[] columnWidths;
	private int[] rowHeights;
	public AddPanel() {
		this.columnWidths = new int[]{0, 0, 0, 0, 0};
		this.rowHeights = new int[]{0, 0, 0, 0};
	}
	public void addItem(JPanel p,Component model1,int x,int y
			,int width,int height,int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx=x;
		gc.gridy=y; 
		//gc.gridx = width; 
		//gc.gridy = height; 
		gc.insets = new Insets(0, 5, 5, 0); 
		gc.anchor = align; 
		gc.fill =  GridBagConstraints.NONE;
		p.add(model1,gc);
		
	}

}
