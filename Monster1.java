
public class Monster1 extends Character implements Swimmable {
	private static final int maxGroupHealth = 200;

	public Monster1() {
		super("Monster1",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = CharacterSkill.getCharacterSkill("Spider Web");

		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		this.reducedHealth(30);
	}



}
