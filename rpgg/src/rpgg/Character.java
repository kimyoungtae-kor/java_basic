package rpgg;

import monster.Monster;

public abstract class Character {
	public String name;
	public int hp;
	public int attack;
	public int def;
	public int level;
	public int exp;
	public int maxHp;
	
	public Character(String name,int hp,int attack, int def , int maxhp) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.maxHp = maxhp;

	}
	public void attack(Monster monster) {
		int dmg = this.attack - monster.getDefense();
		
		if(dmg > 0) {
			monster.takeDamge(dmg);
			System.out.println(name + "은 "+monster.getName() + " 에게 " + dmg + "데미지를 입혔다!" + name+"남은체력:" +hp);
		}else {
			System.out.println(name + "은 데미지를 입히지못했다!");
		}
	}
	
	public void grow(int exe) {
		this.exp += exe;
		
		int requireExp = (int) (10 * Math.pow(2, level - 1));
		
		
		if (requireExp >= exe) {
			this.exp -= requireExp;
			System.out.println("레벨업!!!");
			level++;
			hp = maxHp;
		}
		
		
	}

}
