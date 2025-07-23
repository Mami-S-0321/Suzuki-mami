package day07.q01.anser;

class Drink {

	private String name;
	private int price;

//引数なしのコンストラクタ
	public Drink() {
		this.price = 120;
		this.name = "ビタミン麦茶";
	}

//引数ありのコンストラクタ
	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public void show() {
		System.out.println(this.name + ":" + this.price + "円です。");
	}

}
