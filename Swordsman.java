
public class Swordsman extends Character implements Swimmable {
	private static final int maxGroupHealth = 500;
	

	public Swordsman() {
		super("Swordsman",maxGroupHealth);
		this.attackSkill = CharacterSkill.getCharacterSkill("Double Casting");
		this.imgPath="images/Swordsman.gif";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		this.reducedHealth(30);
	}



}
