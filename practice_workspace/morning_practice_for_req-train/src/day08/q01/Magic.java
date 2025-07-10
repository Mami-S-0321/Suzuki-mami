package day08.q01;

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

}
