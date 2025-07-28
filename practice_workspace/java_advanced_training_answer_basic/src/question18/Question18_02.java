package question18;

public class Question18_02 {
	public static void main(String[] args) throws TestException {
		try {
			int[] numArray = new int[5];

			numArray[10] = 3;

		} catch (Exception e) {
			throw new TestException();
		}
	}
}
