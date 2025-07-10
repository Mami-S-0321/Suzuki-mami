package day10.q01;

public class Account {

	private String name = "suzuki";
	private int pin = 1234;
	private int balance = 2000000;

	public String getName() {
		return name;
	}

	public void showAccount() {
		System.out.println(name + "様の個人情報を表示します");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", pin=****" + ", balance=" + balance + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
