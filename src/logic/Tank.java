package logic;

public class Tank extends Hero{
	
	private int armor;
	
	public Tank(String name, int power, int hp, int armor) {
		super(name, power, hp);
		this.armor = armor;
	}
	
	public int takeDamage(int damage) {
		if(damage - armor >= 0) {
			damage -= armor;
		} else {
			damage = 0;			
		}
		if(hp - damage < 0) {
			hp = 0;
		} else {
			hp -= damage;			
		}
		return (damage);
	}
	
	public int takePiercingDamage(int damage) {
		if(hp - damage < 0) {
			hp = 0;
		} else {
			hp -= damage;			
		}
		return (damage);
	}
	
	public String printStat() {
		return ("[atk:"+power+" hp:"+hp+" armor:"+armor);
	}
	
	public int getArmor() {
		return armor;
	}
}