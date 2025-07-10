package other.pakemon;

import java.util.Random;

public class Pakemon {

	// 種族名
	private String tribe_name;
	// 個体値
	private int individual_value;

	// コンストラクタ①名前を選択肢から選ぶ
	public Pakemon(int nameNum) {
		switch (nameNum) {
		case 1:
			tribe_name = "ビトカゲ";
			break;
		case 2:
			tribe_name = "ゼヌガメ";
			break;
		case 3:
			tribe_name = "フサギダネ";
			break;
		}
		this.individual_value = new Random().nextInt(31) + 1;

		System.out.println("種族名は" + tribe_name + "です。");
		evaluate();
	}

	// コンストラクタ②名前を自分で決める
	public Pakemon(String tribe_name) {
		this.tribe_name = tribe_name;
		this.individual_value = new Random().nextInt(31) + 1;// Math.random()*31+1;でもOK

		System.out.println("種族名は" + tribe_name + "です。");
		evaluate();
	}

	// 評価メソッド。このクラス内でしか使わないため、privateとする。
	private void evaluate() {
		if (individual_value == 31) {
			System.out.println("この個体は最高です。");
		} else if (individual_value >= 16 && 30 >= individual_value) {
			System.out.println("この個体は素晴らしい");
		} else if (individual_value >= 1 && 15 >= individual_value) {
			System.out.println("この個体はまあまあです。");
		} else {
			System.out.println("不正な値です。");
		}

	}

}
