package question18;

public class Question18_01{
	public static void main(String[] args) {
		try {
			throw new TestException("独自例外が発生しました。");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
