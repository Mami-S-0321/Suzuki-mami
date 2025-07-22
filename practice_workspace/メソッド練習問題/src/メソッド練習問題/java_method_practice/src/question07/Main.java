/**
 * Employeeクラスを利用して、コンソールから入力された名前とIDとパスワードをEmployeeクラスのフィールドに保存する。
 * LoginCheckクラスを利用して、IDとPassが正しいか判定する。(この時メソッドには、Employeeクラスに保存したIDとPassを渡す)
 * また、ログインが成功するまでIDとPassの入力と判定は繰り返すものとする
 * 
 * ▼出力結果(ログイン成功時)
 * ▼お名前を入力してください。
 * 山田太郎
 * ▼IDとパスワードを入力してください。
 * 1111
 * 1234
 * 山田太郎さんはログインに成功です。
 * 
 * ▼出力結果(ログイン失敗時)
 * ▼お名前を入力してください。
 * 山田太郎
 * ▼IDとパスワードを入力してください。
 * 2222
 * 1234
 * IDかパスワードが間違っています。
 * ▼IDとパスワードを入力してください。
 * 1111
 * 1234
 * 山田太郎さんログイン成功です。
 */
package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		
		


	}

}
