package question19;

import java.util.ArrayList;
import java.util.List;

public class Question19_02 {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setName("鈴木太郎");
		user1.setAge(23);
		users.add(user1);
		
		User user2 = new User();
		user2.setName("渡辺花子");
		user2.setAge(25);
		users.add(user2);
		
		User user3 = new User();
		user3.setName("田中次郎");
		user3.setAge(27);
		users.add(user3);
		
		for(User user : users) {
			System.out.println("氏名は" + user.getName() + "、年齢は" + user.getAge() + "歳です。");
		}
	}
}
