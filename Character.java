abstract class Character{
	public double maxHealth;
	protected double health;
	protected double exp;
	protected double lv;
	protected String name;
	protected CharacterSkill attackSkill;
	protected String imgPath;


	public Character(String name, double maxHealth){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
		this.exp = 0;
		this.lv = 1;
	}
	public double getHealth(){
		return this.health;
	}
	public String getName(){
		return this.name;
	}
	public double getExp(){
		return this.exp;
	}
	public double getLv(){
		return this.lv;
	}
	public String printAttackSkill() {
		return "Skill : "+attackSkill.getName()+" , Damage : "+attackSkill.getDamage();
	}
	public void eat(Potion potion){
		this.health += potion.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;


	}

	public void attack(Character rival){
		rival.injure(this.attackSkill);
		
	}


	public void injure(CharacterSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health < 0)
			this.health = 0;
		this.exp = this.exp + 2;
        if (this.exp == 6)
        {   
            this.lv = this.lv + 1;
            this.maxHealth += 100;
            this.exp = 0;
        }
	}
	public String getImgPath() {
		return this.imgPath;
	}

	

}
