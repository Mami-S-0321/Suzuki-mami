package question10;

public class Question10_01 {
	public static void main(String[] args) {
		Profile profile = new Profile();

		profile.setName("マイケル");
		profile.setAge(20);

		System.out.println("私の名前は" + profile.getName() + "です");
		System.out.println("年齢は" + profile.getAge() + "歳です");
	}
}
