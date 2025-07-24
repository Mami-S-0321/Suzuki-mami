package day08.q01.anser;

import day08.q02.anser.Monster;

public class Sorcerer extends Magic {

	// 問題解答
	public Sorcerer(String name) {
		super(name);
	}

	@Override
	public void attack(int mp) {
		super.attack(mp);
		int addDamege = (int) (mp * 0.5);
		System.out.println("追加で" + addDamege + "のダメージを与えた。");

	}

	// 追加問題解答
	@Override
	public void attack(int mp, Monster monster) {
		super.attack(mp, monster);
		int addDamege = (int) (mp * 0.5);
		System.out.println("追加で" + addDamege + "のダメージを与えた。");
		int monsterHP = monster.getHp() - addDamege;
		monster.setHp(monsterHP);

	}

}
