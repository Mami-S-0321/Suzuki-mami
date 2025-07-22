package day06.q02.anser;

class Depositor {

	private String name;
	private int money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void showData() {
		System.out.println("\n預金者情報を表示します");
		System.out.println("name:" + this.name);
		System.out.println("money:" + this.money);
	}

}
