/**
 * 戻り値の型；int
 * 引数：int型の変数amount　int型の変数payment
 * メソッド名：calc
 * 処理：引数を使用して支払金額から税込み価格にした商品の金額を引く計算
 * 戻り値：int型の変数change
 * 
 * paymentは支払金額
 * amountは税抜きの商品価格
 * 消費税は8%
 */
package question03;

public class Register {
	
	int calc(int amount, int payment) {
		
		int change = payment - (int)(amount * 1.08);
		
		return change;
	}

}
