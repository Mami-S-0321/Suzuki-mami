/**
 * Registerクラスのcalcメソッドを呼び出し、お釣りを出力する。
 * 支払金額：2000円
 * 税抜き価格の商品：1500円
 * 
 * ▼出力結果
 * おつりは、380円です。
 */
package question03;

public class Main {
	public static void main(String[] args) {

		Register reg = new Register();
		
		int change = reg.calc(1500, 2000);
		
		System.out.println("おつりは、" + change + "円です。");

	}

}
