package question14;

/**
 * 継承クラス
 */
public class Inheritance {
	/** 趣味 */
	private String hobby;

	/**
	 * コンストラクタ
	 */
	Inheritance() {
		System.out.println("Inheritanceクラスのコンストラクタが実行されました");
	}

	/**
	 * 趣味を設定
	 *
	 * @param hobby 趣味
	 */
	void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/**
	 * 趣味を取得
	 *
	 * @return 趣味
	 */
	String getHobby() {
		return hobby;
	}
}
