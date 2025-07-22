package question19;

public class Question19_01 {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();

		test1.setStr("test1");
		test2.setStr("test2");

		System.out.println("1つ目は" + test1.getStr() + "です");
		System.out.println("2つ目は" + test2.getStr() + "です");
	}
}
