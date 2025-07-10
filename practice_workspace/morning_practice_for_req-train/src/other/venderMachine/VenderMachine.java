package other.venderMachine;

import java.util.ArrayList;
import java.util.List;

public class VenderMachine {

	private List<Drink> drinks;
	private int insertedMoney;

	public VenderMachine() {
		this.drinks = new ArrayList<>();
		drinks.add(new Drink(140, "コーラ"));
		drinks.add(new Drink(210, "レッドブル"));
		drinks.add(new Drink(110, "おーいお茶"));
		drinks.add(new Drink(150, "午後の紅茶"));
		drinks.add(new Drink(128, "本キリン"));
	}

	public void show() {
		System.out.println("\n自動販売機の情報を表示します。");

		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			if (drink!=null) {
				System.out.print((i + 1) + " ");
				drink.show();
			} else {
				System.out.println("売り切れです(;´Д｀)");

			}
		}
	}

	/**
	 * drinksを取得します。
	 * @return drinks
	 */
	public List<Drink> getDrinks() {
	    return drinks;
	}

	/**
	 * drinksを設定します。
	 * @param drinks drinks
	 */
	public void setDrinks(List<Drink> drinks) {
	    this.drinks = drinks;
	}

	/**
	 * insertedMoneyを取得します。
	 * @return insertedMoney
	 */
	public int getInsertedMoney() {
	    return insertedMoney;
	}

	/**
	 * insertedMoneyを設定します。
	 * @param insertedMoney insertedMoney
	 */
	public void setInsertedMoney(int insertedMoney) {
	    this.insertedMoney = insertedMoney;
	}

}
