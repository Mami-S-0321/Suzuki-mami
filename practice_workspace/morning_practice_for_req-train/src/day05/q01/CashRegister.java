package day05.q01;

public class CashRegister {
	public int calcPrice(int calc) {
		double Price = (int)(calc *= 0.1);
		return (int) Price;
	}

}
