package question10;

/**
 * プロフィールクラス
 */
public class Profile {
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;

	/**
	 * 名前を取得
	 *
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を設定
	 *
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢を取得
	 *
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 年齢を設定
	 *
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
