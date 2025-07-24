package question22;

public class Question22_02 {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		Frog frog2 = new Frog();

		// オブジェクトを参照渡しした場合
		// Frog frog1 = new Frog();
		// Frog frog2 = frog1;

		if (frog1.equals(frog2)) {
			System.out.println("変数frog1とfrog2は同じものです");
		} else {
			System.out.println("変数frog1とfrog2は違うものです");
		}
	}
}
