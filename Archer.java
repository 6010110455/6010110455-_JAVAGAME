public class Archer extends Character implements Runnable{
	private static final int maxGroupHealth = 200;
	public Archer() {
		super("Archer",
			      maxGroupHealth);

			this.attackSkill = CharacterSkill.getCharacterSkill("Safety Wall");
			this.imgPath="images/Archer.gif";
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