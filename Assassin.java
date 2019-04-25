public class Assassin extends Character implements Runnable{
	private static final int maxGroupHealth = 300;
	public Assassin() {
		super("Assassin",
			      maxGroupHealth);

			this.attackSkill = CharacterSkill.getCharacterSkill("Fire Ball");
			this.imgPath="images/Assassin.gif";
	}	
	public void move(){
		this.run();
	}
	public void run(){
		this.reducedHealth(10);
	}
	public void walk(){
		this.reducedHealth(1);
	}
}