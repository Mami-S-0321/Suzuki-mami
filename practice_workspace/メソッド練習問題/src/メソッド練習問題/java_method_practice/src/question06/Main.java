/**
 * Employeeクラスを利用して、コンソールから入力された名前とIDとパスワードをEmployeeクラスのフィールドに保存する。
 * LoginCheckクラスを利用して、IDとPassが正しいか判定する。(この時メソッドには、Employeeクラスに保存したIDとPassを渡す)
 * 
 * ▼出力結果(ログイン成功時)
 * ▼お名前を入力してください。
 * 山田太郎
 * ▼IDとパスワードを入力してください。
 * 1111
 * 1234
 * 山田太郎さんはログインに成功しました。
 * 
 * ▼出力結果(ログイン失敗時)
 * ▼お名前を入力してください。
 * 山田太郎
 * ▼IDとパスワードを入力してください。
 * 2222
 * 1234
 * 山田太郎さんはIDかパスワードが間違っています。
 * 
 */
package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("▼お名前を入力してください。");
		
		
		
		System.out.println("▼IDとパスワードを入力してください。");
		
		
		
		


	}

}
