import java.math.RoundingMode;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GUIParser {
	private PlayerClass classPlayer;
	private ArrayList<Character> myCharacter;
	private ArrayList<Character> rivalCharacter;
	private Potion potion;
	
	public GUIParser(String classPlayer) {
		this.classPlayer = new PlayerClass(classPlayer);
		myCharacter = new ArrayList();
		rivalCharacter = new ArrayList();
	}
	public int selectCharacter(String name) {
		int n = JOptionPane.showConfirmDialog(
			    null,
			    "You select: "+name+"?",
			    "Are you sure??",
			    JOptionPane.YES_NO_OPTION);
		 if(n==0) {
			 if(name.equals("Swordsman")) {
				 myCharacter.add(new Swordsman());
			 }
			 else if(name.equals("Archer")) {
				 myCharacter.add(new Archer());
			 }
			 else if(name.equals("Assassin")) {
				 myCharacter.add(new Assassin()); 
			 }
		 }
		 return n;

		}
	public  String  printCharacter(){
		String  detail;
		detail="*****************"+classPlayer.getName()+" s' Character*****************\n";
		for(Character character: myCharacter){
			detail+=""+character.getName()+" health: "+Math.round(character.getHealth())+"/"+Math.round(character.maxHealth)+" \nLevel: "+Math.round(character.getLv())+"\nExp: "+Math.round(character.getExp())+" \n"+character.printAttackSkill();
		}
		return detail;
	}
	public void healCharacter(int b) {
		potion = new Potion(b);
		for(Character character: myCharacter) {
			character.eat(potion);
		}
	}
	public String getImgPath() {
		return myCharacter.get(0).getImgPath();
	}

	public void dicoverRival() {	
		double randomType=Math.random()*10;
			if(randomType < 7) {
				rivalCharacter.add(new Monster1());
			}	
			else {
				rivalCharacter.add(new Monster2());
			} 
	}
	public void CharacterBattle() {
		rivalCharacter.get(0).attack(myCharacter.get(0));
	}
	public String getRivalImgPath() {
		return rivalCharacter.get(0).getImgPath();
	}
	public String getRivalCharacterDetail() {
		return rivalCharacter.get(0).getName()+"\n"+rivalCharacter.get(0).printAttackSkill();
	}
}
	
	
