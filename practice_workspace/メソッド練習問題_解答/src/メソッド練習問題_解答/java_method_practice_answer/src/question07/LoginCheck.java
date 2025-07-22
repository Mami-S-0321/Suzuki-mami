/**
 * public
 * 戻り値の型：boolean
 * メソッド名：loginCheck
 * 引数：int型の変数id  int型の変数pass
 * 処理：引数を用いてidが1111でpassが1234の場合はtrue
 * 　　　それ以外の場合はfalse
 * 戻り値：boolean型の変数result
 */
package question07;

public class LoginCheck {
	
	
	public boolean loginCheck(int id, int pass) {
		
		boolean result;
		
		if(id == 1111 && pass == 1234) {
			result = true;
		}else {
			result = false; 
		}
		
		return result;
		
	}

}
