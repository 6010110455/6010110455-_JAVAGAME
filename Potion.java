public class Potion{
	private String name;
	private float restoreValue;
	private int type;

	public Potion(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Potion";
				this.restoreValue = 10;
				break;
			case 1: this.name = "GoodPotion";
				this.restoreValue = 50;
				break;
			case 2: this.name = "SuperPotion";
				this.restoreValue = 90;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
}

