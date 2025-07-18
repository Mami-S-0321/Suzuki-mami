package day05.q1.anser;

class CashRegister {

	int calcPrice(int cost) {

		int priceIncludeTax = (int) (cost * 1.1);
		return priceIncludeTax;

	}

}
