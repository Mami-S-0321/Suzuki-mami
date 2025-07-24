package day08.q02.anser;

public class Monster {
	private String name;
	private int hp;

	public Monster(String name, int hp) throws InterruptedException {
		this.name = name;
		this.hp = hp;
		System.out.println(name + "が現れた！！");
		System.out.println(toString());
		Thread.sleep(1000);// 1秒停止
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
