/**
 * Employeeクラスのnameフィールドに山田花子を代入
 * scheduleメソッドも呼び出して出力結果が以下になるようにしてください。
 * 
 * ▼出力結果
 * 山田花子さんの月曜日の予定を教えてください。
 * 月曜日は、15:00からチームミーティングがあります。
 */
package question02;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.name = "山田花子";
		
		System.out.println(emp.name+ "さんの月曜日の予定を教えてください。");
		
		emp.schedule();

	}

}
