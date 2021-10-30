package javaCrossing;

public class CharacterDTO {
	
	private String name;
	private int inventory;
	private int money;
	private int characterDay;
	private int pay;
	private boolean run = true;
	
	public CharacterDTO() {
		
	}
	
	public CharacterDTO(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCharaterDay() {
		return characterDay;
	}

	public void setCharacterDay(int characterDay) {
		this.characterDay = characterDay;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "CharacterDTO [name=" + name + ", inventory=" + inventory + ", money=" + money + ", characterday=" + characterDay
				+ ", pay=" + pay + "]";
	}
	
}
