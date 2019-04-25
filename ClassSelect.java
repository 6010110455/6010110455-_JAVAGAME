import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ClassSelect extends JFrame{
	private JPanel p;
	private JLabel lblHeader;
	private JLabel lblSw;
	private JLabel lblAr;
	private JLabel lblAs;
	private JButton btnSw;
	private JButton btnAr;
	private JButton btnAs;
	private GUIParser guiParser;
	public ClassSelect (String title,String pokemonTrainer) {
		super(title);
		guiParser = new GUIParser(pokemonTrainer); 
		
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		btnSw = new JButton();
		btnAr= new JButton();
		btnAs= new JButton();
		lblHeader = new JLabel("Select your Class!!!");
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSw = new JLabel("Swordsman");
		lblAr = new JLabel("Archer");
		lblAs = new JLabel("Assassin");
		btnSw.setIcon(new ImageIcon("images/Swordsman.gif"));
		btnSw.setPreferredSize(new Dimension(200,300));
		btnAr.setIcon(new ImageIcon("images/Archer.gif"));
		btnAr.setPreferredSize(new Dimension(200,300));
		btnAs.setIcon(new ImageIcon("images/Assassin.gif"));
		btnAs.setPreferredSize(new Dimension(200,300));


		
		AddPanel gc = new AddPanel();
		gc.addItem(p,lblHeader,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnSw,0,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnAr,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnAs,2,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblSw,0,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblAr,1,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblAs,2,2,1,1,GridBagConstraints.CENTER);
		
		
		
		btnSw.addActionListener(new ButtonListener());
		btnAr.addActionListener(new ButtonListener());
		btnAs.addActionListener(new ButtonListener());
		add(p);
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				int n=1; 
				if(e.getSource()==btnSw){
					n=guiParser.selectCharacter("Swordsman");
				}
				else if(e.getSource()==btnAr){
					n=guiParser.selectCharacter("Archer");
				}
				else if(e.getSource()==btnAs){
					n=guiParser.selectCharacter("Assassin");
				}

				if(n==0) {
					MainGame mainGo = new MainGame("Main Menu", guiParser);
					mainGo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					mainGo.setSize(500,400);
					mainGo.setVisible(true);
					dispose();
				}
				
				
			
		}
	}
}
