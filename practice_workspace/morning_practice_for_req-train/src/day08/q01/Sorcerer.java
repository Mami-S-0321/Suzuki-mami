package day08.q01;


public class Sorcerer extends Magic {
	public Sorcerer(String name) {
		super(name);
	}

	@Override
	public void attack(int mp) {
		super.attack(mp);
		int addDamege = (int) (mp * 0.5);
		System.out.println("追加で" + addDamege + "のダメージを与えた。");

	}


}
