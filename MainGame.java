import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;



public class MainGame extends JFrame{
	private GUIParser guiParser;
	
	private JPanel p;
	private JButton btnHeal;
	private JButton btnAttack1;
	private JButton btnAttack2;
	private JButton btnAttack3;
	private JComboBox<String> cbPotion;
	private JTextArea taDetail;
	private JLabel imgLabel;
	private JLabel lblH;


	public MainGame(String title,GUIParser guiParser){
		super(title);
		this.guiParser=guiParser;
		guiParser.dicoverRival();
		guiParser.printCharacter();
		p = new JPanel();
		p.setLayout(new GridBagLayout());
		lblH = new JLabel("Press to attack!!");
		lblH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHeal = new JButton("Heal");
		btnAttack1 = new JButton("Monster1");
		btnAttack2 = new JButton("Monster2");
		btnAttack3 = new JButton("BOSS!!!");
		taDetail = new JTextArea(10,2);
		imgLabel = new JLabel(new ImageIcon(guiParser.getImgPath())); 
		
		String [] potionList = {"Potion","GoodPotion","SuperPotion"};
		cbPotion = new JComboBox(potionList);
		
		
		AddPanel gc = new AddPanel();
		gc.addItem(p,taDetail,0,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,imgLabel,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnHeal,0,1,1,1,GridBagConstraints.WEST);
		gc.addItem(p,lblH,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnAttack1,1,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnAttack2,1,3,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnAttack3,1,4,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,cbPotion,0,2,1,1,GridBagConstraints.WEST);
		
		taDetail.setText(guiParser.printCharacter());
		btnHeal.addActionListener(new ButtonListener());
		btnAttack1.addActionListener(new ButtonListener());
		btnAttack2.addActionListener(new ButtonListener());
		btnAttack3.addActionListener(new ButtonListener());

		add(p);
	
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnHeal) {			
					guiParser.healCharacter(cbPotion.getSelectedIndex());
					taDetail.setText(guiParser.printCharacter());

				}

				else if(e.getSource()==btnAttack1){
					JOptionPane.showMessageDialog(null,
						    "Monster is : "+guiParser.getRivalCharacterDetail(),
						    "Cautious!!",
						    JOptionPane.INFORMATION_MESSAGE);
					guiParser.CharacterBattle();
					taDetail.setText(guiParser.printCharacter());

				}
				else if(e.getSource()==btnAttack2){
					JOptionPane.showMessageDialog(null,
						    "Monster is : "+guiParser.getRivalCharacterDetail(),
						    "Cautious!!",
						    JOptionPane.INFORMATION_MESSAGE);
					guiParser.CharacterBattle();
					taDetail.setText(guiParser.printCharacter());

				}
				else if(e.getSource()==btnAttack3){
					JOptionPane.showMessageDialog(null,
						    "BOSS is : "+guiParser.getRivalCharacterDetail(),
						    "Cautious!!",
						    JOptionPane.INFORMATION_MESSAGE);
					guiParser.CharacterBattle();
					taDetail.setText(guiParser.printCharacter());

				}
		}
	}

}
