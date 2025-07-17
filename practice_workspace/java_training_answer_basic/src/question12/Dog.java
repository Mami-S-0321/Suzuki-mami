package question12;

/**
 * 犬クラス
 */
public class Dog {


    /**
     * 名前を表示
     *
     * @param n 名前
     */
	void showName(String n) {
		System.out.println("名前は" + n + "です");
	}

    /**
     * 年齢を表示
     *
     * @param a 年齢
     */
	void showAge(int a) {
		System.out.println("年齢は" + a + "歳です");
	}

    /**
     * 年齢と名前を表示
     *
     * @param a 年齢
     * @param n 名前
     *
     */
	void showProfile(int a,String f) {
		System.out.println("年齢は" + a + "歳、好きな食べ物は" + f + "です");
	}
}
