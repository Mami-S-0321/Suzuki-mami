package other.venderMachine;

import java.util.List;
import java.util.Random;

public class Human {

	private String name;
	private int money;
	private Drink drink;

	public Human(String name) {
		this.name = name;
		money = new Random().nextInt(1000) + 100;
		System.out.println(this.name + "さんが自動販売機に来た。");
	}

	public void insertCoin(VenderMachine venderMachine) {
		System.out.println("現在" + money + "円、持っています。");
		System.out.println("いくら自動販売機に入れますか??");
		Input input = new Input();

		while (true) {

			int inputMoney = input.number();

			if (inputMoney == 0) {
				System.err.print("不正な値です。入力をやり直してください。\n>");
				continue;
			} else if (money > inputMoney) {
				System.out.println(inputMoney + "円を入金しました。");
				money -= inputMoney;
				venderMachine.setInsertedMoney(venderMachine.getInsertedMoney() + inputMoney);
				break;
			}

			System.err.println("お金が不足しています。");
			System.err.print("もう一度入金金額を入力して下さい。\n>");
		}
	}

	public void buyDrink(VenderMachine vMachine) {
		Input input = new Input();

		while (true) {
			System.out.println("購入する商品を選んで下さい。");
			vMachine.show();
			int choice = input.number();
			if (vMachine.getDrinks().get(choice - 1).getPrice() > vMachine.getInsertedMoney()) {
				System.out.println("金額が不足しています。");
				insertCoin(vMachine);
				continue;
			}

			if (choice == 0) {
				System.err.print("不正な値です。入力をやり直してください。\n>");
				continue;
			} else if (1 <= choice && choice <= 5) {
				List<Drink> drinks = vMachine.getDrinks();
				this.drink = drinks.get(choice - 1);
				drinks.set(choice - 1, null);
				int change = vMachine.getInsertedMoney() - drink.getPrice();
				System.out.println("おつりが" + change + "円、返ってきました");
				this.money += change;
				vMachine.setInsertedMoney(0);
				break;
			}

			System.err.println("商品が存在しません。");
			System.err.print("1から5を入力して下さい。\n>");
		}

	}

	public void show() {

		if (this.drink == null) {
			System.out.println("商品をまだ買っていません");
		} else {
			System.out.println("\n購入した商品を表示します。");
			drink.show();
			System.out.println("残金は" + money + "円です");

		}

	}

}
