/**
 * 問題
 * Strin型のフィールドname
 * int型のフィールドage
 * String型のフィールドdept
 * 上記3つのフィールドを作成してください。
 * 
 * 戻り値・引数なしでscheduleメソッドを作成してください。
 * 処理は標準出力で、以下の文言を出力させるものとします。
 * 
 * ▼出力内容
 * 月曜日は、15:00からチームミーティングがあります。
 */
package question02;

public class Employee {

	//社員名
	String name;

	//年齢
	int age;

	//部署
	String dept;
	
	void schedule () {
		
		System.out.println("月曜日は、15:00からチームミーティングがあります。");
		
	}

}
