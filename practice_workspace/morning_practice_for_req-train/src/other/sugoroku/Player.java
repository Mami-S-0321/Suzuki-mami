package other.sugoroku;

public class Player {

	private String name;

	public Player(String name) {
		this.name = name;
		System.out.println("プレイヤーの名前は" + this.name + "です。");
	}

	public void rollDice() {
		System.out.println(this.name + "は、サイコロを振った。");
		Dice dice = new Dice();
		System.out.println("サイコロの目は" + dice.doDice() + "だった。");
	}

	public void rollDice(int choiceNum) {
		System.out.println("サイコロを" + choiceNum + "個、振れるぞ！");

		Dice dice = new Dice();
		int sum = 0;
		for (int i = 0; i < choiceNum; i++) {
			int diceEye = dice.doDice();
			System.out.println("サイコロの目は" + diceEye + "だった。");
			sum += diceEye;
		}
		System.out.println("合計" + sum + "進めるぞ！");

	}

}
