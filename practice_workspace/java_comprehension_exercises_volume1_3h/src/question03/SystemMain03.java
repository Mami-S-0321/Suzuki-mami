package question03;

public class SystemMain03 {

	public static void main(String[] args) {
		int price = 30;//値段
		int totalPrice = 300;//合計
		int quantity = (totalPrice /= price);//購入数
		System.out.println("商品の購入数は" + quantity + "個です。");

		int newPrice = (price + 100);//新しい値段
		int changeQuantity  = (quantity - 1);//新しい購入数
		System.out.println("商品の購入数は" + changeQuantity + "個です。");
		 newPrice = (newPrice + price);
		 System.out.println("商品の新しい値段は" + newPrice + "円に変更です。");
		 totalPrice = (newPrice *= quantity);
		 System.out.println("商品の購入合計金額は" + totalPrice + "円です。");

		 double priceIncreaseRate = 1.1;
		 System.out.println("商品の元の値段は" + newPrice + "円です。");
		 int changePrice = (newPrice *= priceIncreaseRate);
		 System.out.println("商品の値上げ後の値段は"+ changePrice + "円です。");


	}

}
