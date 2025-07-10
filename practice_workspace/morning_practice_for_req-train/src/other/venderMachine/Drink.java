package other.venderMachine;

public class Drink {

	private String name;
	private int price;

	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void show() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}

}
