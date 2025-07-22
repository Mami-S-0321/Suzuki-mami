/**
 * Registerクラスのメソッドを用いてクーポンを所有している場合とクーポンを保有していない場合の計算を行う
 * クーポンの割引率：0.3
 * 購入商品の金額：3500円
 * 支払金額：4000円
 * 
 * クーポン保有しているかどうかはコンソール上から入力できる仕様にしてください。
 * 
 * ▼出力結果(クーポンを保有している場合)
 * クーポンはお持ちですか？
 * 1.はい　　2.いいえ
 * >>1
 * おつりは、1354円です。
 * 
 * ▼出力結果(クーポンを保有していない場合)
 * クーポンはお持ちですか？
 * 1.はい　　2.いいえ
 * >>2
 * おつりは、220円です。
 */
package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Register reg = new Register();
		
	    double coupon = 0.3;
	    int change  = 0;
	    int item = 3500;
	    int pay = 4000;
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("クーポンはお持ちですか？");
		 System.out.println("1.はい　　2.いいえ");
		 System.out.print(">>");
		 
		 int choise = Integer.parseInt(reader.readLine());
		 
		 if(choise == 1) {
			 
			 change = reg.sale(item, pay, coupon);
			 
		 }else {
			 
			 change = reg.calc(item, pay);
		 }
		 
		 System.out.println("おつりは、" + change + "円です。");
		 
	}

}
