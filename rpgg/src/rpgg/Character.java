package rpgg;

import monster.Monster;

public abstract class Character {
	public String name;
	public int hp;
	public int attack;
	public int def;
	public int level;
	public int exe;
	
	public Character(String name,int hp,int attack, int def) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.level = 1;
		this.exe = 0;
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

}
