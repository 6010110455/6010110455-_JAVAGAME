public class CharacterSkill{
	private String name;
	private float damage;

	public CharacterSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static CharacterSkill getCharacterSkill(String name){
		CharacterSkill skill = null;
		switch(name.toLowerCase()){
			case "double casting":
				skill = new CharacterSkill("Double Casting",100);
				break;
			case "dispell":
				skill = new CharacterSkill("Dispell",90);
				break;
			case "safety wall":
				skill = new CharacterSkill("Safety Wall",40);
				break;
			case "spider web":
				skill = new CharacterSkill("spider Web",50);
				break;
			case "fire ball":
				skill = new CharacterSkill("Fire Ball", 60);
				break;
		}
		return skill;
	}
}
