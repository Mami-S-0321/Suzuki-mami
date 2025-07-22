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
		
		Employee emp = new Employee();
		LoginCheck login = new LoginCheck();
		boolean result = false;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("▼お名前を入力してください。");
		
		//String str = reader.readLin();
		//emp.setName(str);
		//上記2行でも可
		emp.setName(reader.readLine());
		
		
		
		do {
			
			System.out.println("▼IDとパスワードを入力してください。");
			
			//String a = reader.readLin();
			//int id = Integer.parseInt(a);
			//emp.setId(id);
			//上記3行でも可
			emp.setId(Integer.parseInt(reader.readLine()));
			
			//String b = reader.readLin();
			//int pass = Integer.parseInt(b);
			//emp.setPass(pass);
			//上記3行でも可		
			emp.setPass(Integer.parseInt(reader.readLine()));
			
		    result = login.loginCheck(emp.getId(), emp.getPass());
		    
		    if(result){
		    	
		    	System.out.println(emp.getName() + "さんログイン成功です。");
		    	break;
		    }
		    
		    System.out.println("IDかパスワードが間違っています。");
			
		} while (!result);
		
		
		
		
		


	}

}
