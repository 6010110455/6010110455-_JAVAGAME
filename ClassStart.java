import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassStart extends JFrame{
	private GUIParser guiParser;
	private JPanel p;
	private JButton btnStart;
	private JLabel lblName;
	private JLabel lblWellcome;
	private JTextField textName;
	
	public ClassStart(String title) {
		super(title);
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		lblWellcome = new JLabel("Wellcome to Game of Benz!!!");
		lblWellcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textName	= new JTextField(18);
		btnStart = new JButton("PRESS START");

		
		AddPanel gc = new AddPanel();

		gc.addItem(p,lblWellcome,1,0,1,1,GridBagConstraints.NORTH);
		gc.addItem(p,lblName,0,1,1,1,GridBagConstraints.WEST);
		gc.addItem(p,textName,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnStart,1,2,1,1,GridBagConstraints.CENTER);
		
		btnStart.addActionListener(new ButtonListener());

		add(p);
		
		
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnStart && textName.getText().length()>0) {			
					ClassSelect classGo = new ClassSelect("Class Select",textName.getText());
					classGo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					classGo.setSize(700,500);
					classGo.setVisible(true);
					dispose();
				}
				else {
					
				}
		}
	}
	public static void main(String[] args) {
		ClassStart classStart = new ClassStart("START");
		classStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		classStart.setSize(500,300);
		classStart.setVisible(true);
		//pokemonStart.pack();
		
	}
}
