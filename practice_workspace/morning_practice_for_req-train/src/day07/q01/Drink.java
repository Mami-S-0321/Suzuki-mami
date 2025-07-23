package day07.q01;

public class Drink {
	private String name;
	private int price;

	public Drink() {
		this.price = 120;
        this.name = "ビタミン麦茶";

	}

	public Drink(int price,String name) {
		this.price = price;
		this.name = name;

	}
	public void show() {
		System.out.println(this.name + ":" + this.price + "円です。");
	}

}
