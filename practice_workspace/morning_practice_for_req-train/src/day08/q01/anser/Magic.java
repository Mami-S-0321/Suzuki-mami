package day08.q01.anser;

import day08.q02.anser.Monster;

public class Magic {
	private String name;

	// 問題解答
	public Magic(String name) {
		this.name = name;
	}

	public void attack(int mp) {
		System.out.println("\n" + name + "の攻撃！！");
		int damege = (int) (Math.random() * mp) + 10;
		System.out.println("相手に" + damege + "のダメージ！！");
	}

	// 追加問題解答
	public void attack(int mp, Monster monster) {
		System.out.println("\n" + name + "の攻撃！！");
		int damege = (int) (Math.random() * mp) + 10;
		// 「モンスター名に・・・のダメージ」と表示
		System.out.println(monster.getName() + "に" + damege + "のダメージ！！");
		// モンスターのHPを取得し、ダメージを減らしてからセットしなおす。
		int monsterHP = monster.getHp() - damege;
		monster.setHp(monsterHP);
	}

}
