package question13;

public class Question13_03 {

	public static void main(String[] args) {
		String frog = "カエルがゲコゲコとゲコ池で鳴いている。";

		System.out.println(frog);
		System.out.println("ゲコという文字は先頭から" + (frog.indexOf("ゲコ") + 1) + "番目です");

	}

}
