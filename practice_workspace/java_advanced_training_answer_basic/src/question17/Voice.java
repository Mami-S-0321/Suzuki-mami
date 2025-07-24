package question17;

/**
 * 声クラス
 */
public class Voice implements Talk_1 {
	/**
	 * 吠える
	 */
	public void bark() {
		System.out.println("犬が吠えました");
	}

	/**
	 * 鳴く
	 */
	public void cry() {
		System.out.println("猫が鳴きました");
	}
}
