/**
 * public
 * 戻り値の型：String
 * メソッド名：loginCheck
 * 引数：int型の変数id  int型の変数pass
 * 処理：引数を用いてidが1111でpassが1234の場合は"ログインに成功しました。"
 * 　　　それ以外の場合は"IDかパスワードが間違っています。"
 * 戻り値：String型の変数result
 */
package question06;

public class LoginCheck {
	
	
	public String loginCheck(int id, int pass) {
		
		String result;
		
		if(id == 1111 && pass == 1234) {
			result = "ログインに成功しました。";
		}else {
			result = "IDかパスワードが間違っています。"; 
		}
		
		return result;
		
	}

}
