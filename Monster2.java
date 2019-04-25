
public class Monster2 extends Character implements Swimmable {
	private static final int maxGroupHealth = 200;

	public Monster2() {
		super("Monster2",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = CharacterSkill.getCharacterSkill("Dispell");

		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		this.reducedHealth(30);
	}




}
