package question13;

public class Question13_03 {
	public static void main(String[] args) {
		String str = "カエルがゲコゲコとゲコ池で鳴いている。";
		System.out.println(str);
		System.out.println("ゲコという文字は先頭から" + (str.indexOf("ゲコ") + 1) + "番目です");
	}
}
